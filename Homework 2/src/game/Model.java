package game;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int number;
    private int lowerBound;
    private int upperBound;
    private List<Integer> previousNumbers;

    public Model() {
        this.number = (int)(Math.random()*98)+1;
        lowerBound = 1;
        upperBound = 99;
        previousNumbers = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public List<Integer> getPreviousNumbers() {
        return previousNumbers;
    }

    public void setPreviousNumbers(List<Integer> previousNumbers) {
        this.previousNumbers = previousNumbers;
    }

    public boolean checkNumber(int guessedNumber) {
        previousNumbers.add(guessedNumber);
        if (guessedNumber==number) {
            return true;
        } else if (guessedNumber > number) {
            upperBound = guessedNumber;
        } else {
            lowerBound = guessedNumber;
        }
        return false;
    }
}
