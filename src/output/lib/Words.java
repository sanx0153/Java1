package src.output.lib;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import src.output.*;

public class Words extends JPanel {
    private Block[] letters;
    private Ruler ruler;
    public Words(Ruler ruler) {
        // System.out.println("word born"); TEST OK
        this.ruler = ruler;
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setVisible(true);
        letters = new Block[5];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = new Block(ruler);
            letters[i].setLocation(1 + (i * 61), 1);
            add(letters[i]);
        }
        setSize((letters.length * 61) + 1,64);
    }
}
