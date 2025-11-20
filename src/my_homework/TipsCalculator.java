package my_homework;

import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TipsCalculator {
    static double costOfOrder; // стоимость заказа
    static double tipsAmount1; // сумма чаевых
    static double tipsAmount2;
    static double tipsAmount3;
    static int service; // обслуживание


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите стоимость заказа в рублях: ");
        costOfOrder = input.nextDouble();
        System.out.print("Как Вам обслуживание? Поставьте оценку от 1 до 10: ");
        service = input.nextInt();

        tipsAmount1 = costOfOrder * 0.2;
        tipsAmount2 = costOfOrder * 0.15;
        tipsAmount3 = costOfOrder * 0.05;


        // && - логическое И
        // || - логическое ИЛИ
        if (service > 10 || service < 1) {
            System.out.println("Некорректное значение оценки");
        } else if (service == 10) {
            System.out.println("Отличное обслуживание. Сумма чаевых " + (int) tipsAmount1 + " руб. или 20% от суммы заказа");
        } else if (service >= 7) {
            System.out.println("Хорошее обслуживание. Сумма чаевых " + (int) tipsAmount2 + " руб. или 15% от суммы заказа");
        } else if (service >= 1) {
            System.out.println("Плохое обслуживание. Сумма чаевых " + (int) tipsAmount3 + " руб. или 5% от суммы заказа");
        }
//        else if (service < 1) {
//            System.out.println("Некорректное значение оценки");
//        }

    }

}






/*
2) Задача "Калькулятор чаевых"
Рассчитать сумму чаевых based on качества обслуживания.
Задание:
-Отличное обслуживание: 20% от счета
-Хорошее обслуживание: 15% от счета
-Плохое обслуживание: 5% от счета
*/
