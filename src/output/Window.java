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
        setLocation(this.ruler.windowX, this.getLocation().y);
        setSize(this.ruler.windowWidth, this.ruler.windowHeight);
        setVisible(true);
        setLayout(new BorderLayout());
        add(body,BorderLayout.CENTER);
    }
}
