/**
 * long description for the file
 *
 * @summary short description for the file
 * @author Jacob Bruck
 *
 * Created at     : 2022-11-15 16:37:04 
 * Last modified  : 2022-11-15 16:37:04 
 */

package Calculator.implementation.UI;

import javax.swing.JPanel;

import java.awt.*;

public class CalculatorNumberPanel extends JPanel {
    private CalculatorFrame m_parent;
    private CalculatorButton[] m_buttons;
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public CalculatorNumberPanel (CalculatorFrame parent) {
        m_parent = parent;
        setLayout(new GridLayout(4,3,10,10) );
        m_buttons = new CalculatorButton[12];
        for (int i = 7;i<10;i++){
            m_buttons[i] = new CalculatorButton(this, i);
            add(m_buttons[i]);
        }
        for (int i=4;i<7;i++){
            m_buttons[i] = new CalculatorButton(this, i);
            add(m_buttons[i]);
        }
        for (int i=1;i<4;i++) {
            m_buttons[i] = new CalculatorButton(this, i);
            add(m_buttons[i]);
        }
        //this needs to end up blank may replace with a panel..
        m_buttons[10] = new CalculatorButton(this,-1);
        add(m_buttons[10]);
        
        m_buttons[11] = new CalculatorButton(this,0);
        add(m_buttons[11]);

        m_buttons[10] = new CalculatorButton(this,-2);
        add(m_buttons[10]);
    }

    public CalculatorFrame getParentCalculatorFrame(){
        return m_parent;
    }
}
