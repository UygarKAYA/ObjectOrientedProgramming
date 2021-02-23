import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class JOperandButton extends JButton {
	
	 public JOperandButton(String text, CalculatorProcessor calculatorHandler) {
		 super(text);
		 this.setBackground(Color.WHITE);
		 this.setFont(new Font("Courier", Font.PLAIN, 20));
		 this.addActionListener(calculatorHandler);
	 }
}
