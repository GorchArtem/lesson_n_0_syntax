package my_homework;

public class CoffeeMachine {

    int waterAmount;
    int coffeeAmount;

    public CoffeeMachine() {
    }

    public CoffeeMachine(int waterAmount, int coffeeAmount) {
        this.waterAmount = waterAmount; // this == coffeeMachine1
        this.coffeeAmount = coffeeAmount; // this == coffeeMachine1
    }

    public CoffeeMachine(int waterAmount, int coffeeAmount, String coffeeName) {

    }

    public static void main (String[] args) {

    }

    public CoffeeMachine testTest() {
        return this;
    }


}

//Создать класс CoffeeMachine
//Добавить переменную waterAmount(количество воды), coffeeAmount (количество кофе).
//Создать конструктор класса CoffeeMachine, который принимает начальные значения воды и кофе.
//Создать метод getValueOfCoffeeAndWater(), который при вызове выводит текст "количество воды = {waterAmount значение}, количество кофе = {coffeeAmount значение}"
//Создать класс для тестирование - TestMain, внутри него создать метод main.
//Внутри метода main создать объект класса CoffeeMachine, передать в параметры его конструктора значения для waterAmount и coffeeAmount.
//Вызывать у созданного объекта метод getValueOfCoffeeAndWater и проверить запуск метода main