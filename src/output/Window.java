package src.output;

import java.awt.BorderLayout;
import javax.swing.*;

public class Window extends JFrame {
    private Ruler ruler;
    private Background BG;
    private Head head;
    private Body body;
    private Foot foot;

    public Window() {
        ruler = new Ruler();
        BG   = new Background(ruler);
        head = new Head(ruler);
        body = new Body(ruler);
        foot = new Foot(ruler);
        setWindowSettings();
        add(body,BorderLayout.CENTER);
    }
    private void setWindowSettings() {
        setLocation(this.ruler.windowLocation.x, this.ruler.windowLocation.y);
        setSize(this.ruler.windowSize.width, this.ruler.windowSize.height);
        setVisible(true);
        setLayout(new BorderLayout());
    }
}
