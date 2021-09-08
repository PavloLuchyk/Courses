package task.controller;

import task.model.Record;
import task.view.View;

import java.util.Scanner;

/**
 * The Controller class has only one execution method
 *
 */
public class Controller {
    /**
     * Model is part of MVC pattern, in this case Record class is used
     */
    public Record model;
    /**
     * The View class is responsible for output
     */
    public View view;

    /**
     * @param model Record class object
     * @param view View class object
     */
    public Controller(Record model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * The method makes business logic execute and uses Recorder and Scanner objects
     */
    public void execute() {
        Recorder recorder = new Recorder(view, model);
        Scanner scanner = new Scanner(System.in);
        recorder.makeRecord(scanner);
    }
}
