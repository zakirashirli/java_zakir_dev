package com.zakir.project;



public class Homework {
    public static void main(String[] args) {
//        Exersice 1

        String names[] = {
                "Rachel", "Jake", "Jessica", "Michael", "Alice", "Tom", "Emily"
        };
        int ages[] = {
                18, 34, 22, 12, 27, 42, 39
        };
        System.out.println(names[0] + ages[0] + " " + names[1] + ages[1] + " " + names[2] + ages[2] +
                " " + names[3] + ages[3] + " " + names[4] + ages[4] + " " +  names[5] + ages[5] +
                " " + names[6] + ages[6]);

//        Exercise 2

        int a = 7;
        int b = 13;
        int c = 4;
        int d = 64;
        int e = 37;


        System.out.println("The answer of this task is: " + (a + b + c + d + e) / 5);



//        Exercise 3


        int numbers[] = {
                23, 17, 156, 79, 1029, 43, 17, 3, 38, 1029
        };

        System.out.println("Number of matching numbers: 2, these are:" + " " + numbers[1] + " , " + numbers[4] );
    }
}

