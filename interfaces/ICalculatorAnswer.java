/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-11-15 16:37:50 
 * Last modified  : 2022-11-15 16:37:50 
 */

/**
 * An interface to build for supplying answers
 * for the calculator
 *
 * @summary calculator answer
 * @author Mark Anderson
 *
 * Created at     : 2021-03-30 20:37:43 
 * Last modified  : 2021-03-30 20:38:26
 */


package Calculator.interfaces;

/**
 * a simple answer for a math problem interface
 */
public interface ICalculatorAnswer {
    /**
     * set the type of the answer to the problem
     * @param typeName int or double
     * @param answer the result
     */
    public void setAnswer(String typeName, IOperand answer);
    public IOperand getAnswer();
}
