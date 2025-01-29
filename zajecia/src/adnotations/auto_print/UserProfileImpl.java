package adnotations.auto_print;

public class UserProfileImpl implements UserProfile{
    @AutoPrint(label = "a:", mode = "BOTH")
    String username;


    @Override
    public void setUsername(String username) {
        this.username = username;
    }
    @Override

    public String getUsername() {
        return this.username;
    }
}
