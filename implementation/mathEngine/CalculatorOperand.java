/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-11-15 16:36:33 
 * Last modified  : 2022-11-15 16:36:33 
 */

/**
 * the implementation of the calculator operands
 *
 * @summary short description for the file
 * @author Mark Anderson
 *
 * Created at     : 2021-03-30 20:43:11 
 * Last modified  : 2021-03-30 20:43:32
 */


package Calculator.implementation.mathEngine;

import Calculator.interfaces.IOperand;

public class CalculatorOperand implements IOperand{
    private String m_operandType;
    private double m_doubleValue;
    private int m_intValue;
    private boolean m_isSet = false;

    @Override
    public String getType() {
        return m_operandType;
    }

    @Override
    public void setType(String opTypeName) {
        m_operandType = opTypeName;
    }

    @Override
    public double getDouble() {
        return m_doubleValue;
    }
    //convert base 10 to hex?
    //private int toHex(int inputValue){}
    //private int from;
    @Override
    public void setValue(String typeName, double valueD, int valueI) {
        switch (typeName){
            case ("int"):{
                m_operandType = typeName;
                m_intValue = valueI;
                m_isSet = true;
                break;
            }
            case ("double"):{
                m_operandType = typeName;
                m_doubleValue = valueD;
                m_isSet = true;
                break;
            }
            case ("string") : {
                m_operandType = typeName;
                try{
                m_intValue = valueI;
                }catch(NumberFormatException e) {
                    m_intValue = 0;
                }
                break;
            }
            default: {
                break;
            }
        }
    }

    @Override
    public int getInt() {
        return m_intValue;
    }
    
    public String toString(){
        if(m_operandType.equals("double"))
            return Double.toString(m_doubleValue);
        else if (m_operandType.equals("int"))
            return Integer.toString(m_intValue);
        return "NULL";
    }

    @Override
    public boolean isSet() {
        
        return m_isSet;
    }
}
