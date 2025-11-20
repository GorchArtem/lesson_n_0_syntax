package operator_examples;

import java.util.Scanner;

public class TestMainOperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();




        if(age < 18) { // !(age >= 18)
            System.out.println("Меньше 18 лет");
        } else {
            System.out.println("Its ok");
        }


        boolean bool = input.nextBoolean(); // true
        if(!bool) {  // является ли bool не-true(false)?
            System.out.printf("Value is %b", bool);
        } else  { // если тру, то выводим следующий текст
            System.out.printf("Value is %b", bool);
        }

        // 0 или 1
        // 0 false
        // 1 true
        // !0 = true or 1
        // !1 = false or 0
    }
}
