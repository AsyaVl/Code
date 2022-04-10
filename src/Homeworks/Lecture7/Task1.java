package Homeworks.Lecture7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int day;
        int month;
        boolean isItSpring;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day:");
        day = scanner.nextInt();

        System.out.println("Enter a month using a number:");
        month = scanner.nextInt();

        isItSpring = (month >= 4 && month <= 5) || (month == 3 && day >= 20) || (month == 6 && day <= 20);

        if (isItSpring) {
            System.out.println("Yes");
        } else {
            System.out.println("False");
        }

    }
}
