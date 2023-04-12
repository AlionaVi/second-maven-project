package com.dayofweek;

import java.util.Scanner;

public class App {
    static DayOfWeekEnum day;

    public static void main(String[] args) {
        Scanner scannerDay = new Scanner(System.in);
        System.out.println("Введите день недели на английском");
        String newDay = scannerDay.nextLine().toUpperCase();

        day = DayOfWeekEnum.valueOf(newDay);

        switch (day) {
            case MONDAY:
                System.out.println("Понедельник!");
                break;
            case TUESDAY:
                System.out.println("Вторник!");
                break;
            case WEDNESDAY:
                System.out.println("Среда!");
                break;
            case THURSDAY:
                System.out.println("Четверг!");
                break;
            case FRIDAY:
                System.out.println("Пятница!");
                break;
            case SATURDAY:
                System.out.println("Суббота!");
                break;
            case SUNDAY:
                System.out.println("Воскресенье!");
                break;
            default:
                System.out.println("Вы ввели неверное значение!");
                break;
        }
    }
}
