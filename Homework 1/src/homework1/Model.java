package homework1;

public class Model {

    private StringBuilder message;

    public Model() {
        message = new StringBuilder();
    }

    public void setMessage(StringBuilder message) {
        this.message = message;
    }

    public String getMessage() {
        return new String(message);
    }

    public Model addToMessage(String addedMessage) {
        message.append(addedMessage);
        return this;
    }
}
