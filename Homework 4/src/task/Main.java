package task;

import task.controller.Controller;
import task.controller.Regexes;
import task.model.Record;
import task.view.MessageKeys;
import task.view.View;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Record(), new View());
        controller.execute();
    }
}
