package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try(Scanner scanner = new Scanner(System.in);
                var inPutStream = Files.newInputStream(Paths.get(scanner.nextLine()));
                var outPutStream = Files.newOutputStream(Paths.get(scanner.nextLine()))) {
            byte[] byteIn = inPutStream.readAllBytes();
            byte[] byteOut = new byte[byteIn.length];
            for (int i = 0; i < byteIn.length; i += 2) {
                if (i < byteIn.length - 1) {
                    byteOut[i] = byteIn[i + 1];
                    byteOut[i + 1] = byteIn[i];

                } else byteOut[i] = byteIn[i];
            }
            outPutStream.write(byteOut);
        }
        catch (IOException e){
            System.out.println(" Ошибочка вышла " + e );
        }



    }
}

