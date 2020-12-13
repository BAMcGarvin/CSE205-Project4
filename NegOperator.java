//**************************************************************************************************************
// CLASS: NegOperator
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
 * Represents the negation operator which is a specific type of unary operator.
 */
public class NegOperator extends UnaryOperator {

    public NegOperator() {
    }

    /**
     * Returns the operand as a negative
     */
    @Override
    public Operand evaluate(Operand pOperand) {
        return new Operand(-pOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence() {
        return 4;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
    public int stackPrecedence() {
        return 4;
    }

}