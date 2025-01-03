package com.kanayaya.BitrixFluentWebhooks;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class IMMethodParser {
    private static final String FILENAME = "methods.txt";
    public static final String URLS_FILE = "imUrls.txt";
    private static final Function<String, Connection> connectionProvider = url ->
            Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36")
                    .followRedirects(true);

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(MethodParserCLI.class.getClassLoader().getResourceAsStream(URLS_FILE)));
        int lines = 0;
        int count = 0;
        while (reader.readLine() != null) lines++;
        reader.close();

        File file = new File(FILENAME);
        if ( ! file.exists()) file.createNewFile();

        final Scanner scanner = new Scanner(MethodParserCLI.class.getClassLoader().getResourceAsStream(URLS_FILE));
        String url = scanner.nextLine();

        while (count < lines) {
            Document d = connectionProvider.apply(url).get();
            String urlToWrite = "\n// " + d.select("h2.courses-post-title").first().text() + ": " + url + "\n\n";
            System.out.print(urlToWrite);
            write(urlToWrite);
            Elements methodsTables = d.select("table[width=\"700\"], table[width=\"600\"]");
            Elements rows = methodsTables.select("tr[bgcolor=\"white\"], tr[bgcolor=\"#F2F2F2\"]");

            for (Element row : rows) {
                Map<String, String> params = getParams(row);
                MethodParserCLI.Method method = new MethodParserCLI.Method(row.children().first().text(), row.children().last().text(), params);
                write(method.toEnumString());
            }


            count++;
            System.out.println("Done " + count + "/" + lines);
            url = scanner.nextLine();
        }
    }

    private static void write(String s) throws IOException {
        Files.write(
                Paths.get(FILENAME),
                s.getBytes(),
                StandardOpenOption.APPEND);
    }
    private static Map<String, String> getParams(Element row) throws IOException {
        Map<String, String> result = new HashMap<>();
        String href = row.select("a").attr("href");
        String url = (href.toLowerCase(Locale.ROOT).startsWith("http")? "" : "https://dev.1c-bitrix.ru") + href;
        Elements paramTables = connectionProvider.apply(url).get().select("table[cellpadding=\"6\"]");
        Elements params = paramTables.select("tr[bgcolor=\"white\"], tr[bgcolor=\"#F2F2F2\"]");

        for (Element param :
                params) {
            if (param.children().size() < 5) continue;
            String name = param.firstElementChild().text();
            String description = param.children().get(3).text();
            String example = param.children().get(1).text();
            String revision = param.children().get(4).text();
            String required = param.children().get(2).text();

            result.put(name, description + ". <b>Обязательный: </b>" + required + ". <b>Пример:</b> {@code " + example + "}. <b>С ревизии:</b> " + revision);
        }
        return result.isEmpty()? null : result;
    }
}
