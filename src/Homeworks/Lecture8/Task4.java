package Homeworks.Lecture8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String input;
        char myChar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter:");
        input = scanner.next().toLowerCase();
        myChar = input.charAt(0);
        int asci = (int) myChar;

        if (input.length() != 1 || (asci < 97 || asci > 122)) {
            System.out.println("You are stupid");
        } else {
            if (asci == 97 || asci == 101 || asci == 105 || asci == 111 || asci == 117) {
                System.out.println("It is a vowel");
            } else {
                System.out.println("It is not a vowel");
            }
        }
    }
}
