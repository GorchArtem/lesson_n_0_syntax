package lesson_arrays;

import java.util.Arrays;

//Kласс для работы с БД
public class AccountsDB {

    // INSERT sql
    public void saveAccounts(Accounts[] accounts) {
        System.out.println("Save accounts! = " + Arrays.toString(accounts));
    }
}
