package task.view;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 * The class is responsible for the view and makes console output
 */
public class View {

    private final String messagesBundle = "messages";
    private ResourceBundle resourceBundle = ResourceBundle.getBundle(messagesBundle
                                                                    , new Locale("ua","UA")
                                                                    );

    public void printCompoundMessage(String... messageKeys) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String messageKey: messageKeys) {
            stringBuffer.append(resourceBundle.getString(messageKey))
                    .append(" ");
        }
        System.out.println(stringBuffer);
    }

    public ResourceBundle getResourceBundle() {
        return resourceBundle;
    }
}
