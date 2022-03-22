package Homeworks.Lecture6;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        int myNum;
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        myNum = scanner.nextInt();
        int myResult = myNum % 2;
        String isItAnEvenNumber = myResult == 0 ? "even" : "odd";
        System.out.println(isItAnEvenNumber);
    }
}
