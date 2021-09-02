package task.controller;

import task.view.MessageKeys;
import task.view.View;

import java.util.Scanner;

/**
 * The class used to get correct string values due to regex
 */
public class UtilController {
    /**
     * View object
     */
    private View view;
    /**
     * Scanner object
     */
    private Scanner scanner;

    /**
     * @param view View object
     * @param scanner Scanner object
     */
    public UtilController(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    /**
     * The method takes regex and message and returns the string that matches to the regex
     * @param messageTypeKey Message type key that will be printed by View object
     * @param regex Regular expression that input String must match
     * @return String object that matches to the regex
     */
    public String getCorrectString(String messageTypeKey, String regex) {
        String value;
        view.printCompoundMessage(MessageKeys.INPUT.messageKey, messageTypeKey);
        while (!(value=scanner.next()).matches(regex)) {
            view.printCompoundMessage(MessageKeys.WRONG.messageKey,MessageKeys.INPUT.messageKey,messageTypeKey);
        }
        return value;
    }
}
