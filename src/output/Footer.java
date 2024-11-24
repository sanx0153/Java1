package src.output;

import src.output.lib.*;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Footer extends JPanel {
    private Ruler ruler;
    private Key[][] board;
    public Footer() {
        ruler = Ruler.getInstance();
        board = new Key[10][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Key();
                board[i][j].setVisible(true);
                board[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 3, true));
                board[i][j].setLocation(i * ruler.keySize.width, j * ruler.keySize.height);
                add(board[i][j]);
            }
        }
        setLocation(this.ruler.footerPlace.x,this.ruler.footerPlace.y);
        setSize(this.ruler.footerSize.width,this.ruler.footerSize.height);
        setBackground(Color.ORANGE);
        setVisible(true);
    }
}
