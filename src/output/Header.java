package src.output;

import src.output.lib.*;


import javax.swing.JPanel;


public class Header extends JPanel {
    private Ruler ruler;
    private Button[] dummy;

    public Header() {
        ruler = Ruler.getInstance();
        setLayout(null);
        setSize(ruler.headerSize.width + 4,ruler.headerSize.height + 2);
        setLocation(ruler.headerPlace);
        dummy = new Button[2];
        for (int i = 0; i < dummy.length; i++) {
            dummy[i] = new Button();
            dummy[i].setSize(ruler.buttonSize.width, ruler.buttonSize.height);
            dummy[i].setLocation(1 + i * ruler.buttonSide * 2, 1);
            add(dummy[i]);
        }
        setVisible(true);
    }
}
