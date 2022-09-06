package OH.OH_29_30.CustomExceptions;

public class InvalidBrowserTypeException extends RuntimeException{

    public InvalidBrowserTypeException(String message) {
        super(message);
    }
}