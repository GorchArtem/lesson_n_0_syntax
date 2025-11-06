package lesson_if_else_examples;

public class TestMain {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        long result = creditCard.getMoneyFromBalance(20000);

        System.out.println(result);
    }
}
