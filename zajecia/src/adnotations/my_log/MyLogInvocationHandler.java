package adnotations.my_log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyLogInvocationHandler implements InvocationHandler {

    private final Object target;

    public MyLogInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method targetMethod = target.getClass().getMethod(method.getName(), method.getParameterTypes());
        MyLog annotation = targetMethod.getAnnotation(MyLog.class);

        if (annotation.active()) {
            System.out.println("[MY_LOG] " + annotation.value());

            long start = System.currentTimeMillis();
            Object result = method.invoke(target, args);
            long end = System.currentTimeMillis();

            System.out.println("[LOG] Czas wykonania metody " + method.getName() + ": " + (end - start) + " ms");

            return result;
        } else {
            return method.invoke(target, args);
        }
    }
}
