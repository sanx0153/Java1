package src;
import src.core.*;
public class Application {
    static Input input;
    static Logic logic;
    static Output output;
    public static void main(String[] args) {
        input  = new Input();
        logic  = new Logic();
        output = new Output();
    }
}