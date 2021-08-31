package game;

public class View {
    public static final String INVALID_INPUT_MESSAGE = "Invalid input! ";
    public static final String INPUT_MESSAGE ="Please type number according to the bounds: from ";
    public static final String TO = " to ";
    public static final String CONGRATS = "Congratulations! You won, here is your number guessing history: ";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
