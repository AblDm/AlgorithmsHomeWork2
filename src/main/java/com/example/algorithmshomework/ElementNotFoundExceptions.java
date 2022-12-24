public class ElementNotFoundExceptions extends RuntimeException {
    public ElementNotFoundExceptions() {
    }

    public ElementNotFoundExceptions(String message) {
        super(message);
    }

    public ElementNotFoundExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotFoundExceptions(Throwable cause) {
        super(cause);
    }

    public ElementNotFoundExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
