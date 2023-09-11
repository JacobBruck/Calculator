/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-11-15 16:36:17 
 * Last modified  : 2022-11-15 16:36:17 
 */

/**
 * the implementation of the answer to the problem.
 *
 * @summary short description for the file
 * @author Mark Anderson
 *
 * Created at     : 2021-03-30 20:44:16 
 * Last modified  : 2022-11-15 16:36:14
 */
package Calculator.implementation.mathEngine;

import Calculator.interfaces.ICalculatorAnswer;
import Calculator.interfaces.IOperand;
@SuppressWarnings("unused")
/**
 * 
 */
public class CalculatorAnswer implements ICalculatorAnswer{
    private String m_typeName;
    private IOperand m_answer;
    @Override
    public void setAnswer(String typeName, IOperand answer) {
        m_answer = answer;
        m_typeName  = typeName;
    }
    @Override
    public IOperand getAnswer() {
        return m_answer;
    }
    public String toString (){
        return m_answer.toString();
    }   
}
