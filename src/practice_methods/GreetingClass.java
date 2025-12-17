package practice_methods;

import javax.sound.midi.Soundbank;

public class GreetingClass {

    public void printHello(String name){
        String greeting = "Привет, " + name; // конкатенация - склеивание строк
        System.out.println(greeting);
    }

    // Просто невозвращаемый метод void, который рисует прямоугольник
    public void drawRectangle(int width, int height) {
       ///  нам нужно чтобы символ * выводился с новых строк width-количество раз
    }

    public void draw(int height) {
        for (int i = 0; i < height; i++) {
            System.out.println("*"); //

        }
    }

}
