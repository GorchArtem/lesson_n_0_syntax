public class Test {

    // Целочисленные типы
    static int num = 10;//32 bit

    static int num1 = 10;//32 bit
    static int num2 = 10;//32 bit
    static int num3 = 10;//32 bit

    Integer num2 = 10;
    long numLong = 1000012312123112312L;// 64 bit
    byte numByte = 127;// 8 bit
    short numShort = 32767; //16 bit

    // числа с плавающей точкой
    double numDouble = 3.1415926; // 64 bit
    float numFloat = 3.1415926f;// 32bit


    // символьные
    char symbolChar = 'H'; // 16bit
    static Character symbolChar2 = 'H';

    // логический
    boolean bool = false;

    /**
     *

     char переменная
    |H|

    ---------

     String переменная
    |H|e | l|l |o |


    **/


    // Ссылочные типы данных
    String str = " Hello World! ";



    public static void main(String[] args) {

        MathCalc calc = new MathCalc();

        Human player1 = new Human(); // cоздание экземпляра класса ИЛИ создание объекта
        Human player2 = new Human(); // 4 экземпляра класса Human , либо 4 объекта типа Human
        Human player3 = new Human();
        Human player4 = new Human();

        player1.age = 20;
        player1.gender = "male";
        player1.name = "Vasiliy";

        System.out.println(player1.age);
        System.out.println(player1.gender);
        System.out.println(player2.age);


        eqTwoVariables(num2, num);


        IntProxy intProxy = new IntProxy();
        intProxy.num = 10;

        System.out.println(intProxy.equalsNumToNum(20));


        System.out.println(eqTwoVariables(num, num1));

    }


    public static boolean eqTwoVariables(int a, int b) {
        return a == b;
    }

    public void test1() {
        System.out.println(num);


    }

}
