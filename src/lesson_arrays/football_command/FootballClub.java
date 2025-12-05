package lesson_arrays.football_command;

import java.util.Arrays;
import java.util.Scanner;

public class FootballClub {
    String name; // Переменная название клуба
    String city; // Переменная город
    Footballer[] footballers; // Массив Footballer[] необходим для добавление футболистов массивом

    public FootballClub(String name, String city) { // Конструктор FootballClub необходим для добавление команд в наш код
        this.name = name;
        this.city = city;
    }

    public void addFootballers(int countPlayers, Scanner input) {
        String name1;
        int age;
        double rate;
        footballers = new Footballer[countPlayers];

        for (int i = 0; i < countPlayers; i++) {
            System.out.println("Enter age: ");
            age = Integer.parseInt(input.nextLine());
            System.out.println("Enter rate: ");
            rate = Double.parseDouble(input.nextLine());
            System.out.println("Enter name: ");
            name1 = input.nextLine();

            footballers[i] = new Footballer(name1, age, rate);
        }


        System.out.println("Footballers added successfully! " + Arrays.toString(footballers));
    }

}

/**
 * 1. Для чего нужен метод addFootballers?
 * 2. Почему Scanner как аргумент внутри метода и почему он не расписан полностью?
 * 3. Что означает new Footballer[countPlayers] в объекте и для чего нужен данный объект?
 * 4. Неаонятно как работает цикл
 * 5. Зачем мы создавали конструкторы если в конечном итоге мы их не используем?
 */