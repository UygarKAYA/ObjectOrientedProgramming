import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ResetButtonProcessor implements ActionListener {
	
	 private JRadioButton RadioButton;
	 private JTextField TextField;
	 private JLabel label;
	 
	 public ResetButtonProcessor(JRadioButton RadioButton, JTextField TextField, JLabel label) {
		 this.RadioButton = RadioButton;
		 this.TextField = TextField;
		 this.label = label;
	 }
	 
	 public void actionPerformed(ActionEvent e) {
		 label.setText("Hi.");
		 TextField.setText("");
		 RadioButton.setSelected(true);
	 }
}
