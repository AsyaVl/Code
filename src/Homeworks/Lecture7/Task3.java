package Homeworks.Lecture7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int myNum;

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        myNum = scanner.nextInt();

        int myResult = myNum % 2;
        boolean isItAnEvenNumber = myResult == 0;

        if (isItAnEvenNumber) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}