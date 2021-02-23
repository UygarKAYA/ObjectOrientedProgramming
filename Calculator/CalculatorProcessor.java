import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class CalculatorProcessor implements ActionListener {
	 
	private JLabel label;
	
	public CalculatorProcessor(JLabel label) { this.label = label; }
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();
			
			if (button.getText().equals("=")) {
			    if (label.getText().contains("+")) {
					String array[] = label.getText().trim().split("\\+");
					double sum = 0;
					for (int i = 0; i < array.length; i++) {
					    double number = Double.parseDouble(array[i]);
					    sum += number;
					}
					label.setText("" + sum);
			        } 
			    else if (label.getText().contains("x")) {
					String array[] = label.getText().trim().split("x");
					double multiplication = 1;
					for (int i = 0; i < array.length; i++) {
					    double number = Double.parseDouble(array[i]);
					    multiplication *= number;
					}
					label.setText("" + multiplication);
				} 
			    else if (label.getText().contains("-")) {
					String array[] = label.getText().trim().split("-");
					double subtract = 0;
					if (array.length > 1) {
						subtract = Double.parseDouble(array[0]);
						for (int i = 1; i < array.length; i++) {
							double number = Double.parseDouble(array[i]);
							subtract -= number;
						}
					}
					label.setText("" + subtract);
				} 
			    else if (label.getText().contains("/")) {
					String array[] = label.getText().trim().split("/");
					double division = 0;
					for (int i = 0; i < array.length; i++) {
					    double number = Double.parseDouble(array[i]);
					    if (i == 0)
					    	division = number;
					    else
					    	division = division/number;
					}
					label.setText("" + division);
			    }
			} 
			else if (button.getText().equals("C"))
			    label.setText(" ");
			else
			    label.setText(label.getText() + button.getText());
		}
    }
}
