package task.controller;

import task.view.MessageKeys;
import task.view.View;

import java.util.Scanner;

public class UtilController {
    private View view;
    private Scanner scanner;

    public UtilController(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public String getCorrectString(String messageTypeKey, String regex) {
        String value;
        view.printCompoundMessage(MessageKeys.INPUT.messageKey, messageTypeKey);
        while (!(value=scanner.next()).matches(regex)) {
            view.printCompoundMessage(MessageKeys.WRONG.messageKey,MessageKeys.INPUT.messageKey,messageTypeKey);
        }
        return value;
    }
}
