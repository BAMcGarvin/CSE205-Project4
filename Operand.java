// **************************************************************************************************************
// CLASS: Operand
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
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token {

   private Double mValue;

   public Operand(Double pValue) {
      setValue( pValue );
   }

   /**
    * Accessor method to return the value.
    */
   public Double getValue() {
      return mValue;
   }

   /**
    * Mutator method to assign value to mValue.
    */
   public void setValue(Double pValue) {
      mValue = pValue;
   }
}
