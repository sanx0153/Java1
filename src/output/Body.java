package src.output;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import src.output.lib.*;

public class Body extends JPanel {
    private Words[] words;
    private Ruler ruler;
    public Body(Ruler ruler) {
        this.ruler = ruler;
        setLayout(new BorderLayout());
        setBackground(Color.CYAN);
        setVisible(true);
        words = new Words[7];
        setSize(310,2 + (65 * words.length));
        for (int i = 0; i < words.length; i++) {
            words[i] = new Words();
            words[i].setLocation(words[i].getLocation().x, i * 65);
            add(words[i],BorderLayout.CENTER);
        }
    }
}
