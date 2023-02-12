package com.javarush.task.pro.task16.task1620;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* 
Еще один простой шаблон
*/

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        //4 — номер дня недели, т.е. четверг;
        //9 — день месяца;
        //3 — месяц;
        //19 — год;
        //06 — часы;
        //03 — минуты;
        //07 — секунды;
        //319180500 — наносекунды;
        //Europe/Kiev — временная зона.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String text =dtf.format(zonedDateTime);
        System.out.println(text);

    }
}
