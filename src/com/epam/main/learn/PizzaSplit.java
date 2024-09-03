package com.epam.main.learn;
/*Перейдіть до класу PizzaSplit і напишіть програму, яка має прочитати два
значення з System.in:
кількість людей
кількість шматочків в одній піці.
Гарантується, що вхідні параметри — цілі додатні числа.
Програма повинна надрукувати мінімальну кількість піц (не нуль),
яку треба замовити, щоб у всіх була однакова кількість скибочок і
не залишилося жодного зайвого.
*/

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        int slises = scan.nextInt();
        int pizza = 1;
        while ((pizza * slises)%people != 0){
            pizza++;
        }
        System.out.println(pizza);
    }
}
