package pl.sda.zamowienia.exceptions.price;

public class EmailException extends Exception {
    public EmailException(String message) {
        super(message);
    }

    public EmailException() {
    }
}
