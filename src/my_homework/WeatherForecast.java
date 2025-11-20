package my_homework;

import java.util.Scanner;

public class WeatherForecast {

    static double Thermometer;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Укажите температуру на улице в градусах Цельсия");
        Thermometer=input.nextDouble();

        if (Thermometer > 20.0) {
            System.out.println("Сегодня " + Thermometer + " градус(a/ов) Цельсия." + " Рекомендуем надеть футболку и шорты");
        } else if (Thermometer >= 10.0) {
            System.out.println("Сегодня " + Thermometer + " градус(a/ов) Цельсия." + " Рекомендуем надеть Свитер и джинсы");
        } else if (Thermometer >= 0) {
            System.out.println("Сегодня " + Thermometer + " градус(a/ов) Цельсия." + " Рекомендуем надеть Куртку и брюки");
        } else if (Thermometer < 0) {
            System.out.println("Сегодня " + Thermometer + " градус(a/ов) Цельсия." + " Рекомендуем надеть Теплую зимнюю куртку и шапку");
        }


    }
}

//
//1)Задача "Прогноз погоды и одежда"
//
//        Напиши программу, которая рекомендует что надеть по температуре:
//        - Выше +20°C: "Футболка и шорты"
//
//        - От +10 до +20°C: "Свитер и джинсы"
//
//        - От 0 до +10°C: "Куртка и брюки"
//
//        - Ниже 0°C: "Теплая зимняя куртка и шапка"
