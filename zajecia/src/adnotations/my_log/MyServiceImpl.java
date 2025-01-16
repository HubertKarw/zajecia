package adnotations.my_log;

public class MyServiceImpl implements MyService{

    @Override
    @MyLog
    public void doWork() {
        System.out.println("doWork");
    }

    @Override
    @MyLog(value = "wywolanie init")
    public void init() {
        System.out.println("init");
    }
}
