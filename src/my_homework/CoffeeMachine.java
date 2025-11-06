package my_homework;

public class CoffeeMachine {

    int waterAmount;
    int coffeeAmount;

//    public CoffeeMachine() {
//    }

    public CoffeeMachine(int waterAmount, int coffeeAmount) {
        this.waterAmount = waterAmount; // this == coffeeMachine1
        this.coffeeAmount = coffeeAmount; // this == coffeeMachine1
    }

//    public void setValueWaterAndCoffeeAmount(int waterAmount, int coffeeAmount) {
//        this.waterAmount = waterAmount;
//        this.coffeeAmount = coffeeAmount;
//    }

    public void getValueOfCoffeeAndWater() {
        System.out.println("количество воды = " + waterAmount + ", количество кофе = " +  coffeeAmount);
        System.out.printf("количество воды = %d, количество кофе = %d",  waterAmount, coffeeAmount);
    }


    public CoffeeMachine(int waterAmount, int coffeeAmount, String coffeeName) {

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