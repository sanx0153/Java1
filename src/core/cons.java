package src.core;

public class cons {
    static int layerCode;
    public cons() {
    }
/*     static public Dimension gridSize() {

    }*/
    static public Object getLayerNumberObject(int N) {
        layerCode = Integer.valueOf(N);
        return layerCode;
    }
}
