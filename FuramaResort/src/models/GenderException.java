package models;

public class GenderException extends Exception {
    public GenderException( String message ) {
        super(message);
    }

    @Override
    public String toString() {
        return "GenderException{} " + super.toString();
    }
}
