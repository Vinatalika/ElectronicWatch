package com.epam.main.learn;

import java.util.Scanner;

/*Перейдіть до класу MeetAnAgent і напишіть програму, яка:
запитує на вхід число-пароль
якщо воно дорівнює секретній кількості, програма виводить: "Hello, Agent"
інакше друкує: "Access denied".
Секретний пароль зберігається в final static int password. 133976*/
public class MeetAgent {
    final static int password = 133976;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число - пароль");
        int a = scan.nextInt();
        if (a == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
