package constructor_homework;

public class Book {
    String title;
    String author;
    int year;

    // Конструктор по умолчанию
    public Book(){
        title = "Неизвестно";
        author = "Неизвестно";
        year = 0;
    }
    // Параметризованный конструктор
    public Book(String title, String author, int year) {
        this.title=title;
        this.author=author;
        this.year=year;
    }

    public static void main(String[] args){

        Book book = new Book();
        Book book1 = new Book("Home", "Peter Ivanov", 1993);
        System.out.println("Конструктор по умолчанию");
        System.out.println("Название книги: " + book.title);
        System.out.println("Имя автора: " + book.author);
        System.out.println("Дата издания: " + book.year);
        System.out.println("Параметризованный конструктор: " + book1.title + " " + book1.author + " " + book1.year);


    }

}

/*
Задача 1: Класс Book для создания объектов книги
 Создай класс Book. У книги должны быть поля: title (название), author (автор) и year (год издания).
 Создай конструктор по умолчанию, который будет создавать книгу с названием "Неизвестно", автором "Неизвестен" и годом 0.
 Создай кастомный конструктор, принимающий все три параметра.
 Создай класс для тестирования с методом main.
В методе main создай два объекта: один с помощью каждого конструктора, и выведи их данные.
**/
