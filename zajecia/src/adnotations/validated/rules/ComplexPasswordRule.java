package adnotations.validated.rules;

import adnotations.validated.ValidationException;
import adnotations.validated.ValidationRule;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComplexPasswordRule implements ValidationRule {
    @Override
    public String getName() {
        return "ComplexPassword";
    }

    @Override
    public void validate(Object obj) throws ValidationException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field: fields) {
            if(field.getName().toLowerCase().contains("password")
                    && field.getType().equals(String.class)){
                field.setAccessible(true);
                try {
                    String value = (String) field.get(obj);
                    System.out.println(checkPasswordString(value));
                    System.out.println((!checkPasswordString(value) && value.length() >= 8));
                    if (!checkPasswordString(value) && value.length()>=8) {
                        System.out.println("wrong password");
                        throw new ValidationException("Pole " + field.getName() + " nie jest poprawnym hasłem!");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static boolean checkPasswordString(String password){
        Pattern oneUpperCaseLetterPattern = Pattern.compile("[A-Z]");
        Pattern oneLowerCaseLetterPattern = Pattern.compile("[a-z]");
        Pattern oneNumberPattern = Pattern.compile("[0-9]");
        Pattern oneSpecialPattern = Pattern.compile("[!@#$%^&*()]");
        Matcher upperMatcher = oneUpperCaseLetterPattern.matcher(password);
        Matcher lowerMatcher = oneLowerCaseLetterPattern.matcher(password);
        Matcher numberMatcher = oneNumberPattern.matcher(password);
        Matcher specialMatcher = oneSpecialPattern.matcher(password);
        if (upperMatcher.find() && lowerMatcher.find() && numberMatcher.find() && specialMatcher.find()){
            return true;
        }
         return false;
    }
}
