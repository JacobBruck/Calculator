/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-11-15 16:36:05 
 * Last modified  : 2022-11-15 17:13:15
 */

/**
 * A test application for a calculator.
 *
 * @summary short description for the file
 * @author Mark Anderson
 *
 * Created at     : 2021-03-30 20:44:55 
 * Last modified  : 2022-11-14 13:05:44
 */

package Calculator.implementation.base;

import java.util.ArrayList;
import java.util.Scanner;

import Calculator.implementation.UI.CalculatorFrame;
import Calculator.implementation.mathEngine.*;
import Calculator.interfaces.*;

@SuppressWarnings("unused")
public class CalculatorTest {
    /**
     * lists out the operations available
     * 
     * @param calcEngine
     */
    private static void ListOperations(ICalculator calcEngine) {
        System.out.println(calcEngine.toString());
    }

    /**
     * the main entry point for the test application.
     * 
     * @param args
     */
    public static void main(String[] args) {
        ICalculator calc = new CalculatorEngine();

       
        ArrayList<IOperand> operands = new ArrayList<IOperand>();
        IOperand operand = new CalculatorOperand();
        IOperation operation = new CalculatorOperation();
        //implement UI CalculatorFrame
        CalculatorFrame cFrame = new CalculatorFrame(calc);
/*      //comment out entire do loop as all that we need is the calculator frame here
        // this tests the operations...
        do {
            System.out.print("enter operation L for list of available: ");
            op = ioOps.nextLine();
            switch (op) {
                case "L": {
                    ListOperations(calc);
                    break;
                }
                case "+": {
                    operation.setOperation(op);
                    break;
                }

                case "-": {
                    operation.setOperation(op);
                    break;
                }

                case "*": {
                    operation.setOperation(op);
                    break;
                }

                case "/": {
                    operation.setOperation(op);
                    break;
                }

                case "=": {
                    // this is where to run the operation.
                    if ((operands.size() == 2) && (operand.isSet())) {
                        ICalculatorAnswer a = calc.doOperation(operation, operands);
                        System.out.println("the answer is : " + a.getAnswer().toString());
                        // clear out the operands
                        operands = new ArrayList<IOperand>();
                    }
                }
                default: {
                    try {
                        int x = Integer.parseInt(op);
                        operand = new CalculatorOperand();
                        operand.setValue("int", 0, x);
                        operands.add(operand);
                    } catch (NumberFormatException e) {
                        try {
                            double d = Double.parseDouble(op);
                            operand = new CalculatorOperand();
                            operand.setValue("double", d, 0);
                            operands.add(operand);
                        } catch (NumberFormatException ne) {
                            System.out.println("not a number ! could be the quit");
                        }
                    }
                }
            }
        } while (!op.equalsIgnoreCase("Q"));
        ioOps.close(); */
    }
}
