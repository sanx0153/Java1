package src.output;

import java.awt.BorderLayout;
import javax.swing.*;

public class Window extends JFrame {
    Background BG;
    Head head;
    Body body;
    Foot foot;

    public Window() {
        BG   = new Background();
        head = new Head();
        body = new Body();
        foot = new Foot();
        setSize(600, 600);
        setVisible(true);
        setLayout(new BorderLayout());
        add(body,BorderLayout.CENTER);
    }
}
