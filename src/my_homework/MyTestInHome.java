package my_homework;

import java.util.Scanner;

public class MyTestInHome {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Your name is " + name);

        System.out.println("How old are you:");
        String age = input.nextLine();

        System.out.println("Your age is " + age);


        CoffeeMachine coffeeMachine1 = new CoffeeMachine(120, 123);

        coffeeMachine1.testTest();





        CoffeeMachine coffeeMachine2 = new CoffeeMachine(122, 133);
        coffeeMachine2.getValueOfCoffeeAndWater();


//
//        System.out.print(coffeeMachine1.coffeeAmount);
//
//        System.out.println(coffeeMachine2.coffeeAmount);

    }




}

