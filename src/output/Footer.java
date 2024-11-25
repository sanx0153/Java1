package src.output;

import src.output.lib.*;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Footer extends JPanel {
    private Ruler ruler;
    private Key[][] board;
    public Footer() {
        setBackground(null);
        ruler = Ruler.getInstance();
        board = new Key[3][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Key();
                board[i][j].setLocation(j * ruler.keySide, i * ruler.keySide);
                board[i][j].setBackground(Color.BLUE);
                board[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 3, true));
                board[i][j].setVisible(true);
                add(board[i][j]);
            }
        }
        setLocation(ruler.footerPlace.x,ruler.footerPlace.y);
        setSize(ruler.footerSize.width,ruler.footerSize.height);
        setVisible(true);
    }
}
