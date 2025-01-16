package adnotations.my_log;

/*
Adnotacje (annotations) w języku Java to dodatkowe informacje (metadane) dołączane do klas, metod, pól czy parametrów. Dzięki nim możemy:

- Wskazać kompilatorowi, że dana metoda ma pewne cechy (np. @Override).
- Dodać wskazówki do narzędzi (np. do generowania dokumentacji, plików konfiguracyjnych).
- Sterować zachowaniem frameworków (np. @Entity, @Autowired, @Test).
 */


public class Main {

    public static void main(String[] args) {
        MyService realMyService = new MyServiceImpl();

        MyService proxyService = MyLogProxyFactory.createProxy(MyService.class, realMyService);

        proxyService.doWork();
        proxyService.init();
    }

}