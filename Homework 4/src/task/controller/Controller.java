package task.controller;

import task.model.Record;
import task.view.View;

import java.util.Scanner;

public class Controller {
    public Record model;
    public View view;

    public Controller(Record model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        Recorder recorder = new Recorder(view, model);
        Scanner scanner = new Scanner(System.in);
        recorder.makeRecord(scanner);
    }
}
