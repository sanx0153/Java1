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
    char[][] KeyNameMatrix =  { {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
                                {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', '?'},
                                {'z', 'x', 'c', 'v', 'b', 'n', 'm', '?', '?', '?'}};

    public Footer() {
        //Create instances
        ruler = Ruler.getInstance();
        createBackground();
        setLayout(null);
        setLocation(ruler.footerPlace);
        setSize(ruler.footerSize);
        setVisible(true);
        board = new Key[3][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Key();
                board[i][j].setLocation(j * ruler.keySide, i * ruler.keySide);
                board[i][j].setText(getKeyNameAString(i,j));
                board[i][j].setVisible(true);
                add(board[i][j].mainPanel,1);
            }
        }
    }

    //PRIVATE METHODS

    public String getKeyNameAString(int i, int j) {
        return String.valueOf(KeyNameMatrix[i][j]); // ver depois como formatar pra maiusculo
    }

    private void createBackground() {
        BG = new JPanel();
        BG.setBackground(Color.YELLOW);
        BG.setBorder(BorderFactory.createLineBorder(Color.black,2));
        add(BG,cons.getLayerNumberObject(0));
    }

    //GETTERS AND SETTERS


}
