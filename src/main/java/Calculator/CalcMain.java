package Calculator;

import Calculator.Calc;

public class CalcMain {

    public static void main(String[] args) {

        //Create a object
        Calc calculator = new Calc();
        //objectName.MethodName();
        System.out.println(calculator.add(3.0, 8.0));
        System.out.println(calculator.sub(8.0,3.0));
        System.out.println(calculator.mul(8.0,3.0));

    }

}
