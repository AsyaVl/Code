package Homeworks.Lecture6;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int myNumber;
        double myResult;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        myNumber = scanner.nextInt();
        myResult = Math.sqrt(myNumber);

        System.out.printf("%.5f", myResult);
    }
}
