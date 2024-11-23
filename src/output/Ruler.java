package src.output;
import java.awt.*;

public class Ruler {
    private int maxHeight;
    private Dimension screenSize;
    public boolean isPortrait;
    public boolean isLandscape;
    public Dimension windowSize;
    public Point windowLocation;
    public Dimension keySize;
    public Dimension slotSize;
    public Dimension buttonSize;
    public Dimension headerSize;
    public Dimension bodySize;
    public Dimension footerSize;
    public Point headerPlace;
    public Point bodyPlace;
    public Point footerPlace;
    private Dimension headerMatrix;
    private Dimension bodyMatrix;
    private Dimension footerMatrix;



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
        setHeaderSize(2, 1);
        setBodySize(5, 7);
        setFooterSize(10, 3);
        calculateDimensions();
        calculateDivisionDimensions();
        calculatePlaces();
        //keyWidth = ;
        //keyHeight = ;
    }
    private void calculateDimensions() {
        int headerMaxWidth = windowSize.width / headerMatrix.width;
        int bodyMaxWidth = windowSize.width / bodyMatrix.width;
        int footerMaxWidth = windowSize.width / footerMatrix.width;
        maxHeight = windowSize.height / (headerMatrix.height + bodyMatrix.height + footerMatrix.height);
        int keySide = Math.min(footerMaxWidth, maxHeight);
        int slotSide = Math.min(bodyMaxWidth, maxHeight);
        int buttonSide = Math.min(headerMaxWidth, maxHeight);
        keySize = new Dimension(keySide,keySide);
        slotSize = new Dimension(slotSide,slotSide);
        buttonSize = new Dimension(buttonSide,buttonSide);
    }

    private void calculateDivisionDimensions() {
        headerSize = new Dimension(windowSize.width,maxHeight * headerMatrix.height);
        bodySize = new Dimension(windowSize.width,slotSize.height * bodyMatrix.height);
        footerSize = new Dimension(windowSize.width,keySize.height * footerMatrix.height);
    }

    private void calculatePlaces() {
        bodyPlace = new Point(0,maxHeight * bodyMatrix.height / 2);
        headerPlace = new Point(0,(bodyPlace.y - headerSize.height) / 2);
        footerPlace = new Point(0,windowSize.height - (windowSize.height - (bodyPlace.y + bodySize.height + footerSize.height)));
    }

    public void setHeaderSize(int columns, int lines) {
        headerMatrix = new Dimension(columns,lines);
    }
    public void setBodySize(int columns, int lines) {
        bodyMatrix = new Dimension(columns,lines);
    }
    public void setFooterSize(int columns, int lines) {
        footerMatrix = new Dimension(columns,lines);
    }

}
