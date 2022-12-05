package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.readAllLines;
import static java.nio.file.Paths.*;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        try(Scanner scanner = new Scanner(System.in))
             {
            List<String> line = Files.readAllLines(Path.of(scanner.nextLine()));
            for (String str : line) {
                System.out.println(str.replaceAll("[. ,]", ""));
                }
            }
        catch (IOException e){
            System.out.println("Ошибочка вышла " + e);;
        }
        }


    }


