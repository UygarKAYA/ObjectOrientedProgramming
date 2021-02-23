import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonClicked extends JPanel {
	
    private JButton button[] = new JButton[9];
    private static int count = 0;
    
    public ButtonClicked() {
    	this.setLayout(new GridLayout(3,3));
    	this.SetButton(); 
    }
    
    public void SetButton() {
    	int i=0;
    	while (i<9) {
    	    button[i] = new JButton();
            button[i].setText("");
            button[i].addActionListener(new buttonActionListener());
            
            add(button[i]);   
            i++;
    	}
    }
    
class buttonActionListener implements ActionListener {
    
	public void actionPerformed(ActionEvent event) {
		
		if (event.getSource() instanceof JButton) {
			JButton button = (JButton)event.getSource();

			if(button.getText().equals("")) {
				count++;
				if(count%2 == 1)
					button.setText("X");
	           		else if (count%2 == 0)
	           			button.setText("O");
			}

			if(WinCheck() == true) {
				if (button.getText().equals("X")) 
					JOptionPane.showMessageDialog(null, "Player X Win.");
				else if (button.getText().equals("O")) 
					JOptionPane.showMessageDialog(null, "Player O Win.");
				System.exit(0);
			}
		}
	}
	
	public boolean NextCellCheck(int a, int b) {
        	return button[a].getText().equals(button[b].getText()) && !button[a].getText().equals("");
    	}
        
	public boolean WinCheck() {
		
		if(NextCellCheck(0,1) && NextCellCheck(1,2))
			return true;
		else if(NextCellCheck(3,4) && NextCellCheck(4,5))
			return true;
		else if (NextCellCheck(6,7) && NextCellCheck(7,8))
			return true;
		
		if (NextCellCheck(0,3) && NextCellCheck(3,6))
			return true;  
		else if (NextCellCheck(1,4) && NextCellCheck(4,7))
			return true;
		else if (NextCellCheck(2,5) && NextCellCheck(5,8))
			return true;
		
		if (NextCellCheck(0,4) && NextCellCheck(4,8))
			return true;  
		else if (NextCellCheck(2,4) && NextCellCheck(4,6))
			return true;
		else
			return false;
        }
    }
}