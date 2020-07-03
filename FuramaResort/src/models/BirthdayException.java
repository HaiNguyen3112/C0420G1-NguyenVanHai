package models;

public class BirthdayException extends Exception {
    public BirthdayException( String message ) {
        super(message);
    }

    @Override
    public String toString() {
        return "BirthdayException{} " + super.toString();
    }
}
