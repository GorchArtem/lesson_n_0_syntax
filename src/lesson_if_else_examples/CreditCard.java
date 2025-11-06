package lesson_if_else_examples;

public class CreditCard {

    private static long balance = 130_000;

    // TODO: сделать аналог на свитч кейсе
    public long getMoneyFromBalance(long requestMoney) {
        if (requestMoney > balance) {
            System.out.println("недостаточно денег на балансе");
        } if (requestMoney <= 0) {
            System.out.println("Ошибка: некорректная сумма");
        }
//        else { // if (requestMoney > 0 && requestMoney <= balance)
//            return requestMoney;
//        }
        return requestMoney;
    }


//    public void authorized(String login, String password) {
//        //
//        if (login.length() == 0 && password.length() <= 6) {
//            System.out.println("поле логина не может быть пустым и пароль не менее 6 символов");
//            }
//    }

}
