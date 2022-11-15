package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Anna Co", 9.5);
        grades.put("Yana Lo", 8.5);
        grades.put("Inna Zo", 6.5);
        grades.put("Nika Ko", 10.0);
        grades.put("Zinna Zo", 7.25);

    }
}
