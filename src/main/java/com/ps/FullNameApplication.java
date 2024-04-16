package com.ps;

import java.util.Scanner;

public class FullNameApplication {

    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        nameApp();
    }
    public static void nameApp() {
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Enter middle name(hit enter if you don't have one): ");
        String middleName = scanner.nextLine().trim();
        String displayedMiddleName = "";
        if(!middleName.isEmpty()) {
            displayedMiddleName = " " + middleName.substring(0, 1) + ". ";
        }

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine().trim();

        System.out.println("Enter suffix(hit enter if you don't have one): ");
        String suffix = scanner.nextLine().trim();
        String displayedSuffix = "";
        if(!suffix.isEmpty()) {
            displayedSuffix = ", " + suffix;
        }

        System.out.println("Full Name: " + firstName +  " " + displayedMiddleName  + lastName  + displayedSuffix);
    }
}
