package com.example;

/**
 * Hello world!
 */
public class App {
    public String getGreeting() {
        return "Hello, Maven!";
    }
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
    }
}

