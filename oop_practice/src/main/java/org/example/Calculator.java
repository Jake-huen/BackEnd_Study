package org.example;

import org.example.calculate.*;

import java.util.List;

public class Calculator {
    // interface를 구현한 4개의 구현체를 interface로 받는다.
    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(),new SubtractionOperator(),new MultiplicationOperator(),new DivisionOperator());
    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return arithmeticOperators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1,operand2))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("올바른 사칙연산이 아닙니다.")); // 연산자에 해당하는 것이 없는 경우
    }
}

//    if ("+".equals(operator)) {
//        return operand1 + operand2;
//    } else if ("-".equals(operator)) {
//        return operand1 - operand2;
//    } else if ("*".equals(operator)) {
//        return operand1 * operand2;
//    } else if ("/".equals(operator)) {
//        return operand1 / operand2;
//    }
//        return 0;

