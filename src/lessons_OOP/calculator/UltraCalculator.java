package lessons_OOP.calculator;

public class UltraCalculator {

    public void calculate(SpecificNumber number1, SpecificNumber number2, String action) {
        switch (action) {
            case "-":
                System.out.println(number1 + " - " + number2);
                case  "+":
                System.out.println(number1 + " + " + number2);
                default: System.out.println(number1 + " - " + number2);
        }
    }
}
