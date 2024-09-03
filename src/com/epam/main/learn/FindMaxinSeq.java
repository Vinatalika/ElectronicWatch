package com.epam.main.learn;

import java.util.Scanner;

/*Перейдіть до класу FindMaxInSeq і напишіть програму, яка зчитує послідовність
цілих значень зі стандартного введення і знаходить максимальне з них.
Ви повинні помістити своє рішення у метод max, щоб пройти тести.
Подробиці:
Ви повинні зчитувати значення послідовності, доки наступне не стане 0.
Нульове значення означає кінець вхідної послідовності та не є її елементом.
Послідовність гарантовано містить хоча б одне значення.
*/
public class FindMaxinSeq {
    public static int max() {
        Scanner scan = new Scanner(System.in);
        int maxNumber = scan.nextInt();
        while (true){
            int number = scan.nextInt();
            if (number == 0){
                break;
            }
            if (number > maxNumber){
                maxNumber = number;
            }
        }

        // Put your code here

        return maxNumber;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
