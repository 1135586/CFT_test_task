package Exception;

/**
 * Created by dmi on 03.07.17.
 */
public class DatatypeStrategyFactoryException extends Exception{
    private String message;

    public DatatypeStrategyFactoryException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
