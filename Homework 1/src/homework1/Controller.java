package homework1;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);

        model.addToMessage(validateAndGetMessage(scanner,
                "Hello", View.HELLO_INPUT_MESSAGE, View.HELLO_ERR_MESSAGE))
            .addToMessage(validateAndGetMessage(scanner,
                    "world!", View.WORLD_INPUT_MESSAGE, View.WORLD_ERR_MESSAGE));

        view.printMessage(model.getMessage());

    }

    //Utils
    public String validateAndGetMessage(Scanner scanner, String neededMessage, String inputMessage, String errorMessage) {
        String message;
        view.printMessage(inputMessage);
        while (!(message = scanner.next()).equals(neededMessage)) {
            view.printMessage(errorMessage);
        }
        return message;
    }
}
