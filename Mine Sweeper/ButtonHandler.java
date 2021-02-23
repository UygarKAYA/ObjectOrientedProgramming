import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

    private int row;
    private int column;
    private MineGrid mineGrid;

    public ButtonHandler(int row, int column, MineGrid mineGrid) {
        this.row = row;
        this.column = column;
        this.mineGrid = mineGrid;
    }
    
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.mineGrid.isMine(this.row, this.column)) {
            JOptionPane.showMessageDialog(null, "GAME OVER!");
            System.exit(0);
        } else {
            if (actionEvent.getSource() instanceof JButton) {
                JButton button = (JButton) actionEvent.getSource();
                button.setText(String.valueOf(this.mineGrid.getCellContent(this.row, this.column)));
            }
        }    
    }
}
