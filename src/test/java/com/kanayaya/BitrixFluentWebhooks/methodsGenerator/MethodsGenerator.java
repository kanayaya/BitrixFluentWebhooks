package com.kanayaya.BitrixFluentWebhooks.methodsGenerator;

import com.kanayaya.BitrixFluentWebhooks.api.Method;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodsGenerator {
    public static final String PATH = "z_generated/methods";
    private static Map<String, MethodPart> mps = new HashMap<>();

    public static void main(String[] args) {
        Arrays.stream(Method.values()).forEach(
                method -> {
                    String[] parts = method.getName().split("\\.");
                    int childIndex = 0;

                    mps.compute(
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
        );
        List<String[]> collect = mps.values().stream().filter(MethodPart::hasChildren)
                .map(mp -> mp.fieldDeclaration("com.kanayaya.BitrixFluentWebhooks.api.methods")).collect(Collectors.toList());
        collect.forEach(e -> System.out.println(e[0]));
        System.out.println("\n");
        collect.forEach(e -> System.out.println(e[1]));
        collect.forEach(e -> System.out.println(e[2]));
        mps.values().stream().filter(MethodPart::hasOwnMethod)
                .forEach(mp -> System.out.println(mp.methodDeclaration()));
    }
}
