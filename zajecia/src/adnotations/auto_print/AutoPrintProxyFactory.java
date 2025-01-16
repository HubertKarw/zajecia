package adnotations.auto_print;

import adnotations.my_log.MyLogInvocationHandler;

import java.lang.reflect.Proxy;

public class AutoPrintProxyFactory {
    public static <T> T createProxy(Class<T> iface, T targetInstance) {
        return (T) Proxy.newProxyInstance(
                iface.getClassLoader(),
                new Class<?>[] { iface },
                new AutoPrintInvocationHandler(targetInstance)
        );
    }
}
