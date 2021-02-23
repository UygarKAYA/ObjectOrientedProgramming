import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class Calculator {

	public static void main(String[] args) {
		
		JFrame Calculator = new JFrame("Calculator");
		Calculator.setSize(300, 300);
		Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.WHITE);
		topPanel.setLayout(new BorderLayout());
		Calculator.add(topPanel,BorderLayout.NORTH);
		
		JLabel label = new JLabel(" ");
		label.setFont(new Font("Courier", Font.PLAIN, 20));
		label.setLayout(new BorderLayout());
		topPanel.add(label,BorderLayout.EAST);
		
		CalculatorProcessor handler = new CalculatorProcessor(label);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(5,4));
		Calculator.add(mainPanel,BorderLayout.CENTER);
		
		mainPanel.add(new JOperandButton("", handler));
		mainPanel.add(new JOperandButton("", handler));
		mainPanel.add(new JOperandButton("", handler));
		mainPanel.add(new JOperandButton("C", handler));
		mainPanel.add(new JOperandButton("7", handler));
		mainPanel.add(new JOperandButton("8", handler));
		mainPanel.add(new JOperandButton("9", handler));
		mainPanel.add(new JOperatorButton("/", handler));
		mainPanel.add(new JOperandButton("4",handler));
		mainPanel.add(new JOperandButton("5",handler));
		mainPanel.add(new JOperandButton("6",handler));
		mainPanel.add(new JOperatorButton("x",handler));
        mainPanel.add(new JOperandButton("1",handler));
        mainPanel.add(new JOperandButton("2",handler));
        mainPanel.add(new JOperandButton("3",handler));
        mainPanel.add(new JOperatorButton("-",handler));
        mainPanel.add(new JOperandButton("0",handler));
        mainPanel.add(new JOperandButton(".",handler));
        mainPanel.add(new JOperatorButton("=",handler));
        mainPanel.add(new JOperatorButton("+",handler));
		
		Calculator.setVisible(true);
	}

}
