package src.output;

import java.awt.Color;

import javax.swing.JPanel;

public class Background extends JPanel {
    private Ruler ruler;

    public Background() {
        // System.out.println("fuuuuck"); OKAY
        ruler = Ruler.getInstance();
        setSize(ruler.windowSize.width,ruler.windowSize.height);
        setBackground(Color.DARK_GRAY);
        setLocation(0, 0);
        setVisible(false);
    }
}
