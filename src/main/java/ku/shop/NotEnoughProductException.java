package ku.shop;

public class NotEnoughProductException extends RuntimeException {
    public NotEnoughProductException(){}
    public NotEnoughProductException(String message) {
        super(message);
    }
}
