package lesson_simple_examples_methods;

public class Car {
    String model;
    Engine engine;

    // дефолтный конструктор
    public Car() {
    }

    // конструктор с установлением параметров
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }


}
