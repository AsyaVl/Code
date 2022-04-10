package Homeworks.Lecture7;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int y;
        int x;
        int z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x = ");
        x = scanner.nextInt();
        System.out.println("Enter y = ");
        y = scanner.nextInt();
        System.out.println("Enter z = ");
        z = scanner.nextInt();

        if (x == y && x == z) {
            System.out.println("The triangle is equilateral");
        } else if (x == y || y == z || x == z) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is scalene");
        }
    }

}
