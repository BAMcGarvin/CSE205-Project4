//**************************************************************************************************************
// CLASS: BinaryOperator
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
 * BinaryOperator is the superclass of all binary operators.
 */
public abstract class BinaryOperator extends Operator {

    public BinaryOperator() {
    }

    /**
     * Called to evaluate the operator.
     */
    public abstract Operand evaluate(Operand pLhsOperand, Operand pRhsOperand);

    /**
     * Returns true since all subclasses of BinaryOperator are binary operators.
     */
    @Override
    public boolean isBinaryOperator() {
        return true;
    }

}
