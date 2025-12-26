package lessons_OOP;


// 4 принципа ООП:
// 1 - Наследование

public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        child.sayHello();
        child.printInfo();

        System.out.println(child);

        NewObject newObject = new NewObject();
        newObject.sayHello();
    }
}
