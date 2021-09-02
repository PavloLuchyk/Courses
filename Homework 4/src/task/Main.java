package task;

import task.controller.Controller;
import task.model.Record;
import task.view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Record(), new View());
        controller.execute();
    }
}
