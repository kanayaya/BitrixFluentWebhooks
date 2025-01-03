package com.kanayaya.BitrixFluentWebhooks;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodParserCLI {
    private static final String filename = "methods.txt";
    private static final Function<String, Connection> connectionProvider = url ->
            Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36")
                    .followRedirects(true);


    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to bitrix methods scraper!");
        System.out.println("go to https://dev.1c-bitrix.ru/rest_help/, drop to page with methods table, then copy it here:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(MethodParserCLI.class.getClassLoader().getResourceAsStream("urls.txt")));
        int lines = 0;
        int count = 0;
        while (reader.readLine() != null) lines++;
        reader.close();


        final Scanner scanner = new Scanner(MethodParserCLI.class.getClassLoader().getResourceAsStream("urls.txt"));

        String url = scanner.nextLine();
        File file = new File(filename);
        if ( ! file.exists()) file.createNewFile();
        while (url != null && ! url.isEmpty() && ! url.equalsIgnoreCase("q")) {
            Document d = connectionProvider.apply(url).get();

            String urlToWrite = "\n// " + d.select("h1.document-name").first().text() + ": " + url + "\n\n";
            Files.write(
                    Paths.get(filename),
                    urlToWrite.getBytes(),
                    StandardOpenOption.APPEND);
            System.out.println(urlToWrite);

            Element methodsTable = getMethodsTable(d.select("table.tnormal"));
            if (methodsTable == null) continue;

            Element tableBody = methodsTable.firstElementChild();
            for (Element row : tableBody.children()) {
                if (row.firstElementChild() == null || "th".equals(row.firstElementChild().tagName())) continue;
                try {
                    System.out.println(row.firstElementChild().text());
                    Files.write(
                        Paths.get(filename),
                        new Method(row.firstElementChild().text(), row.children().get(1).text(), getParameters(row)).toEnumString().getBytes(),
                        StandardOpenOption.APPEND);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            count++;
            System.out.println("Done " + count + "/" + lines);
            if (count == lines) break;
            url = scanner.nextLine();
        }
        System.out.println("farewell");
    }

    static class Method {
        private final String name;
        private final String description;
        private final Map<String, String> params;

        public Method(String name, String description, Map<String, String> params) {
            this.name = name;
            this.description = description;
            this.params = params;
        }
        public String toEnumString() {
            String javadoc = "/** " + description + "<br>\n" +
                    (params == null? "" : ("* Параметры:<br>\n")) +
                    (params == null? "" : "* " + (params.entrySet().stream().map(e -> "{@code " + e.getKey() + "} - " + e.getValue()).collect(Collectors.joining("<br>\n* "))) + "<br>\n") +
                    "*/\n";
            String body = name.trim().toUpperCase().replace('.', '_').replace("*", "ANY") + "(\"" + name + "\"),\n";
            return (javadoc.length() < 13? "" : javadoc) + body;
        }
    }
    private static Map<String, String> getParameters(Element row) throws IOException {
        String href = row.select("a").attr("href");
        String url = (href.toLowerCase(Locale.ROOT).startsWith("http")? "" : "https://dev.1c-bitrix.ru") + href;
        Document d = connectionProvider.apply(url).get();

        Element tableBody = Optional.ofNullable(d.select("table.tnormal")).map(MethodParserCLI::getParametersTable).map(Element::firstElementChild).orElse(null);

        if (tableBody == null) return null;

        Elements headers = tableBody.select("th");

        int nameColumn = IntStream.range(0, headers.size())
                .filter(i -> headers.get(i).text().toLowerCase(Locale.ROOT).contains("параметр"))
                .findAny().orElse(0);
        int descriptionCode = IntStream.range(0, headers.size())
                .filter(i -> headers.get(i).text().toLowerCase(Locale.ROOT).contains("описание"))
                .findAny().orElse(1);
        int typeCode = IntStream.range(0, headers.size())
                .filter(i -> headers.get(i).text().toLowerCase(Locale.ROOT).contains("тип"))
                .findAny().orElse(-1);
        int sinceCode = IntStream.range(0, headers.size())
                .filter(i -> headers.get(i).text().toLowerCase(Locale.ROOT).contains("верси"))
                .findAny().orElse(-1);
        int requiredCode = IntStream.range(0, headers.size())
                .filter(i -> headers.get(i).text().toLowerCase(Locale.ROOT).contains("обязат"))
                .findAny().orElse(-1);


        Element currentRow = null;
        Map<String, String> params = new HashMap<>();
        try {
            for (Element parameter : tableBody.children()) {
                if (parameter.children().size() < 2) continue;
                currentRow = parameter;
                if (parameter.firstElementChild() == null || "th".equals(parameter.firstElementChild().tagName())) continue;
                params.put(parameter.children().get(nameColumn).text() +
                                (typeCode < 0 || parameter.children().size() <= typeCode? "" : ": " + parameter.children().get(typeCode).text()),
                        parameter.children().get(descriptionCode).text() +
                                (sinceCode > 0 && parameter.children().size() > sinceCode && ! parameter.children().get(sinceCode).text().trim().isEmpty()?
                                        ", с версии " + parameter.children().get(sinceCode).text() : "") +
                                (requiredCode > 0 && parameter.children().size() > requiredCode && ! parameter.children().get(requiredCode).text().trim().isEmpty()?
                                        ", обязательный: " + parameter.children().get(requiredCode).text() : ""
                                ));
            }
        } catch (Exception e) {
            System.out.println(headers.stream().map(Element::text).collect(Collectors.joining("\n")));
            System.out.println(currentRow);
            throw e;
        }
        return params.isEmpty()? null : params;
    }

    private static Element getMethodsTable(Elements elements) {
        for (Element e :
                elements) {
            if (e.select("th").stream().anyMatch(header -> header.text().toLowerCase(Locale.ROOT).contains("метод") || header.text().toLowerCase(Locale.ROOT).contains("функиця"))) {
                return e;
            }
        }
        return elements.first();
    }
    private static Element getParametersTable(Elements elements) {
        for (Element e :
                elements) {
            Elements headers = e.select("th");
            if (headers.stream().noneMatch(header -> header.text().toLowerCase(Locale.ROOT).contains("код")) &&
                    headers.stream().anyMatch(header -> header.text().toLowerCase(Locale.ROOT).contains("параметр"))) {
                return e;
            }
        }
        return null;
    }
}
