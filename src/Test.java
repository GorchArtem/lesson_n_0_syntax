public class Test {

    // Целочисленные типы
    static int num = 10;//32 bit

    static int num1 = 10;//32 bit
    static int num2 = 10;//32 bit
    static int num3 = 10;//32 bit

//    Integer num2 = 10;
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
        Employee e = new Employee();




//        int code = Response.getStatus();
//
//
//        if (code == 200) {
//            System.out.println("Status code is 200");
//        } if (code == 300) {
//            System.out.println("Status code is 300");
//        }



//
//        switch (code) {
//            case 100:
//                System.out.println(num1);
//                break;
//                case 200:
//                    System.out.println(num2);
//                    case 300:
//                        System.out.println(num3);
//                        break;
//        }

//
//
//
//
//

        String str1 = "Hello World!";

        int[] num1 = {1,23423,3,4,34234,6,7,8};

        Employee[] employees = new Employee[20];

        e.historyTransactionsIDs = new int[10];


        e.historyTransactionsIDs[0] = 234;
        e.historyTransactionsIDs[1] = 232;
        e.historyTransactionsIDs[2] = 34656;
        e.historyTransactionsIDs[6] = 37;


        System.out.println(e.historyTransactionsIDs[0]);
        System.out.println(e.historyTransactionsIDs[4]);

        employees[0] = new Employee();
        System.out.println(employees[0]);
        System.out.println(employees[10]);




    }


    public static boolean eqTwoVariables(int a, int b) {
        return a == b;
    }

    public void test1() {
        System.out.println(num);


    }

}
