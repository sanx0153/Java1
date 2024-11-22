package src.output;

import javax.swing.JPanel;

import src.output.lib.Words;

public class Header extends JPanel {
    private Ruler ruler;
    private Words dummy;

    public Header(Ruler ruler) {
        this.ruler = ruler;
        this.setLayout(null);
        this.setSize(this.ruler.buttonSize.width,this.ruler.buttonSize.height);
        this.dummy = new Words(ruler);
        add(dummy);
    }
}