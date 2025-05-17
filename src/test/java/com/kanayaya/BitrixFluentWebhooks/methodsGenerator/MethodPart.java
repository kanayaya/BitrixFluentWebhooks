package com.kanayaya.BitrixFluentWebhooks.methodsGenerator;

import com.kanayaya.BitrixFluentWebhooks.api.Invoker;
import com.kanayaya.BitrixFluentWebhooks.api.Method;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodPart {
    private final Map<String, MethodPart> children = new HashMap<>();
    private boolean ending = false;
    private final Method method;
    private final int index;
    public MethodPart(Method method, int partIndex) {
        index = partIndex;
        this.method = method;
        addChildren(method, partIndex);
    }
    public void addChildren(Method method, int partIndex) {
        String[] parts = method.getName().split("\\.");
        int childIndex = partIndex + 1;
        if (parts.length <= childIndex) {
            ending = true;
        } else {
            children.compute(
                parts[childIndex], (part, child) -> {
                    if (child == null) {
                        return new MethodPart(method, childIndex);
                    } else {
                        child.addChildren(method, childIndex);
                        return child;
                    }
                }
            );
        }
    }
    public boolean hasChildren() {
        return ! children.isEmpty();
    }
    public boolean hasOwnMethod() {
        return ending;
    }
    public void writeClassDefinition(String basePackage) {
        if (! hasChildren()) {
            throw new IllegalStateException("To make own class part should have children");
        }
        String[] split = method.getName().split("\\.");
        String partName = split[index];
        String remainingPackage = Stream.of(split).limit(index).collect(Collectors.joining("."));
        String aPackage = basePackage + (remainingPackage.isEmpty()? "" : "." + remainingPackage);
        String className = partName.substring(0, 1).toUpperCase() + partName.substring(1);

        List<String[]> definitions = children.values().stream().filter(MethodPart::hasChildren)
                .map(c -> c.fieldDeclaration(basePackage)).collect(Collectors.toList());
        String imports = definitions.stream().map(e -> "    " + e[0]).collect(Collectors.joining("\n"));
        String fields = definitions.stream().map(e -> "    " + e[1]).collect(Collectors.joining("\n"));
        String fieldsInits = definitions.stream().map(e -> "        " + e[2]).collect(Collectors.joining("\n"));
        String methods = children.values().stream().filter(MethodPart::hasOwnMethod)
                .map(c -> "    " + c.methodDeclaration()).collect(Collectors.joining("\n"));
        String cd = "package ${package};\n" +
                "\n" +
                "import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;\n" +
                "${imports}\n" +
                "\n" +
                "public class ${className} {\n" +
                "private final BitrixRestClient client;\n" +
                "${fields}\n" +
                "\n" +
                "    public ${className}(BitrixRestClient client) {\n" +
                "        this.client = client;\n" +
                "${fieldsInits}" +
                "    }\n" +
                "\n" +
                "${methods}\n" +
                "}";
        cd = cd.replace("${package}", aPackage)
                .replace("${imports}", imports)
                .replace("${className}", className)
                .replace("${fields}", fields)
                .replace("${fieldsInits}", fieldsInits)
                .replace("${methods}", methods);
        String folder = MethodsGenerator.PATH + "/" + (remainingPackage.isEmpty() ? remainingPackage : remainingPackage.replace(".", "/") + "/");
        String path = folder + className + ".java";
        new File(folder).mkdirs();
        try {
            Files.write(Paths.get(path),
                    cd.getBytes(),
                    StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String methodDeclaration() {
        if (! hasOwnMethod()) {
            throw new IllegalStateException("To make method part should have own method");
        }
        String[] split = method.getName().split("\\.");
        String partName = split[index];
        return "// public void " + partName + "() {}  " + method.getClass().getName() + "#" + method.name();
    }
    public String[] fieldDeclaration(String basePackage) {
        if (! hasChildren()) {
            throw new IllegalStateException("To make field definition part should have children");
        }
        writeClassDefinition(basePackage);
        String[] split = method.getName().split("\\.");
        String partName = split[index];
        String remainingPackage = Stream.of(split).limit(index).collect(Collectors.joining("."));
        if (! remainingPackage.isEmpty()) remainingPackage = remainingPackage + ".";
        String className = partName.substring(0, 1).toUpperCase() + partName.substring(1);
        return new String[]{
                "import " + basePackage + "." + remainingPackage + className + ";",
                "public final " + className + " " + partName + ";",
                partName + " = new " + className + "(client);"
        };
    }
}
