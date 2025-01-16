package adnotations.auto_print;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Locale;

public class AutoPrintInvocationHandler implements InvocationHandler {

    private final Object target;

    public AutoPrintInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Field targetField = target.getClass().getDeclaredField(method.getName().substring(3).toLowerCase(Locale.ROOT));
        targetField.setAccessible(true);
        AutoPrint annotation = targetField.getAnnotation(AutoPrint.class);
        String fieldName = targetField.getName();
        String methodName = method.getName();
        if (methodName.startsWith("get") && (annotation.mode().equals("GET") || annotation.mode().equals("BOTH"))) {
            System.out.println("[AUTO_PRINT] " + annotation.label()
                    + "\n\t Method: " + methodName + " Field: " + fieldName
                    + "\n\t Value: " + targetField.get(target));
        }
        if (methodName.startsWith("set") && (annotation.mode().equals("SET") || annotation.mode().equals("BOTH"))) {
            System.out.println("[AUTO_PRINT] " + annotation.label()
                    + "\n\t Method: " + methodName + " Field: " + fieldName
                    + "\n\t Value: " + targetField.get(target));
        }


        return method.invoke(target, args);
    }
}
