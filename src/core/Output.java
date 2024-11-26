package src.core;

import src.output.Window;

public class Output {
    private Window window;
    public Output() {
        window = new Window();
    }
    public void Update() {
        window.Update();
    }
}
