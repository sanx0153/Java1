package src.output.lib;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Block extends JPanel {
    public Block() {
        // System.out.println("block born"); OKAY
        setSize(60,60);
        setBackground(Color.GREEN);
        setBorder(BorderFactory.createSoftBevelBorder(1));
        setVisible(false);
    }
}
