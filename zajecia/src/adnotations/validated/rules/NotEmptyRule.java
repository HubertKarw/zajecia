package adnotations.validated.rules;


import adnotations.validated.ValidationException;
import adnotations.validated.ValidationRule;

import java.lang.reflect.Field;

public class NotEmptyRule implements ValidationRule {

    @Override
    public String getName() {
        return "NotEmpty";
    }

    @Override
    public void validate(Object obj) throws ValidationException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.getType().equals(String.class)) {
                field.setAccessible(true);
                try {
                    String value = (String) field.get(obj);
                    if (value == null || value.trim().isEmpty()) {
                        throw new ValidationException("Pole " + field.getName() + " jest puste!");
                    }
                } catch (IllegalAccessException e) {
                    // w realnym kodzie: throw new ValidationException z komunikatem
                    e.printStackTrace();
                }
            }
        }
    }

}
