package com.zakir.project;

import java.util.Scanner;

public class MyInfoFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your name:");
        String name = sc.nextLine();

        System.out.println("Write your age:");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Write your city:");
        String city = sc.nextLine();

        System.out.println("Write your fav book:");
        String fav_book = sc.nextLine();

        if(age < 18) {
            System.out.println("Вы несовершеннолетний!");
        } else {
            System.out.println("Вы совершеннолетний!");
        }
    }
}
