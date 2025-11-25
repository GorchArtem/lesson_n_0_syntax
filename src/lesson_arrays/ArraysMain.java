package lesson_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {
        int number = 10;

        int[] intNumbers = new int[20];

        intNumbers[10] = 12312;



        for (int i = intNumbers.length - 1; i >=0; i--) {
            System.out.println(i);// i < intNumbers.length то же самое что и < 20 (int[] intNumbers = new int[20];)
            if(intNumbers[i] == 12312) {
                System.out.println(intNumbers[i] + " номер ячейки массива = " + i);
            } else  {
                System.out.println("в массиве нет нужного числа");
            }
        }











    }

}
