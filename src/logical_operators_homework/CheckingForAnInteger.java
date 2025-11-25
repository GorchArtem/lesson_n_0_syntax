package logical_operators_homework;

import java.util.Scanner;

public class CheckingForAnInteger {

    public static void main(String[] args) {
        int num;
        boolean numTrueCheck = true;
        boolean numFalseCheck = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        num = input.nextInt();
//
//        if (num >= 5 && num <= 15) {
//            System.out.println(numTrueCheck);
//        } else System.out.println(numFalseCheck);

        System.out.println(checkNumber(num));

    }

    static boolean checkNumber(int num) {
        return num >= 5 && num <= 15;

//        if(num >= 5 && num <= 15) {
//            return true;
//        } else return false;
    }

}


/*
Напиши метод, который принимает в параметрах целое число и проверяет, попадает ли оно в диапазон от 5 до 15 (включительно).
Пусть данный метод возвращает: true, если число в нужном диапазоне, и false — если нет.
Этот метод вызывать в методе main и проверять вывод возвращаемого результата
 */