import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TripleWithRadioButtonsPanel extends JPanel {
	
	private JTextField textField;
	private JLabel label;
	private JButton button1,button2;
	private JRadioButton radioButton1,radioButton2;
	
	public TripleWithRadioButtonsPanel() {
		
		label = new JLabel("Hi.");
		textField = new JTextField(15);
		button1 = new JButton("Append");		
		button2 = new JButton("Reset");
		radioButton1 = new JRadioButton("lowercase",true);
		radioButton2 = new JRadioButton("UPPERCASE",false);
		
		add(label);
		add(textField);
		add(button1);
		add(button2);
		add(radioButton1);
		add(radioButton2);	
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);
		
		button1.addActionListener(new ButtonProcessor(radioButton1, textField, label));
		button2.addActionListener(new ResetButtonProcessor(radioButton1, textField, label));
		textField.addActionListener(new ButtonProcessor(radioButton1, textField, label));
	}
}
