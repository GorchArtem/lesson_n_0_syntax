package practice_methods;

public class Calculator {

    public void printSum (int a, int b){
        int sum = a + b;
        System.out.println(sum);

    }

    public int findMin (int num1, int num2) {
        if (num1 > num2)
            return num2;
        else return num1;

    }

    public int findMax (int num3, int num4){
        return Math.max(num3, num4);
    }



}
