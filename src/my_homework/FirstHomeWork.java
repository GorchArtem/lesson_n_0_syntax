package my_homework;

public class FirstHomeWork {

    static int num1 = 15; // Почему метод не работает если тип данных будет не static?
    static int num2 = 26;

    public static void main (String[] args) {

        printTwoNumbers(num1, num2);


    }

    public static void printTwoNumbers(int n1, int n2) {

        System.out.println(n1 + " " + n2);
    }

}


