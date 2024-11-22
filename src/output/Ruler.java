package src.output;
import java.awt.*;
import java.awt.Toolkit;

public class Ruler {
    private Dimension screenSize;
    public boolean isPortrait;
    public boolean isLandscape;
    public Dimension windowSize;
    public Point windowLocation;
    private Dimension keySize;
    private Dimension slotSize;
    private Dimension buttonSize;
    


    public Ruler() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize().getSize(); // gets Dimension from the screen
        isPortrait = screenSize.width < screenSize.height; // decides orientation
        isLandscape = !isPortrait; // redundancy desired
        windowSize = new Dimension();
        windowSize.height = screenSize.height; // pretty clear
        windowSize.width = windowSize.height * 9 / 16; // Aspect Ratio 16:9
        if (windowSize.width > screenSize.width) { // If screen is weird, fits it back
            windowSize.width = screenSize.width;
            windowSize.height = windowSize.width * 16 / 9;
        } 
        windowLocation = new Point(((screenSize.width - windowSize.width) / 2), ((screenSize.height - windowSize.height) / 2));
        //keyWidth = ;
        //keyHeight = ;
    }
}
