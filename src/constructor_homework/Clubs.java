package constructor_homework;

import java.util.Scanner;

public class Clubs {

    String name;
    String city;
    int dateOfFoundation;
    int countOfPlayers;

    public Clubs(){

    }
    public Clubs(String name, String city, int dateOfFoundation, int countOfPlayers){
        this.name=name;
        this.city=city;
        this.dateOfFoundation=dateOfFoundation;
        this.countOfPlayers=countOfPlayers;
    }

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        Clubs club = new Clubs("AC Milan", "Milan", 1899, 25);
        Clubs club2 = new Clubs();
        club2.name="Juventus";
        club2.city="Turin";
        club2.dateOfFoundation=1905;

        System.out.println("Введите название клуба: ");
        String nameOfClub = input.nextLine();
        System.out.println("Введите дату основания клуба: ");
        int dateOfFoundationClub = input.nextInt();



        if (dateOfFoundationClub==1899){
            System.out.println("Самый титулованный клуб Италии: " + club.name + " из города " + club.city + " был основан в "
                    + club.dateOfFoundation + " году.");
        }
        if (dateOfFoundationClub!=1899){
            System.out.println("Самый титулованный клуб Италии: " + club2.name + " из города " + club2.city + " был основан в " +
                    + club2.dateOfFoundation + " году.");
        }

    }

}
