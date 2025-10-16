package lang;

// 2025.10.16
public class NotExistException extends Exception {
    public NotExistException() {
    }

    public NotExistException(String message) {
        super(message);
    }
}
