package lessons_OOP.zoo;

public class Dolphin extends Animal {
    @Override
    public void run() {
        System.out.println("Dolphin run");
    }

    @Override
    public void eat() {
        System.out.println("Dolphin eat");
    }
}
