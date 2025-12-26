package lesson_arrays.simple_examples;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        int c = 45;

        int sum = a + b + c;
        int avg = sum / 3;

        int[] nums = new int[3];
        nums[0] = 4;
        nums[1] = 10;
        nums[2] = 45;


        double[] arrNums = new double[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arrNums.length-3; i++) {
            arrNums[i] = Double.parseDouble(input.next());
            System.out.println(arrNums[i]);
        }


    }


}
