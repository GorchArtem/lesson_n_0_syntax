import java.util.logging.StreamHandler;

public class MathCalc {

    // Модификаторы доступа(область видимости): public, private, protected, default(package)
    // модификатор static
    public int num = 2;

    private int num1 = 1;

    public int num2;

    // умножение *
    // деление /
    // сумма и вычет +/-

    // оператор ИЛИ   ||


    int defaultZero = 0;



//    // этот метод ничего не возвращает, поэтому мы пометили его как void
//    void somethingMethod() {
//        // click();
//    }
//
//    MainPage somethingMethod() {
//        // click();
//        // return MainPage.refresh();
//    }

    public int sumTwoNumbers(int a, int b) {
       return a + b;
    }



    int somethingMethod1() {
        return defaultZero;
    }


    double compareToVersion1() {
        double result =
                num1 + num2;

        return result;
    }

    boolean compareToVersion2() {
        return num1 == num2;
    }

    boolean compareToVersion3(int a, int b) {
        return b == a;
    }







    public class Test {
        int a = num1;
    }


}
