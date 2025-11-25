package lesson_arrays;

public class Accounts {
    String currency;
    double balance;

    public Accounts(String currency, double balance) {
        this.currency = currency;
        this.balance = balance;
    }

    public String toString() {
        return this.getClass() + " " + currency + ": " + balance;
    }
}
