package adnotations.my_log;

/*
@Retention
Określa, kiedy adnotacja ma być widoczna (retencja):

RetentionPolicy.SOURCE – widoczna tylko w trakcie kompilacji, nie trafia do bytecode.
RetentionPolicy.CLASS – zapisywana w bytecode, ale niedostępna w czasie uruchomienia (domyślnie).
RetentionPolicy.RUNTIME – zapisywana w bytecode i dostępna w czasie wykonania przez refleksję.

@Target
Określa, gdzie(na czym) można używać adnotacji:

ElementType.TYPE – adnotacja może być na klasie/interfejsie.
ElementType.METHOD – na metodzie.
ElementType.FIELD – na polu.
ElementType.PARAMETER – na parametrze metody itd.

@Inherited
Jeśli adnotacja znajduje się na klasie bazowej, może być dziedziczona przez klasy pochodne.

@Documented
Jeśli adnotacja jest oznaczona @Documented, to będzie uwzględniona w generowanej dokumentacji (np. Javadoc).

 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyLog {
    String value() default "Default message";
    boolean active() default true;
}

/*
@Retention(RetentionPolicy.RUNTIME) – chcemy ją widzieć podczas uruchomienia (np. do refleksji).
@Target(ElementType.METHOD) – adnotacja jest przeznaczona dla metod.
Możemy dodać atrybuty (parametry) – w przykładzie value() i active().
Domyślne wartości default.
 */
