package lesson_arrays.football_command;

import java.util.Scanner;

public class FootballClub {
    String name;
    String city;
    Footballer[] footballers;

    public FootballClub(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void addFootballers(int countPlayers) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double rate;
        footballers = new Footballer[countPlayers];

        for (int i = 0; i < countPlayers; i++) {
            System.out.println("Enter name: ");
            name = input.nextLine();
            System.out.println("Enter age: ");
            age = input.nextInt();
            System.out.println("Enter rate: ");
            rate = input.nextDouble();

            footballers[i] = new Footballer(name, age, rate);
        }


        System.out.println("Footballers added successfully! " + footballers.toString());
    }

}
