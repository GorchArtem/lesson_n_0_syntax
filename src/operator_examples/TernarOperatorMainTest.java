package operator_examples;

import java.util.Scanner;

public class TernarOperatorMainTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        String res = (age >= 18) ?
                "its ok": "not ok";
        // if(age >= 18) {
//        "its ok"
        // } else {
        // "not ok"}

        System.out.println(res);
    }
}
