package models;

public class NameException extends Exception {
    public NameException( String message ) {
        super(message);
    }

    @Override
    public String toString() {
        return "NameException: " + super.toString();
    }
}
