package lesson_simple_examples_methods;

import java.util.Scanner;

public class MainTaxiController {

    public static void main(String[] args) {
        int initialOdometr;
        int finishOdometr;
        int distance;
        double rub_per_km;

        Scanner input = new Scanner(System.in);

        System.out.print ("Введите начальные показания одометра: ");
        initialOdometr = input.nextInt();
        System.out.print ("Введите конечные показания одометра: ");

        finishOdometr = input.nextInt();

        distance = finishOdometr - initialOdometr;
        rub_per_km = distance * 8.5;

        int rubles = (int)rub_per_km;
        double buff = rub_per_km - rubles;
        System.out.println(buff);
        int penny =  (int)((rub_per_km - rubles) * 100);// Math.round(50.0) = 50 long = 50 int

        System.out.println(rubles + "rubles " + penny + " penny");

        System.out.println( "Вы проехали: " + distance + " км" + ", а стоимость проезда равна: "
                + rub_per_km);
    }

}
