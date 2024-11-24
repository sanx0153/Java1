package src.output.lib;

import javax.swing.JLabel;

import src.output.Ruler;

public class Key extends JLabel {
    private Ruler ruler;

    public Key() {
        ruler = Ruler.getInstance();
        setSize(ruler.keySize.width, ruler.keySize.height);
    }
}
