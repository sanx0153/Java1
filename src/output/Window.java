package src.output;

import java.awt.BorderLayout;
import javax.swing.*;

public class Window extends JFrame {
    private Ruler ruler;
    private Background BG;
    private Header header;
    private Body body;
    private Footer footer;

    public Window() {
        ruler = new Ruler();
        BG   = new Background(ruler);
        header = new Header(ruler);
        body = new Body(ruler);
        footer = new Footer(ruler);
        setWindowSettings();
        add(header,BorderLayout.NORTH);
        add(body,BorderLayout.CENTER);
    }
    private void setWindowSettings() {
        setLocation(this.ruler.windowLocation.x, this.ruler.windowLocation.y);
        setSize(this.ruler.windowSize.width, this.ruler.windowSize.height);
        setVisible(true);
        setLayout(new BorderLayout());
    }
}
