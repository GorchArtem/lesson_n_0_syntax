package lesson_simple_examples_methods;



public class TestMethodsExamples {

    static int num1 = 10;
    static int num2 = 5; //
    static int num3 = num2; //



    public static void main(String[] args) {

        num2 = 20;


        System.out.println("Result of num3 and num2 " + (num3 + num2)); // конкатенация

        System.out.println("Result of x = " + formulaForX(10, 15));


        Fabric fabric = new Fabric();


        fabric.employees[0] = new Employee();

//        fabric.employees[0].name = "Jack";

        Employee employee = new Employee();
        employee.name = "sfsdfsdfsdf";


        System.out.println(fabric.employees[0].name); //null

        Cat cat = new Cat();
        cat.run();



// ------------- ------------- ------------- -------------

        Car car = new Car();
        Engine engine = new Engine();

        engine.model =  "123qwe";
        car.engine = engine;


        Car car2 =  new Car("Mersedez", new Engine());
        System.out.println(car2.engine);

    }

    // x + 10 = 15;

    static int formulaForX(int y1, int result1) {
        int x = 0;

        return x = result1 - y1;


    }



}
