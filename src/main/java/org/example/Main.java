package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String membership = scanner.nextLine();

        if (!(membership.equalsIgnoreCase("Regular") ||
                membership.equalsIgnoreCase("VIP") ||
                membership.equalsIgnoreCase("Premium"))) {
            System.out.println("Invalid membership status entered.");
            return;
        }

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        float price = 0.0f;

        switch (membership.toLowerCase()) {
            case "regular":
                if (age < 18) {
                    price = 50.0f;
                } else if (age <= 64) {
                    price = 100.0f;
                } else {
                    price = 75.0f;
                }
                break;

            case "vip":
                if (age < 18) {
                    price = 75.0f;
                } else if (age <= 64) {
                    price = 150.0f;
                } else {
                    price = 112.5f;
                }
                break;

            case "premium":
                if (age < 18) {
                    price = 100.0f;
                } else if (age <= 64) {
                    price = 200.0f;
                } else {
                    price = 150.0f;
                }
                break;
        }
        System.out.printf("Price: $%.2f\n", price);
    }
}
