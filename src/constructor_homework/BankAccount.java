package constructor_homework;

public class BankAccount {
    String accountNumber;
    double balance = 0.0;

    public BankAccount(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }


    public static void main (String[] args){
        BankAccount bankAccount = new BankAccount("5495HRX693SR");
        BankAccount bankAccount1 = new BankAccount("1235AF777NV", 150345.99);
        bankAccount1.deposit(1231.12);
        System.out.println(bankAccount1.balance);



        System.out.println("Вывести номер счета клиента: " + bankAccount.accountNumber + " и его баланс: " + bankAccount.balance);
        System.out.println("Вывести номер счета клиента: " + bankAccount1.accountNumber + " и его баланс: " + bankAccount1.balance);
    }


    public void deposit(double amount){
        balance += amount;
    }

}

/*
Создай класс BankAccount с полями accountNumber (номер счета, строка) и balance (баланс, double).
1) Создай конструктор, который принимает только номер счета. Баланс при этом должен устанавливаться в 0.0.
2) Создай конструктор, который принимает и номер счета, и начальный баланс.
//3) Добавь простые методы deposit (для пополнения счета) и withdraw (для снятия суммы). В deposit мы передаем сумму,
которая прибавляется к balance выбранного объекта. В метод withdraw передается сумма, которая вычитается из balance.
4) Создай тестовый класс с методом main.
5) Протестируй в методе main создание объектов с 1ым и 2ым конструкторами и работу методов deposit и withdraw
 */
