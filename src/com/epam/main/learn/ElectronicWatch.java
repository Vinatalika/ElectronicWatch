package com.epam.main.learn;

import java.util.Scanner;

public class ElectronicWatch {
    public static String formatTime (int timeInSeconds){
        int hours = (timeInSeconds/3600)%24;
        int minutes = (timeInSeconds%3600)/60;
        int seconds = timeInSeconds%60;
        String formatedTime = String.format("%d:%02d:%02d", hours, minutes, seconds);
        return formatedTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeInSeconds = scanner.nextInt();
        System.out.println(formatTime(timeInSeconds));
    }
}
