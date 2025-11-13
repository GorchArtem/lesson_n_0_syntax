package lesson_if_else_examples;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CreditCard creditCard = new CreditCard();
        System.out.print("Введите сумму: ");
        long result = creditCard.getMoneyFromBalance(input.nextLong());

        if (result < 0) {
            System.out.println("Запрашиваемый баланс не подошел");
        } else if (result > 0) {
            System.out.println("Запросили корректный баланс");
        }


        CreditCard creditCard2 = new CreditCard(100_000);
        System.out.println("Введите сумму: ");
        long result2 = creditCard2.getMoneyFromBalance(input.nextLong());
        System.out.println(result2);



        CreditCard creditCard3 = new CreditCard(input);

    }
}
