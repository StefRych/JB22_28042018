package Task1;
//Stwórz za pomocą lambdy kalkulator, powinno być możliwe następujące wywołanie:
//public static void main(String... args)
// {
// Calculator myApp = new Calculator();
// IntegerMath addition = (a, b) -> a + b;
// IntegerMath subtraction = (a, b) -> a - b;
// System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
// System.out.println("20 10 = " + myApp.operateBinary(20, 10, subtraction));
// }

import java.util.function.IntBinaryOperator;

public class Calculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

//        IntegerMath add = (a,b) -> a + b;
//        IntegerMath sub = (a,b) -> a - b;
//        IntegerMath div = (a,b) -> a/b;
//
//        System.out.println(calculator.operateBinary(5,6,add));
//        System.out.println(calculator.operateBinary(5,6,sub));
//        System.out.println(calculator.operateBinary(5,6,div));

        System.out.println(calculator.operateBinary(5,6,(a,b)->a-b));
        System.out.println(calculator.operateBinary(5,6,(a,b)->a+b));

    }

//    private int operateBinary(int a, int b, IntegerMath integerMath){
//        return integerMath.operate(a, b);
//    }
    private int operateBinary(int a, int b, IntBinaryOperator integerMath){
        return integerMath.applyAsInt(a,b);
    }
}
