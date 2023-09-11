/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-11-15 16:37:45 
 * Last modified  : 2022-11-15 16:37:45 
 */

/**
 * An interface to build a calculator around.
 *
 * @summary calculator interface
 * @author Mark Anderson
 *
 * Created at     : 2021-03-30 20:36:04 
 * Last modified  : 2021-03-30 20:36:25
 */

package Calculator.interfaces;

import java.util.ArrayList;
/**
 * the interface for a calculator project.
 */
public interface ICalculator {
    /**
     * gets the list of the available operations
     * @return the arraylist of operations
     */
    public ArrayList<IOperation> getOperations();
    /**
     * do the operation
     * @param op the operation to do
     * @param operands the operands required for the operation
     * @return the result of the operation.
     */
    public ICalculatorAnswer doOperation(IOperation op,ArrayList<IOperand> operands);
}
