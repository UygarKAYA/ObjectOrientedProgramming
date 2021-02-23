import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class JOperatorButton extends JButton {
	
	 public JOperatorButton(String text, CalculatorProcessor calculatorHandler) {
		 super(text);
		 this.setBackground(Color.LIGHT_GRAY);
		 this.setFont(new Font("Courier", Font.PLAIN, 20));
		 this.addActionListener(calculatorHandler);
	 }
}
