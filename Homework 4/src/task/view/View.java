package task.view;

import java.util.Locale;
import java.util.ResourceBundle;

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
