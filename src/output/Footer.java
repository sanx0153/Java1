package src.output;

import src.output.lib.*;
import src.core.*;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Footer extends JLayeredPane {
    private Ruler ruler;
    private Key[][] board;
    private JPanel BG;

    public Footer() {
        ruler = Ruler.getInstance();
        BG = new JPanel();
        BG.setBackground(Color.YELLOW);
        BG.setBorder(BorderFactory.createLineBorder(Color.black,2));
        setLayout(null);
        setLocation(ruler.footerPlace);
        setSize(ruler.footerSize);
        setVisible(true);  add(BG,cons.getLayerNumberObject(0));
        board = new Key[3][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Key();
                board[i][j].setLocation(j * ruler.keySide, i * ruler.keySide);
                board[i][j].setVisible(true);
                add(board[i][j].mainPanel,1);
            }
        }
  
    }

}
