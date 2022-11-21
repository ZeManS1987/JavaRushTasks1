package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] quest = JavarushQuest.values();
        for(JavarushQuest value : quest){
            System.out.println(value.ordinal());
        }

    }
}
