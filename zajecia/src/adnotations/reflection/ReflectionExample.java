package adnotations.reflection;

/*
Refleksje w Javie to mechanizm, który pozwala na dynamiczne sprawdzanie struktury klasy, obiektów, pól, metod czy konstruktorów w czasie działania programu (runtime).
Dzięki refleksjom możemy także manipulować tymi elementami, np. wywoływać metody, odczytywać lub zmieniać wartości pól, nawet jeśli są one prywatne.
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    private final String secret = "Refleksje są potężne!";

    public void printMessage() {
        System.out.println("Hello from ReflectionExample!");
    }

    public static void main(String[] args) throws Exception {
        // Tworzymy obiekt klasy
        ReflectionExample example = new ReflectionExample();

        // Uzyskujemy dostęp do klasy przez refleksję
        Class<?> clazz = example.getClass();

        // Odczytanie nazw metod
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Metody klasy:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // Odczytanie i zmiana wartości prywatnego pola
        Field field = clazz.getDeclaredField("secret");
        field.setAccessible(true); // Omijamy modyfikator prywatny
        System.out.println("Pierwotna wartość pola 'secret': " + field.get(example));
        field.set(example, "Refleksje zostały zmienione!");
        System.out.println("Nowa wartość pola 'secret': " + field.get(example));
    }
}

