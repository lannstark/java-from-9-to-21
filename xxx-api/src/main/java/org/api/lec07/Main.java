package org.api.lec07;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) throws Exception {
    var client = HttpClient.newHttpClient();

    var request = HttpRequest.newBuilder(URI.create("https://postman-echo.com/post"))
        .POST(HttpRequest.BodyPublishers.ofString("{\"num\": 1}"))
        .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    printlnWithThread(response.statusCode());
    printlnWithThread(response.body());

    client.close();
  }

  private static void printlnWithThread(Object obj) {
    System.out.printf("%s %s\n", Thread.currentThread().getName(), obj);
  }


  public static void httpClientAsyncExample() {
    var client = HttpClient.newHttpClient();

    var request = HttpRequest.newBuilder(URI.create("https://postman-echo.com/get"))
        .GET()
        .build();

    client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        .thenAccept((response) -> {
          printlnWithThread(response.statusCode());
          printlnWithThread(response.body());
        });

    client.close();
  }

  public static void httpClientSyncExample() throws Exception {
    var client = HttpClient.newHttpClient();

    var request = HttpRequest.newBuilder(URI.create("https://postman-echo.com/get"))
        .GET()
        .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    printlnWithThread(response.statusCode());
    printlnWithThread(response.body());

    client.close();
  }


  public static void readStringExample() throws Exception {
    var path = Paths.get(Paths.get(".").toAbsolutePath() + "/xxx-api/test.txt");
    String str = Files.readString(path);
    System.out.println(str);
  }

  public static void repeatExample() {
    String str = "A ";

    System.out.println(str.repeat(3));
  }

  public static void linesExample() {
    String str = "A\nB";

    str.lines()
        .forEach(System.out::println);
  }

  public static void stripExample() {
    String str = "   A BC ";
    System.out.println(str.strip());
  }
}
