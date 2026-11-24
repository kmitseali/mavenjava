package com.example;

public class App {
    public static int add(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        System.out.println("Hello from the Maven Java application!");
        System.out.println("2 + 3 = " + add(2, 3));
    }
}
