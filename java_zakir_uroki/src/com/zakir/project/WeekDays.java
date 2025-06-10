package com.zakir.project;

public class WeekDays {
    public static void main(String[] args) {
        String[] days = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};

        System.out.println();

        // 1. нечетные дни недели
        System.out.println(days[0] + " " +  days[2] + " " +  days[4] + " " +  days[6]);

        // 2. четные дни недели
        System.out.println(days[1] + " " +  days[3] + " " +  days[5]);
    }
}
