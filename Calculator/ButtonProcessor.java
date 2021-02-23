package Assignment9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ButtonProcessor implements ActionListener {
	
    private JRadioButton RadioButton;
    private JTextField TextField;
    private JLabel label;
    
    public ButtonProcessor(JRadioButton RadioButton, JTextField TextField, JLabel label) {
        this.RadioButton = RadioButton;
        this.TextField = TextField;
        this.label = label;
    }
    
    public void actionPerformed(ActionEvent e) {
        String toAppend = "";
        if(RadioButton.isSelected())
            toAppend = TextField.getText().toLowerCase();
        else
            toAppend = TextField.getText().toUpperCase();
        label.setText(label.getText() + toAppend);
        TextField.setText("");
    }
}
