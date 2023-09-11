/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-11-15 16:37:20 
 * Last modified  : 2022-11-15 16:37:20 
 */

package Calculator.implementation.UI;


import java.awt.*;
import javax.swing.JPanel;
/**
 * this acts as a format placeholder.  Since the Layout 
 * manager will not allow the buttons to flow correctly.
 */
public class CalculatorRightSidePanel extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private CalculatorFrame m_parent;
    private CalculatorOperationPanel m_opsPanel;
    /**
     * the constructor for the panel that holds the panel
     * of buttons.
     * @param parent
     */
    protected CalculatorRightSidePanel (CalculatorFrame parent){
        m_parent = parent;
        setLayout(new BorderLayout());
        m_opsPanel = new CalculatorOperationPanel(m_parent);
        add(m_opsPanel,BorderLayout.CENTER);
    } 

}
