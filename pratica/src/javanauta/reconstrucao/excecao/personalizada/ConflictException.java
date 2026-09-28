package reconstrucao.excecao.personalizada;

public class  ConflictException extends RuntimeException {

    // Métodos Construtores

    public ConflictException(String message) {
        super(message);
    }

    public ConflictException(String message, Throwable cause) {
        super(message, cause);
    }
}
