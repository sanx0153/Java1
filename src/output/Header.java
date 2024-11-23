package src.output;

import javax.swing.JPanel;

import src.output.lib.Words;

public class Header extends JPanel {
    private Ruler ruler;
    private Words dummy;

    public Header(Ruler ruler) {
        this.ruler = ruler;
        setLayout(null);
        setSize(this.ruler.windowSize.width,this.ruler.buttonSize.height);
        setLocation(this.ruler.headerPlace);
        dummy = new Words(this.ruler);
        dummy.setSize(this.ruler.buttonSize);
        setVisible(true);
        add(dummy);
    }
}
