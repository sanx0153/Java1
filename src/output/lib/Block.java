package src.output.lib;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import src.output.*;

public class Block extends JLabel {
    private Ruler ruler;
    public Block() {
        // System.out.println("block born"); OKAY
        this.ruler = Ruler.getInstance();
        setSize(this.ruler.slotSize.width,this.ruler.slotSize.height);
        setBackground(Color.GREEN);
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3, true));
        setVisible(true);
    }
}
