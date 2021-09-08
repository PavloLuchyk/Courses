package task.model;

public enum DBRecord {
    USER("user1234"),
    ADMIN("adminOnly"),
    VASYL("vasya2011");


    private final String login;

    public String getLogin() {
        return login;
    }

    DBRecord(String login) {
        this.login = login;
    }
}
