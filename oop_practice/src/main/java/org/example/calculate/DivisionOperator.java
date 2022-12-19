package org.example.calculate;

public class DivisionOperator implements NewArithmeticOperator {

    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
//        if(operand2.toInt()==0){
//            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
//        }
        // positive number가 무조건 양수임을 보장하므로 validation check가 필요없다.
        return operand1.toInt() / operand2.toInt();
    }
}
