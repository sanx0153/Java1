package src.output.lib;

import java.awt.Color;

import javax.swing.JLabel;

import src.output.Ruler;

public class Key extends JLabel {
    private Ruler ruler;

    public Key() {
        ruler = Ruler.getInstance();
        setSize(ruler.keySize.width, ruler.keySize.height);
        setBackground(Color.LIGHT_GRAY);
    }
}
