package models;

public class EmailException extends Exception {
    public EmailException( String message ) {
        super(message);
    }

    @Override
    public String toString() {
        return "EmailException: " + super.toString();
    }
}
