package com.zakir.project;

import java.util.Scanner;

public class MyIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vedi svoye imyaa");
        String myStr = scanner.nextLine();
        System.out.println("napishi chislo: ");
        int random_number = scanner.nextInt();


        System.out.println(myStr);

        if(random_number < 0) {
            System.out.println("otricacelnoe");
        } else {
            System.out.println("polojitelynoe");
        }



    }
}
