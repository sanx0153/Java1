package src.output;
import java.awt.*;
import java.awt.Toolkit;

public class Ruler {
    private Dimension screenSize;
    public boolean isPortrait;
    public boolean isLandscape;
    public int windowHeight;
    public int windowWidth;
    public int windowX;


    public Ruler() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize().getSize(); // gets Dimension from the screen
        isPortrait = screenSize.width < screenSize.height; // decides orientation
        isLandscape = !isPortrait; // redundancy desired
        windowHeight = screenSize.height; // pretty clear
        windowWidth = windowHeight * 9 / 16; // Aspect Ratio 16:9
        windowX = (screenSize.width - windowWidth) / 2; // Location for the X point centering the window on the screen
    }
}
