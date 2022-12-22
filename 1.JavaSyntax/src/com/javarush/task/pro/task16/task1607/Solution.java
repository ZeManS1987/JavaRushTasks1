package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код
        LocalDate today = LocalDate.now();


        return today;
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        LocalDate localDate = LocalDate.of(2020, Month.SEPTEMBER, 12);

        return localDate;
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        LocalDate localYear = LocalDate.ofYearDay(2020, 256);

        return localYear;
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
        LocalDate localDay = LocalDate.ofEpochDay(18517);

        return localDay;
    }
}
