package Homeworks.Lecture8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float price;
        int size;
        String color;
        String wantedColor = "black";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter price");
        price = scanner.nextFloat();

        System.out.println("Enter size");
        size = scanner.nextInt();

        System.out.println("Enter color");
        color = scanner.next();
        boolean isItReturnable;
        isItReturnable= wantedColor.equalsIgnoreCase(color);
        if ((price >= 150) && ((size == 44) || (size == 45)) && isItReturnable) {
            System.out.println("I will buy them");
        } else {
            System.out.println("I will not buy them");
        }
    }
}
