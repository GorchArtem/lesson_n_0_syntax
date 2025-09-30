package lesson_arrays;

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



        // Цикл
        for (int count = 0; count <= transactionsDB.historyTransactionsIDs.length - 1; count++) { // transactionsDB.historyTransactionsIDs.length - 1 = 19

            // Заполняем массив значением из переменной i
            transactionsDB.historyTransactionsIDs[count] = count + 2;


            // Выводим значения из текущей ячейки массива
            System.out.println(transactionsDB.historyTransactionsIDs[count]);


        }

        //breakpoint - бряки

    }

    static void printArray(int[] array) {

    }


}
