import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class mouseClick extends MouseAdapter {

	 private int row;
	 private int column;
	 private MineGrid mineGrid;

	 public mouseClick(int row, int column, MineGrid mineGrid) {
		 this.row = row;
		 this.column = column;
		 this.mineGrid = mineGrid;
	 }
	    
	public void mouseClicked(MouseEvent e) {
		
		JButton button = (JButton) e.getSource();

		// We add the Flag when we right click and We remove the Flag which is clicked when we right clicked.
		if (SwingUtilities.isRightMouseButton(e)) {
			if (e.getClickCount()==1)
				button.setText(String.valueOf("F"));
			else if (e.getClickCount()==2)
				button.setText(String.valueOf(" "));
		}

		// We show the Massage if All Mines are Flagged
		if (this.mineGrid.AllMinesFlagged()) {
			if (this.mineGrid.isMine(row, column)) {
				JOptionPane.showMessageDialog(null, "You're Gunius!");
				System.exit(0);
			}
		}
	}
}
