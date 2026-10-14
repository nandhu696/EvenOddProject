package com.example;
public class App {
    public String evenOrOdd(int number) { return number % 2 == 0 ? "Even" : "Odd"; }
    public static void main(String[] args) { System.out.println(new App().evenOrOdd(7)); }
}