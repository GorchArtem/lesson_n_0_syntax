package lesson_arrays;


/*
Данный класс тестирует логику создания счетов на основе объектов класса Accounts

И сохраняет созданные счета(объекты Accounts) в таблицу Accounts с помощью класса AccountsDB
 */
public class TestAccounts {
    public static void main(String[] args) {
        Accounts[] accounts = new Accounts[10];

        Accounts accounts1 = new Accounts("rub", 0);
        Accounts accounts2 = new Accounts("usd", 0);
        Accounts accounts3 = new Accounts("eur", 0);
        Accounts accounts4 = new Accounts("rub", 0);

        accounts[0] = accounts1;
        accounts[1] = accounts2;
        accounts[2] = accounts3;
        accounts[3] = accounts4;
        accounts[4] = new Accounts("rub", 40);
        accounts[5] = new Accounts("rub", 40);
        accounts[6] = new Accounts("rub", 40);



        AccountsDB accountsDB = new AccountsDB();
        accountsDB.saveAccounts(accounts);



    }
}
