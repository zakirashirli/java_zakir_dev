package com.zakir.project;


import java.util.Scanner;

public class NewTopic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

       // surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        // age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // dlya sled stroki

        // school number
        System.out.print("Enter your school number: ");
        String school_number = scanner.nextLine();

        // adress
        System.out.print("Enter your adress: ");
        String adress = scanner.nextLine();

        // email adress
        System.out.print("Enter your email adress: ");
        String email_adress = scanner.nextLine();

        // phone number
        System.out.print("Enter your phone number: ");
        String phone_number = scanner.nextLine();

        System.out.println("My INFO:");
        System.out.println("Your name is " + name);
        System.out.println("Your surname is " + surname);
        System.out.println("Your age is " + age);
        System.out.println("Your school number is " + school_number);
        System.out.println("Your adress is " + adress);
        System.out.println("Your email adress is " + email_adress);
        System.out.println("Your phone number is " + phone_number);
    }
}
