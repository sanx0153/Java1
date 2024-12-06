package src.output.lib;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import src.core.*;
import src.output.Ruler;

public abstract class GraphicElement {
        private Ruler ruler;
        private Font font;
        private JLabel label;
        private JPanel BG;
        private Dimension mySize;
        private Dimension BGSize;
        public JLayeredPane mainPanel;
    
        public GraphicElement() {
            ruler = Ruler.getInstance();
            stateMeasures();
            createMainPanel();
            createBackground();
            createLabel();
        }
        
        public void createBackground() {
            BG = new JPanel();
            BG.setSize(BGSize);
            BG.setVisible(true);
            mainPanel.add(BG,cons.getLayerNumberObject(1));
        }
    
        private void createLabel() {
            label = new JLabel();
            int screenResolution = (int) Toolkit.getDefaultToolkit().getScreenResolution();
            int fontSize = (int) (mySize.height * 0.85 * 72 / screenResolution);
            font = new Font("Helvetica", Font.BOLD, fontSize);
            label.setBackground(null);
            label.setSize(mySize.width - 2, mySize.height - 2);
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
            mainPanel.setSize(mySize);
            mainPanel.setVisible(true);
        }
        public void paintGreen() {
            setSkin(Color.GREEN);
        }
        public void paintRed() {
            setSkin(Color.RED);
        }
        public void paintYellow() {
            setSkin(Color.YELLOW);
        }
        public void setText(String text) {
            label.setText(text);
        }
        private void setSkin(Color color) {
            BG.setBackground(color);
        }
        private void setVisible(boolean value) {
            mainPanel.setVisible(value);
        }
    
        private void stateMeasures() {
            mySize = new Dimension(ruler.getSize(getClass().getName()));
            BGSize = new Dimension(mySize.width - 4, mySize.height - 4);
        }
    
        public void setLocation(int x, int y) {
            mainPanel.setLocation(x, y);
        }
}
