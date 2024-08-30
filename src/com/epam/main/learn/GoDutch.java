package com.epam.main.learn;
/*компанія друзів відвідує ресторан.
Вони вирішили розділити рахунок порівну та додати 10 відсотків від загальної суми рахунку
як чайові. Далі друзі покривають рівними частинами загальну суму платежу.
Перейдіть до класу GoDutch і напишіть програму, яка зчитує загальну суму рахунку та
кількість друзів, а потім виводить розмір частини оплати.
Розглянемо деякі деталі:
Програма має читати дані з System.in
Загальна сума рахунку не може бути від'ємною. Якщо введене значення негативне,
програма зупиняється та друкує: Bill total amount cannot be negative
Кількість друзів не може бути від'ємною або нульовою. Якщо таке відбувається,
то програма зупиняється і виводить: Number of friends cannot be negative or zero
Загальна сума рахунку, кількість друзів та частина до оплати є цілими числами.*/

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bill = scan.nextInt();
        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
            return;
        }

        int friends = scan.nextInt();
        if (friends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }

        int tips  = (bill*10)/100;
        int billForOne = (bill+tips)/friends;

        System.out.println(billForOne);

    }
}
