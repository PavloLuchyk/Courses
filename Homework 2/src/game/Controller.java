package game;

import java.util.Scanner;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
         this.view = view;
         this.model = model;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        while (!model.checkNumber(getValidInteger(scanner)));
        System.out.println(View.CONGRATS+model.getPreviousNumbers());
    }

    public int getValidInteger(Scanner scanner) {
        view.printMessage(View.INPUT_MESSAGE+model.getLowerBound()+View.TO+model.getUpperBound());
        int number;
        while (true) {
            if (scanner.hasNextInt()) {
                number=scanner.nextInt();
                if (checkBounds(number)) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println(View.INVALID_INPUT_MESSAGE+
                    View.INPUT_MESSAGE+model.getLowerBound()+View.TO+model.getUpperBound());
        }
        return number;
    }

    public boolean checkBounds(int number) {
        if (number > model.getLowerBound()&&number<model.getUpperBound()){
            return true;
        } else {
            return false;
        }
    }
}
