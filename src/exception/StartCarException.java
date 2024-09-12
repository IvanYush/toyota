package exception;

/**
 * Проверка на ошибку, может ли машина начать движение.
 */
public class StartCarException extends Exception {

    public StartCarException(String message) {
        super(message);
    }
}