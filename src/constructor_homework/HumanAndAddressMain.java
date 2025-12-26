package constructor_homework;

public class HumanAndAddressMain {

    public static void main (String[] args){

        Human human = new Human("Novruz", "Moscow", "Tverskaya");
    }
}

/*
Задача 3: Человек и его адрес
* Создай два класса: Human и Address.
* Класс Address имеет поля city и street. Создай для него полный параметризованный конструктор, в который передаем значения
для city и street.
* Класс Human имеет поля name (String) и homeAddress (объект типа Address).
* Создай для Human конструктор, который принимает name, city, street. Внутри этого конструктора создай объект Address и
присвой его полю homeAddress.
* Создай второй конструктор для Human, который принимает уже готовый объект Address.
* Создай тестовый класс с методом main. В методе main протестируй создание человека двумя способами с имеющимися конструкторами.
*/

