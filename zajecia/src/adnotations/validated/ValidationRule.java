package adnotations.validated;

public interface ValidationRule {
    /**
     * Nazwa reguły, np. "NotEmpty", "EmailFormat".
     */
    String getName();

    /**
     * Sprawdza, czy obiekt jest poprawny zgodnie z regułą.
     * Zwraca 'true' jeśli jest ok, lub rzuca ValidationException gdy niepoprawny.
     */
    void validate(Object obj) throws ValidationException;
}
