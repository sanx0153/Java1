package src.output.lib;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import src.output.*;

public class Block extends JPanel {
    private Ruler ruler;
    public Block(Ruler ruler) {
        // System.out.println("block born"); OKAY
        this.ruler = ruler;
        setSize(this.ruler.slotSize.width,this.ruler.slotSize.height);
        setBackground(Color.GREEN);
        setBorder(BorderFactory.createSoftBevelBorder(1));
        setVisible(true);
    }
}
