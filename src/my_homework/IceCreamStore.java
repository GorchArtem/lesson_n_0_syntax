package my_homework;

import java.util.Scanner;

public class IceCreamStore  {
    public static void main(String[] args) {
        int typeOfIceCream;
        int vanilla = 1;
        int chocolate = 2;
        int strawberry = 3;
        int pistachio = 4;

        Scanner input = new Scanner(System.in);
        System.out.println("Выберите вкус мороженого указаф цифру от 1 до 4: ");
        typeOfIceCream = input.nextInt();


        if (typeOfIceCream == 1) {
            System.out.print("Ваниль → 150 руб, Классическое ванильное мороженое");
        } else if (typeOfIceCream == 2) {
            System.out.print("Шоколад → 170 руб, Шоколадное мороженое с какао");
        } else if (typeOfIceCream == 3) {
            System.out.print("Клубника → 160 руб, Клубничное мороженое с кусочками ягод");
        } else if (typeOfIceCream == 4) {
            System.out.print("Фисташка → 190 руб, Фисташковое мороженое с орехами");
        } else if (typeOfIceCream > 4 || typeOfIceCream < 1) {
            System.out.print("Такого вкуса нет в меню");
        }

    }
}




/*
Задание: Напиши программу, которая выводит цену и описание в зависимости от выбранного вкуса:

- "ваниль" → 150 руб, "Классическое ванильное мороженое"
- "шоколад" → 170 руб, "Шоколадное мороженое с какао"
- "клубника" → 160 руб, "Клубничное мороженое с кусочками ягод"
- "фисташка" → 190 руб, "Фисташковое мороженое с орехами"
- Для других вкусов: "Такого вкуса нет в меню
 */

