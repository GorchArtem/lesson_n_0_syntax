package lesson_dataStructure.Lists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListExamples {

    private int num = 10;

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); //

        list.add(0, 10);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Object[] arrObj = new Object[10];

        Object object1 = new Object();
        Integer integer = 2; // Integer(Object)


        arrObj[0] = object1;
        arrObj[1] = new ArrayListExamples();
        arrObj[2] = integer;


        ArrayList<Integer> list2 = new ArrayList<>(); // дженерики

        int count = 0;

        for (Integer i : list) { // Integer i = list.get(index)
            list2.add(i);

            System.out.println("Значение из list2 по индексу " + count + " = " + list2.get(count));

            count++;
        }




        while (!list.isEmpty()) { // проверяем, является ли массив пустым?

            list.remove(0);

        }


//        do {
//            System.out.println(list.get(0));
//        } while (!list.isEmpty());


    }

    public int getNum() { // метод геттер
        return 0;
    }

}
