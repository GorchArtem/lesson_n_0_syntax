package practice_methods;

import java.util.Scanner;

public class PracticeMethods {
    public static void main(String[] args) {

        int result;
        int result2;


        GreetingClass greetingClass = new GreetingClass();
        greetingClass.printHello("Novruz");
//        System.out.println(greetingClass);

         greetingClass.drawRectangle(5, 3);
         greetingClass.draw(5);

        Calculator calculator = new Calculator();
        calculator.printSum(25, 50);
        System.out.println(calculator);


        System.out.println("  result = calculator.findMin(21, 21);\n");
        result = calculator.findMin(21, 21);
        System.out.println("Значение " + result + " является минимальным");

        result2 = calculator.findMax(61, 40);
        System.out.println("Значение " + result2 + " является максимальным");



        double[] array = new double[3];
        array[0] = 11;
        array[1] = 2;
        array[2] = 32;

//        double resultCalculateAverage = calculator.calculateAverage(array);
//        System.out.println(resultCalculateAverage);

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


Метод, который рисует в консоли с каждой новой строки символ *
Напиши метод draw(int height), который рисует в консоли из символа * заданной высоте.
Пример: вызов drawRectangle(5);  будет выводить в консоль следующее:
*
*
*
*
*

Простой метод калькулятор:
написать метод printSum(int a, int b), в который можно передавать какие-то числа и
выводить на экран результат их суммы в виде: "a + b = сумма"
пример: вызов printSum(7, 4);
вывод в консоли "7 + 4 = 11"

------------------------------------------------------
Метод поиска минималььного числа.
Написать метод findMin(int a, int b), который возвращает минимальное из двух чисел.
пример:
public static void main(){
int result = findMin(10, -5);
sout(result);
}

вывод в консоли: -5


------------------------------------------------------

Метод для проверки четности числа.
Написать метод isEven(int number), который возвращает true, если число четное, и false — если нечетное

пример:
public static void main(){
boolean check = isEven(8);
sout(check);
}

Вывод в консоли должен быть: true



------------------------------------------------------------------------
---------

Метод для поиска среднего арифметического из массива чисел.

Написать метод calculateAverage(int[] array) который возвращает среднее арифметическое всех элементов массива.


пример:

public static void main(){
int[] numbers = {2, 4, 6, 8};

double avg = calculateAverage(numbers);
sout(avg);
}

Вывод результата в консоли: 5.0
 */