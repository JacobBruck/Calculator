/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-11-15 16:36:11 
 * Last modified  : 2022-11-15 16:36:11 
 */

package Calculator.implementation.mathEngine;

import Calculator.interfaces.ICalculatorAnswer;
import Calculator.interfaces.IOperand;

public class CalcAnsDemo implements ICalculatorAnswer {
    public String m_typeName;
    IOperand m_answer;
    @Override
    public void setAnswer(String typeName, IOperand answer) {
        m_answer = answer;
        m_typeName = typeName;
        
    }
    public String getType() {
        return m_typeName;
    }
    @Override
    public IOperand getAnswer() {
        return m_answer;
    }
    
}
