/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-11-15 16:36:52 
 * Last modified  : 2022-11-15 16:36:52 
 */

package Calculator.implementation.UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
@SuppressWarnings("unused")
//import CSC1052.Projects.Calculator.implementation.UI.CalculatorFrame;
//import CSC1052.Projects.Calculator.implementation.UI.CalculatorMainDisplayText;
/**
 * the panel that will hold the text that is the display
 */
public class CalculatorMainDisplayPanel extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private CalculatorMainDisplayText m_displayText;
    private CalculatorFrame m_parent;

    public CalculatorMainDisplayPanel (CalculatorFrame parent) {
        m_parent = parent;
        setLayout(new BorderLayout());
        Dimension d = new Dimension(parent.getSize().width,parent.getSize().height/4);
        setSize (d);
        setPreferredSize(d);
        m_displayText = new CalculatorMainDisplayText(parent);
        add(m_displayText,BorderLayout.CENTER);
    }

    public void setDisplay (String value) {
        m_displayText.setText(value);
    }
    public void clearDisplay(){
        m_displayText.setText("");
    }
    public String getDisplay(){
        return m_displayText.getText();
    }
}