package lesson_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysMain {

    static int lengthForArrays = 20;



    public static void main(String[] args) {

        TransactionsDB transactionsDB = new TransactionsDB();

        transactionsDB.historyTransactionsIDs = new int[20];


        System.out.println(transactionsDB.simpleHistory);

        System.out.println(transactionsDB.historyTransactionsIDs[10]);

        transactionsDB.historyTransactionsIDs[10] = 178;

        System.out.println(transactionsDB.historyTransactionsIDs[10]);

        transactionsDB.historyTransactionsIDs[0] = 234;
        transactionsDB.historyTransactionsIDs[1] = 234;
        transactionsDB.historyTransactionsIDs[2] = 34234;
        transactionsDB.historyTransactionsIDs[3] = 23124;
        transactionsDB.historyTransactionsIDs[4] = 231;
        transactionsDB.historyTransactionsIDs[5] = 4234;

        String str = "Hello"; // str = ссылка на место в памяти где лежит строка "Hello"  string-pool

        String str2 = "Hello";


        int[] arrayInt = new int[30];
        arrayInt[0] = 1223;


        ArrayList<Integer> arrayList = new ArrayList<>();  // diamond operator <>


        arrayList.add(2123); // int[] arrayList = new int [];
        arrayList.add(234); // arrayList[1] = 234;
        arrayList.add(34234); // arrayList[2] = 34234;


        for (int i = 0; i < arrayList.size() - 1; i++) {
            arrayList.add(i);

            System.out.println(arrayList.get(i));
        }





        // Цикл
//        for (int count = 0; count <= transactionsDB.historyTransactionsIDs.length - 1; count++) { // transactionsDB.historyTransactionsIDs.length - 1 = 19
//
//            // Заполняем массив значением из переменной i
//            transactionsDB.historyTransactionsIDs[count] = count + 2;
//
//
//            // Выводим значения из текущей ячейки массива
//            System.out.println(transactionsDB.historyTransactionsIDs[count]);
//
//
//        }
//
//        //breakpoint - бряки
//
    }

//    static void printArray(int[] array) {
//
//    }


}
