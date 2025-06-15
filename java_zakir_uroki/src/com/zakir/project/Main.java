package com.zakir.project;

import newtopic.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        sc.nextInt();
        int[] numbers = {5, 10, -3};
        int sum = numbers[0] + numbers[1] + numbers[2]; // 1 zadanie

        boolean isFirstGreater = numbers[0] > numbers[1]; // false
        if(isFirstGreater){
            System.out.println("pervoe bolshe vtorogo: true");
        } else {
            System.out.println("pervoe bolshe vtorogo: false");
        }

        boolean isThirdNumberNegative = numbers[2] < 0;
        if (isThirdNumberNegative) {
            System.out.println("число отриц");
        } else {
            System.out.println("+");
        }

        System.out.println(sum);

    }
}
