package src.output.lib;

import javax.swing.JButton;

import src.output.Ruler;

public class Button extends JButton {
    private Ruler ruler;

    public Button() {
        ruler = Ruler.getInstance();
        setSize(ruler.buttonSize);
        setVisible(true);
    }
}
