package lessons_OOP;

import lessons_OOP.zoo.*;

// Абстракция
// Полиморфизм
public class TestAbstractClasses {

    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        Dog dog = new Dog();
        Cat cat = new Cat();
        dolphin.eat();


        Zoo zoo = new Zoo();


        zoo.addAnimal(dolphin);
        zoo.addAnimal(dog);
        zoo.addAnimal(cat);

        zoo.printAnimals();
    }
}
