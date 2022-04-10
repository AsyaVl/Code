package Homeworks.Lecture8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        float firstNumber;
        float secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        firstNumber = scanner.nextFloat();

        System.out.println("Enter a number:");
        secondNumber = scanner.nextFloat();

        float result = Math.abs(firstNumber - secondNumber);

        boolean differenceTo1 = result > 0.1;
        boolean differenceTo2 = result > 0.01;
        boolean differenceTo3 = result > 0.001;
        boolean differenceTo4 = result > 0.0001;

        if (differenceTo1) {
            System.out.println("The numbers are the same up to the first sign after the comma");
        } else if (differenceTo2) {
            System.out.println("The numbers are the same up to the second sign after the comma");
        } else if (differenceTo3) {
            System.out.println("The numbers are the same up to the third sign after the comma");
        } else if (differenceTo4) {
            System.out.println("The numbers are the same up to the fourth sign after the comma");
        } else {
            System.out.println("There is no difference");
        }
    }
}
