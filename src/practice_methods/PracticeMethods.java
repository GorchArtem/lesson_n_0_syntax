package practice_methods;

import java.util.Scanner;

public class PracticeMethods {
    public static void main(String[] args) {

        int result;
        int result2;


        GreetingClass greetingClass = new GreetingClass();
        greetingClass.printHello("Novruz");
        System.out.println(greetingClass);

        // greetingClass.drawRectangle(10, 20);

        Calculator calculator = new Calculator();
        calculator.printSum(25, 50);
        System.out.println(calculator);


        result = calculator.findMin(21, 25);
        System.out.println("Значение " + result + " является минимальным");

        result2 = calculator.findMax(61, 40);
        System.out.println("Значение " + result2 + " является максимальным");





    }
}

/*

1. Простые невозвращаемые методы(void)
ПРимечание: Методы void не возвращают при выполнении каких-либо значений, как в случае с return.
Напиши метод printHello(String name) , который выводит в консоль: "Привет, переданное_значение_переменной_name!"
Метод, который рисует в консоли простую четырехугольную фигуру
Напиши метод drawRectangle(int width, int height), который рисует в консоли прямоугольник из символов * заданных размеров.
Пример: вызов drawRectangle(5, 3);  будет выводить в консоль следующее:
*****
*****
*****

Простой метод калькулятор:
написать метод printSum(int a, int b), в который можно передавать какие-то числа и
выводить на экран результат их суммы в виде: "a + b = сумма"
пример: вызов printSum(7, 4);
вывод в консоли "7 + 4 = 11"

Метод поиска минималььного числа.
Написать метод findMin(int a, int b), который возвращает минимальное из двух чисел.
пример:
public static void main(){
int result = findMin(10, -5);
sout(result);
}

вывод в консоли: -5
 */