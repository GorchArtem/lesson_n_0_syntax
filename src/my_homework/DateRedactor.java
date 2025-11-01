package my_homework;


import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRedactor {
    public static void main (String[] args) {
        Date currentDate = new Date(); // получение текущего времени
        Date myBirthday = new Date(93, 4, 17, 14, 30, 25);
        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE"); // Выводит полное наименование дня недели
        SimpleDateFormat monthOfYearFormat = new SimpleDateFormat("MMMM"); // Выводит полное наименование месяца
        SimpleDateFormat dayOfMonthFormat = new SimpleDateFormat("d"); // Выводит число даты
        SimpleDateFormat thisYear = new SimpleDateFormat("yyyy"); // Выводит календарный год

        /**
         * Один из видов комментирования
         * Очень удобно
         */

        String monthOfYear = monthOfYearFormat.format(currentDate);
        String dayOfWeek = dayOfWeekFormat.format(currentDate);
        String dayOfMonth = dayOfMonthFormat.format(currentDate);
        String year = thisYear.format(currentDate);

        System.out.println(currentDate);
        System.out.println(myBirthday);
        System.out.println("Current Day of the Month: " + dayOfMonth);
        System.out.println("Current Month of the Year: " + monthOfYear);
        System.out.println("Current Day of the Week: " + dayOfWeek);
        System.out.println("Year: " + year);

    }
}
