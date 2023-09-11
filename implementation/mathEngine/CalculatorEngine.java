

/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-11-14 12:15:35 
 * Last modified  : 2022-11-14 13:04:46
 */

/**
 * the implementation of the calcultor engine
 *
 * @summary short description for the file
 * @author Mark Anderson
 *
 * Created at     : 2021-03-30 20:43:45 
 * Last modified  : 2021-03-30 20:44:08
 */
package Calculator.implementation.mathEngine;

import java.util.ArrayList;

import Calculator.interfaces.ICalculatorAnswer;
import Calculator.interfaces.IOperand;
import Calculator.interfaces.IOperation;
import Calculator.interfaces.ICalculator;
/**
 * This class implements the ICalculator interface.
 * To add Calculator functions:
 * 1 update the arraylist of operations in the constructor
 * 2 add the operation to the doOperations switch statement
 * 3 implement the operation.
 */
public class CalculatorEngine implements ICalculator{
    private ArrayList<IOperation> m_operations;

    public CalculatorEngine() {
    }
    
    /** 
     * This method  is where the operations are added to the calculator engine.
     * Once they are added here you need to implement them by adding the code 
     * to the doOperation method so that they are invoked from the outside.  After
     * adding to  the doOperation method the operations need to be implemented here.
     * This is done by adding a method that returns an IOperand and takes in the 
     * necessary parameters to do the operation.
     * @return int
     */
    protected int setOperations (){  //protected class to set different operations for the calculator to perform
        m_operations = new ArrayList<IOperation>();
        IOperation op = new CalculatorOperation();
        op.setOperation("+");  //additiom
        m_operations.add(op);
        
        op = new CalculatorOperation();
        op.setOperation("-");  //subtraction
        m_operations.add(op);

        op = new CalculatorOperation();
        op.setOperation("*");  //multiplication
        m_operations.add(op);

        op = new CalculatorOperation();
        op.setOperation("/");  //division
        m_operations.add(op);

        op = new CalculatorOperation();
        op.setOperation("%");  //modulus
        m_operations.add(op);

        op = new CalculatorOperation();
        op.setOperation("^");  //exponents
        m_operations.add(op);

        
    
        return m_operations.size();
    }
    
    /** 
     * @return ArrayList<IOperation>
     */
    @Override
    public ArrayList<IOperation> getOperations() {
        if((null == m_operations) || (0 == m_operations.size()))
            setOperations();
            
        return m_operations;
    }

    
    /** 
     * @param op
     * @param operands
     * @return ICalculatorAnswer
     */
    @Override
    public ICalculatorAnswer doOperation(IOperation op, ArrayList<IOperand> operands) {
        IOperand ans = new CalculatorOperand();
        ICalculatorAnswer calcAns = new CalculatorAnswer();
        switch(op.getOperation()){  //create an getOperation function for each operation
            case "+":
            case "add": {
                if(operands.size()>=2)
                    ans = add((operands.get(0)), operands.get(1));
                break;
            }
            case "-":
            case "sub":{
                ans = subtract(operands.get(0), operands.get(1));
                break;
            }

            case "*":
            case "mult":{
                ans = multiply(operands.get(0), operands.get(1));
                break;
            }

            case "/":
            case "div":{
                ans = divide(operands.get(0), operands.get(1));
                break;
            }

            case "%":
            case "mod":{
                ans = modulus(operands.get(0), operands.get(1));
                break;
            }

            case "^":
            case "pow":{
                ans = power(operands.get(0), operands.get(1));
                break;
            }
        }
        calcAns.setAnswer(ans.getType(), ans);
        return calcAns;
    }
            /*case "^":
            case "pow":{
                ans = power(operands.get(0), operands.get(1));
                break;
            }*
        }
        calcAns.setAnswer(ans.getType(), ans);
        return calcAns;
    }
    /**
     * This is the Addition operation.
     * @param op1 the first number to add
     * @param op2 the second number to add
     * @return the result of adding one and two.
     */
    private IOperand add(IOperand op1, IOperand op2){
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()){
            case ("int"):{
                opAnswer.setValue("int", 0.0,op1.getInt() + op2.getInt());
                break;
            }
            case ("double"):{
                opAnswer.setValue("double", op1.getDouble()+op2.getDouble(), 0);
                break;
            }
        }
        return opAnswer;
    }
    /**
     * implement the subtraction operation.
     * @param op1 the first operand
     * @param op2 the second operand
     * @return op1 - op2
     */
    private IOperand subtract (IOperand op1, IOperand op2) {
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()) {
            case ("int"):{
                opAnswer.setValue("int", 0, op1.getInt()-op2.getInt());
                break;
            }
            case ("double"):{
                opAnswer.setValue("double",op1.getDouble()-op2.getDouble() , 0);
                break;
            }
        }
        return opAnswer;
    }
    
    /** 
     * @param op1
     * @param op2
     * @return IOperand
     */
        /**
     * This is the Division operation.
     * @param op1 the first number to add
     * @param op2 the second number to add
     * @return the result of adding one and two.
     */
    private IOperand divide (IOperand op1, IOperand op2) {
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()) {
            case ("int"):{
                opAnswer.setValue("int", 0, op1.getInt()/op2.getInt());
                break;
            }
            case ("double"):{
                opAnswer.setValue("double",op1.getDouble()/op2.getDouble() , 0);
                break;
            }
        }
        return opAnswer;
    }
    
    /**
     * this is the modulus operation.
     * @param op1 the first operand
     * @param op2 the second operand
     * @return op1 - op2
     */
    private IOperand modulus (IOperand op1, IOperand op2) {
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()) {
            case ("int"):{
                opAnswer.setValue("int", 0, op1.getInt()%op2.getInt());
                break;
            }
            case ("double"):{
                opAnswer.setValue("double",op1.getDouble()%op2.getDouble() , 0);
                break;
            }
        }
        return opAnswer;
    }
    
    /** 
     * @param op1
     * @param op2
     * @return IOperand
     */
        /**
     * this is the Multiplication operation.
     * @param op1 the first number to add
     * @param op2 the second number to add
     * @return the result of adding one and two.
     */
    private IOperand multiply (IOperand op1, IOperand op2) {
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()) {
            case ("int"):{
                opAnswer.setValue("int", 0, op1.getInt()*op2.getInt());
                break;
            }
            case ("double"):{
                opAnswer.setValue("double",op1.getDouble()*op2.getDouble() , 0);
                break;
            }
        }
        return opAnswer;
    }
    
    /** 
     * @param op1
     * @param op2
     * @return IOperand
     */
        /**
     * This is the exponential operation.
     * @param op1 the first number to add
     * @param op2 the second number to add
     * @return the result of adding one and two.
     */
    private IOperand power (IOperand op1, IOperand op2) {
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()) {
            case ("int"):{
                double i = Math.pow(op1.getInt(), op2.getInt());
                opAnswer.setValue("int", 0, (int)Math.floor(i));
                break;
            }
            case ("double"):{
                double a = Math.pow(op1.getDouble(),op2.getDouble());
                opAnswer.setValue("double",a , 0);
                break;
            }
        }
        return opAnswer;
    }
    
    /** 
     * @return String
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("The operations are : \n");
        for (IOperation iOperation : getOperations()) {
            sb.append(iOperation.getOperation() + "\n");
        }
        return sb.toString();
    }
}
