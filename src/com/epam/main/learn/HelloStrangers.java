package com.epam.main.learn;
/* Перейдіть до класу HelloStrangers та напишіть просту програму, яка:
запитує кількість незнайомців, з якими потрібно зустрітися
рядково читає імена незнайомців
по рядках виводить: "Hello, (ім'я незнайомця)" для кожного незнайомця.
Гарантується, що введена кількість незнайомців — ціле число.
Часткові випадки:
Якщо кількість незнайомців дорівнює нулю, програма повинна вивести: "Oh, it looks like there is no one here".
Якщо кількість незнайомців є від'ємною, програма повинна вивести: "Seriously? Why so negative?".
*/

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kilkist = scan.nextInt();
        scan.nextLine();
        if (kilkist == 0){
            System.out.println("Oh, it looks like there is no one here");
        } else if (kilkist < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            for (int i = 0; i < kilkist; i++) {
                String name = scan.nextLine();
                System.out.println("Hello, " + name);
            }
        }
    }
}
