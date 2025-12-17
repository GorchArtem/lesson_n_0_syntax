package lesson_arrays.football_command;

import java.util.Scanner;

public class FootballController {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //тут передается в конструктор Scanner ввод дданных с клавиатуры в консоли
        System.out.println("Введите название и город клуба: ");
        String clubName = input.nextLine();
        String clubCity = input.nextLine();

        FootballClub footballClub = new FootballClub(clubName, clubCity);
//
//        System.out.println("Введите имя, возраст и рейтинг игрока: ");
//        String nameFootballer = input.nextLine();
//        int footballerAge = input.nextInt();
//        double rateFootballer = input.nextDouble();
//
//        footballClub.footballers = new Footballer[25];
//
//        Footballer footballer = new Footballer(nameFootballer, footballerAge, rateFootballer);

        System.out.println("Введите клоичество игроков: ");
        int countOfPlayers = Integer.parseInt(input.nextLine()); //  int 23  <---  char[] "23"
        footballClub.addFootballers(countOfPlayers,  input);
    }
}
