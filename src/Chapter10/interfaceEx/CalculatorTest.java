package Chapter10.interfaceEx;

public class CalculatorTest {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 3;

        Calc calc = new CompleteCalc();
        System.out.println(calc.divide(num1,num2));
    }
}
