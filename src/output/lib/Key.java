package src.output.lib;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import src.core.*;
import src.output.Ruler;

public class Key {
    private Ruler ruler;
    private Font font;
    private JLabel label;
    private JPanel BG;
    public JLayeredPane mainPanel;

    public Key() {
        ruler = Ruler.getInstance();
        createMainPanel();
        createBackground();
        createLabel();
    }
    
    public void createBackground() {
        BG = new JPanel();
        BG.setSize(ruler.keySize.width - 4, ruler.keySize.height - 4);
        BG.setBackground(Color.cyan);
        setVisible(true);
        mainPanel.add(BG,cons.getLayerNumberObject(1));
    }

    public void createLabel() {
        label = new JLabel();
        int screenResolution = (int) Toolkit.getDefaultToolkit().getScreenResolution();
        int fontSize = (int) (ruler.keySize.height * 0.85 * 72 / screenResolution);
        font = new Font("Helvetica", Font.BOLD, fontSize);
        label.setBackground(null);
        label.setSize(ruler.keySize.width - 2, ruler.keySize.height - 2);
        label.setFont(font);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        label.setText("!");
        label.setVisible(true);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(label,BorderLayout.CENTER);
        mainPanel.setLayer(label, 2);
    }
    private void createMainPanel() {
        mainPanel = new JLayeredPane();
        mainPanel.setLayout(null);
        mainPanel.setSize(ruler.keySize.width,ruler.keySize.height);
        mainPanel.setVisible(true);
    }

    public void setText(String text) {
        label.setText(text);
    }
    public void setVisible(boolean value) {
        mainPanel.setVisible(value);
    }
    public void setLocation(int x, int y) {
        mainPanel.setLocation(x, y);
    }
}
