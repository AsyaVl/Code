package Homeworks.Lecture7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int weight;
        float height;
        double myBMI;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight(kg)");
        weight = scanner.nextInt();

        System.out.println("Enter your height(m)");
        height = scanner.nextFloat();

        myBMI = weight / Math.pow(height, 2);
        System.out.println("Your BMI is: " + myBMI);

        if (myBMI < 18.5) {
            System.out.println("You are underweight");
        } else if (myBMI >= 18.5 && myBMI < 24.9) {
            System.out.println("Your weight is normal");
        } else {
            System.out.println("You are overweight");
        }
    }

}

