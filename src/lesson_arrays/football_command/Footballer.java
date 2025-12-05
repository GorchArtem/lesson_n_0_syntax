package lesson_arrays.football_command;

public class Footballer {
    String name; // Переменная имя футболиста
    int age; // Переменная возраст футболитса
    double rate; // Переменная рейтинг футболиста

    public Footballer(String name, int age, double rate) {  // Конструктор Footballer неоюходим для того, чтобы мы могли добавлять разных футболистов в наш код
        this.name = name;
        this.age = age;
        this.rate = rate;
    }
}


