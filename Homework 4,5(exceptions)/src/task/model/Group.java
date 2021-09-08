package task.model;

import java.util.ResourceBundle;

/**
 * The enumeration that represents record group(e.g. FRIENDS)
 */
public enum Group {
    HOME("data.group.home"),
    WORK("data.group.work"),
    FRIENDS("data.group.friends");

    public final ResourceBundle resourceBundle= ResourceBundle.getBundle(
            "messages"
            //, new Locale("ua", "UA")
    );

    public final String messageKey;

    public final String value;

    private Group(String messageKey) {
        this.messageKey = messageKey;
        this.value = resourceBundle.getString(messageKey);
    }
}
