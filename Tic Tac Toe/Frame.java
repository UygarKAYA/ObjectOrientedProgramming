import javax.swing.JFrame;

public class Frame {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tic-Tac-Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,250);
		frame.setLocation(550,200);
		frame.setResizable(false);
		frame.getContentPane().add(new ButtonClicked());
		frame.setVisible(true);
	}
}
