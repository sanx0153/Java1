package src.output;

import javax.swing.JPanel;

public class Background extends JPanel {
    private Ruler ruler;

    public Background(Ruler ruler) {
        // System.out.println("fuuuuck"); OKAY
        this.ruler = ruler;
        setSize(this.ruler.windowSize.width,this.ruler.windowSize.height);
    }
}
