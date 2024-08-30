package com.epam.main.learn;

import java.util.Scanner;

/*Наведено таку умову: равлик піднімається по дереву на a футів на день.
Потім щоночі равлик сповзає вниз на b футів. Висота дерева — h футів.
Перейдіть до класу Snail і напишіть програму з підрахунком кількості днів,
 які знадобляться равлику, щоб дістатися до вершини дерева.
Програма читає a, b, h рядково. Вхідні значення гарантовано є додатніми цілими числами.
Якщо равлик не може дістатися до вершини дерева, має виводитися повідомлення: Impossible.
*/
import java.util.Scanner;


public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();

        if (a >= h){
            System.out.println(1);
        } else if (a <= b){
            System.out.println("Impossible");
        } else {
            int days = (h-b-1)/(a-b)+1;
            System.out.println(days);
        }


    }
}
