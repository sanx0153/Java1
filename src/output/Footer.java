package src.output;

import javax.swing.JPanel;

public class Footer extends JPanel {
    private Ruler ruler;
    public Footer(Ruler ruler) {
        this.ruler = ruler;
        setLocation(this.ruler.footerPlace);
    }
}
