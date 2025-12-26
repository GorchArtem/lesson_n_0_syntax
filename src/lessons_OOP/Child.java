package lessons_OOP;

public class Child extends Parent {
    String info = "это Child";

    // Переопределяем метод sayHello

    public void sayHello() {
        super.sayHello();
        System.out.println("hello Child");
    }

    public void printInfo() {
        System.out.println(info);
        System.out.println(super.info);
    }

    @Override
    public String toString() {
        return "Child{" +
                "info='" + info + '\'' +
                '}';
    }
}
