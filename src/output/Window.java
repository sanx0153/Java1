package src.output;


import java.awt.LayoutManager;

import javax.swing.*;

public class Window extends JFrame {
    private Ruler ruler;
    private Background BG;
    private Header header;
    private Body body;
    private Footer footer;
    private JLayeredPane mainPanel;

    public Window() {
        ruler = Ruler.getInstance();
        BG   = new Background();
        header = new Header();
        body = new Body();
        footer = new Footer();
        setWindowSettings();
        mainPanel = new JLayeredPane();
        mainPanel.setSize(ruler.windowSize);
        //mainPanel.setLayout();
        mainPanel.add(BG,Integer.valueOf(1));
        mainPanel.add(header,Integer.valueOf(2));
        mainPanel.add(body, Integer.valueOf(2));
        mainPanel.add(footer, Integer.valueOf(2));
        mainPanel.setVisible(true);
        add(mainPanel);
    }
    private void setWindowSettings() {
        setLayout(null);
        setLocation(this.ruler.windowLocation.x, this.ruler.windowLocation.y);
        setSize(this.ruler.windowSize.width, this.ruler.windowSize.height);
        setUndecorated(true);
        setAlwaysOnTop(true);
        setVisible(true);
    }
}
