package adnotations.auto_print;

public class Main {
    public static void main(String[] args) {
        UserProfile realUser = new UserProfileImpl();
        UserProfile proxyUser = AutoPrintProxyFactory.createProxy(UserProfile.class, realUser);

        proxyUser.setUsername("123");
        proxyUser.getUsername();
    }


}
