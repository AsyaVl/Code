package Homeworks.Lecture8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        boolean leap = (year % 4 == 0) && ((year % 100 != 0) || (year % 100 == 0 && year % 400 == 0));

        if (leap) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
