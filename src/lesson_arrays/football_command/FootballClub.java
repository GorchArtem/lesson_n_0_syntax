package lesson_arrays.football_command;

import java.util.Arrays;
import java.util.Scanner;

public class FootballClub {
    String name;
    String city;
    Footballer[] footballers;

    public FootballClub(String name, String city) {
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
