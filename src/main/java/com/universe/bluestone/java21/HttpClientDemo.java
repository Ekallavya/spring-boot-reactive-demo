package com.universe.bluestone.java21;

public class HttpClientDemo {
    public static void main(String[] args) {
            var client = java.net.http.HttpClient.newHttpClient();
            var request = java.net.http.HttpRequest.newBuilder()
                    .uri(java.net.URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                    .build();

            client.sendAsync(request, java.net.http.HttpResponse.BodyHandlers.ofString())
                    .thenApply(java.net.http.HttpResponse::body)
                    .thenAccept(System.out::println)
                    .join();
    }
}
