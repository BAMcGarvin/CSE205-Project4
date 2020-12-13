//**************************************************************************************************************
// CLASS: DivOperator
//
// CSE 205: Object Oriented Programming and Data Structures
// Session A Fall 2018
// Project 4
//
//
// AUTHOR
// Bradley McGarvin
//**************************************************************************************************************

/**
 * Represents the division operator which is a specific type of binary operator.
 */
public class DivOperator extends BinaryOperator {

    public DivOperator() {
    }

    /**
     * Returns the result of the left-hand side operand divided by the right-hand side operand.
     */
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() / pRhsOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence() {
        return 3;
    }

    /**
     * Returns the precedence level of this operator when it is on the operator stack.
     */
    @Override
    public int stackPrecedence() {
        return 3;
    }

}