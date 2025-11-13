package lesson_if_else_examples;

import java.util.Scanner;

public class CreditCard {

    private long balance = 130_000;

    public CreditCard() {
        System.out.println("Создан объект CreditCard с дефолтным значением баланса " + balance);
    }

    public CreditCard(long balance) {
        this.balance = balance;
        System.out.println("Создан объект CreditCard с кастомным значением баланса " + balance);
    }

    public CreditCard(Scanner input) {
        this.balance = input.nextLong();
        System.out.println("Был введен в консоли кастомный баланс = " + this.balance);
    }


    // TODO: сделать аналог на свитч кейсе
    public long getMoneyFromBalance(long requestMoney) {
        if (requestMoney > balance) {
            System.out.println("недостаточно денег на балансе");
        } if (requestMoney <= 0) {
            System.out.println("Ошибка: некорректная сумма");
        }
        else { // if (requestMoney > 0 && requestMoney <= balance)
            return requestMoney;
        }

        return 0;
    }

    public long getMoneyFromBalanceSWITCHCASE(long requestMoney) {
        // мы предполагаем какие-то значения переданные в requestMoney

        switch ((int) requestMoney) {
            case 130:
                System.out.println("Normal value");
                break;
                case 131:
                    System.out.println("Normal value");
                    break;
                    case 150_000:
                        System.out.println("Wrong value");
                        break;
                        default:
                            System.out.println("Default value");
        }

        return requestMoney;
    }


//    public void authorized(String login, String password) {
//        //
//        if (login.length() == 0 && password.length() <= 6) {
//            System.out.println("поле логина не может быть пустым и пароль не менее 6 символов");
//            }
//    }

}
