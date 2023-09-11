/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-11-15 16:36:26 
 * Last modified  : 2022-11-15 16:36:26 
 */

package Calculator.implementation.mathEngine;

import java.util.Stack;

import Calculator.interfaces.IOperand;
import Calculator.interfaces.IOperation;
@SuppressWarnings("unused")
/**
 * implementation of a simple memory organization.
 */
public class CalculatorMemory {
    private Stack<IOperand> m_stack;  //for the future.
    private IOperand m_registerOne;
    private IOperand m_registerTwo;
    private IOperation m_lastOp;

    public CalculatorMemory() {
        m_stack = new Stack<IOperand>();
        m_registerOne = new CalculatorOperand();
        m_registerTwo = new CalculatorOperand();
        m_lastOp = new CalculatorOperation();
    }
    public void clearRegister (String regID){
        if(regID.equalsIgnoreCase("1"))
            m_registerOne = new CalculatorOperand();
        else
            m_registerTwo = new CalculatorOperand();
    }
    /**
     * builds the number in the text field.
     * @param value the digit to append to the field.
     */
    public void setRegisterOne(String value){
        if (value.length()==0){
            clearRegister("1");
            return;
        }
        StringBuffer val = new StringBuffer(String.valueOf(m_registerOne.getInt()));
        val.append(value);
        m_registerOne.setValue("int", 0, Integer.parseInt(val.toString()));
    }
    /**
     * gets the string value that is in the register.
     * @return
     */
    public String getRegisterOne () {
        String rtnString = String.valueOf(m_registerOne.getInt());
        return rtnString;
    }
    /**
     * hold the "other" value to be worked with.
     * @param registerOneValue
     */
    public void setRegisterTwo (String registerOneValue){
        if(registerOneValue.length()==0) {
            clearRegister("2");
            return;
        }

        m_registerTwo.setValue("int", 0, Integer.parseInt(registerOneValue));
    }
    /**
     * get the operation that is in "memory"
     * @return
     */
    public String getRegisterTwo(){
        return String.valueOf(m_registerTwo.getInt());
    }
    /**
     * set the operation to store
     * @param opValue
     */
    public void setOperation (String opValue){
        m_lastOp.setOperation(opValue);
    }
    /**
     * get the operation that is stored.
     * @return
     */
    public IOperation getOperation (){
        return m_lastOp;
    }
}
