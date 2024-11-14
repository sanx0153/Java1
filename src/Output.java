package src;
import javax.swing.*;
import java.awt.*;

public class Output {
    JFrame frame;
    JPanel backgroundPanel;
    JPanel bottomPanel;
    JPanel centerPanel;
    JPanel topPanel;
    JButton exitButton;
    JButton newButton;
    JLabel[][] panelLabels;

    public Output() {
        //System.out.println("Output");
        createWindow();
        createPanels();
    }
    
    private void createPanels() {
        createTopPanel();
        createCenterPanel();
        createBottomPanel();
    }

    private void createTopPanel() {
        topPanel = new JPanel();
        topPanel.setBackground(Color.CYAN);
        topPanel.setSize(600, 100);
        //topPanel.setBounds(0, 0, 600, 100);
        topPanel.repaint();
        frame.add(topPanel);
    }

    private void createCenterPanel() {
        centerPanel = new JPanel();
        createButtonsArray();
        frame.add(centerPanel);
        centerPanel.setBounds(0, 100, 600, 450);
        centerPanel.setVisible(true);
    }

    private void createButtonsArray() {
        JLabel[][] panelLabels = new JLabel[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                panelLabels[j][i] = new JLabel();
                panelLabels[j][i].setSize(150, 150);
                centerPanel.add(panelLabels[j][i]);
                panelLabels[j][i].setText(String.valueOf(i) + String.valueOf(j));
            }
        }
    }

    private void createBottomPanel() {
        bottomPanel = new JPanel();
    }

    private void createWindow() {
        frame = new JFrame("Tic");
        frame.setBackground(Color.BLACK); // not working
        frame.repaint(); // not needed because above does not work
        frame.setLayout(new FlowLayout());
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
