package adnotations.validated;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Adnotacja oznaczająca, że klasa (lub metoda) powinna być poddana pewnym regułom walidacji.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Validated {
    /**
     * Lista nazw reguł walidacyjnych, np. "NotEmpty", "EmailFormat".
     */
    String[] rules() default {};
}