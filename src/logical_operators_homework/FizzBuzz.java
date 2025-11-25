package logical_operators_homework;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        double num;
        String fizz = "Fizz";

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100: ");
        num = input.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num < 1 || num > 100) {
            System.out.println("Вы ввели некорректное значение");
        } else {
            System.out.println(num);
        }


    }
}

/*
Напиши метод, который выводит числа от 1 до 100, но:
Если число делится на 3 без остатка, выводить  "Fizz" вместо числа
Если число делится на 5 без остатка, выводить "Buzz" вместо числа
Есл число делится и на 3, и на 5 без остатка - выводить "FizzBuzz" вместо числа
Во всех остальных случаях выводить само число
 */