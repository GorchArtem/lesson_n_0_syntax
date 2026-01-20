package lessons_OOP.calculator;

public class TestCalc {
    public static void main(String[] args) {
        UltraCalculator ultraCalculator = new UltraCalculator();

        ArabicNumber arabicNumber = new ArabicNumber();
        RomeNumber romanNumber = new RomeNumber();
        SomeNumber someNumber = new SomeNumber();
        romanNumber.print();


        ultraCalculator.calculate(arabicNumber, romanNumber, "-");


        ultraCalculator.calculate(someNumber, arabicNumber, "+");
    }
}
