package adnotations.validated.rules;

import adnotations.validated.ValidationException;
import adnotations.validated.ValidationRule;

import java.lang.reflect.Field;

public class EmailFormatRule implements ValidationRule {

    @Override
    public String getName() {
        return "EmailFormat";
    }

    @Override
    public void validate(Object obj) throws ValidationException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            // sprawdzajmy, czy nazwa pola zawiera "email"
            if (field.getName().toLowerCase().contains("email")
                    && field.getType().equals(String.class)) {
                field.setAccessible(true);
                try {
                    String value = (String) field.get(obj);
                    if (value != null && !value.matches("^[^@]+@[^@]+\\.[^@]+$")) {
                        throw new ValidationException("Pole " + field.getName() + " nie jest poprawnym adresem email!");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}