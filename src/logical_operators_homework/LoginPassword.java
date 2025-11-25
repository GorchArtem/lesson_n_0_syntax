/* package logical_operators_homework;

import java.util.Scanner;

public class LoginPassword {
    public static void main(String[] args){
        String login;
        String password;
        boolean trueCheck = true;
        boolean falseCheck = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Ввдедите логин: ");
        login = input.nextLine();
        System.out.println("Ввдедите пароль: ");
        password= input.nextLine();

        if (login = "admin" && password = "qwerty")


    }
}

/*
Написать метод, который принимает в параметрах строку login и строку password.
Пусть метод возвращает true, если логин равен "admin" И пароль равен "qwerty", иначе false.
Этот метод вызывать в методе main и проверять вывод возвращаемого результата
 */