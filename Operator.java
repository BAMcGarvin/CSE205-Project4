// **************************************************************************************************************
// CLASS: Operator
//
// CSE 205: Object Oriented Programming and Data Structures
// Session A Fall 2018
// Project 4
//
//
// AUTHOR
// Bradley McGarvin
// **************************************************************************************************************

/**
 * Operator is the superclass of all binary and unary
 * operators.
 */
public abstract class Operator extends Token {

   public Operator() {

   }

   public abstract boolean isBinaryOperator();

   public abstract int precedence();

   public abstract int stackPrecedence();

}
