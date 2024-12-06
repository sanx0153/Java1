
package src.output;

import java.awt.Color;

import javax.swing.JPanel;
import src.output.lib.*;

public class Body extends JPanel {
    private Words[] words;
    private Ruler ruler;
    public Body() {
        ruler = Ruler.getInstance();
        setLayout(null);
        setBackground(Color.CYAN);
        setVisible(true);
        words = new Words[7];
        setSize(this.ruler.bodySize);
        setLocation(this.ruler.bodyPlace);
        for (int i = 0; i < words.length; i++) {
            words[i] = new Words();
            words[i].setLocation(0, i * this.ruler.slotSide);
            add(words[i]);
        }
    }
}
