package my_homework;

import java.util.Scanner;

public class TimeOfDay {

    static int currentTime;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите время суток: ");
        currentTime = input.nextInt();

        if (currentTime >= 5 && currentTime < 12) {
            System.out.println("Доброе утро!");
        } else if (currentTime >= 12 && currentTime < 17) {
            System.out.println("Добрый день!");
        } else if (currentTime >= 17 && currentTime < 23) {
            System.out.println("Добрый вечер!");
        } else if (currentTime <= 4 || currentTime == 23 || currentTime == 24 ) { // 23 24 0 4
            System.out.println("Доброй ночи!");
        }


    }
}


/*3) Задача "Определение времени суток"
Поздороваться в зависмости от времени.
Задание:

- 5-11 часов: "Доброе утро!"
-12-16 часов: "Добрый день!"
-17-22 часа: "Добрый вечер!"
-23-4 часа: "Доброй ночи!" */
