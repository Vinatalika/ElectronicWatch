package com.epam.main.learn;

import java.sql.SQLOutput;
import java.util.Scanner;

/*Для заданих коефіцієнтів квадратного рівняння (ax² + bx + c = 0),
 поверніть один або два корені рівняння, якщо вони існують в області дійсних чисел.
Вхідне значення визначається через System.in. Вихідне значення має бути надруковане у System.out.
Формат виведення:
"x₁ x₂" (два корені в будь-якому порядку, розділені пробілом), якщо є два корені
"x" (просто значення кореня), якщо є єдиний корінь
"no roots" (просто рядкове значення "без коріння"), якщо кореня немає.
Параметр a гарантовано не дорівнює нулю.
*/
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0){
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root1 + " " + root2);
        } else if (discriminant == 0){
            double root = -b / (2 * a);
            System.out.println(root);
        } else {
            System.out.println("no roots");
        }
        scan.close();

    }
}
