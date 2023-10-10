package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String middleName;
        String lastName;
        String suffix;

        System.out.println("what is your first name: ");
        firstName = scanner.nextLine();
        System.out.println("what is your middle name: ");
        middleName = scanner.nextLine();
        System.out.println("what is your last name: ");
        lastName = scanner.nextLine();
        System.out.println("what is your suffix name: ");
        suffix = scanner.nextLine();

        int space = middleName.length();
        if (space > 0){
            firstName = firstName + " ";
        }
        int space2 = suffix.length();
        if (space2 > 0){
            lastName = lastName + ", ";
        }
        System.out.println("your name is: " + firstName + middleName + " " + lastName + suffix);
    }
}
