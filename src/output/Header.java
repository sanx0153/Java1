package src.output;

import javax.swing.JPanel;

import src.output.lib.Words;

public class Header extends JPanel {
    private Ruler ruler;
    private Words dummy;

    public Header() {
        ruler = Ruler.getInstance();
        setLayout(null);
        setSize(ruler.windowSize.width * 2,ruler.buttonSize.height);
        setLocation(ruler.headerPlace);
        dummy = new Words();
        dummy.setSize(ruler.buttonSize);
        setVisible(true);
        add(dummy);
    }
}
