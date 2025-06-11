package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, what would you like to do?");
        AppController appController = new AppController();
        appController.showMenu();
    }
}