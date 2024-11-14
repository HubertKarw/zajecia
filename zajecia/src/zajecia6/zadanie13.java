package zajecia6;

public class zadanie13 {
    public static void main(String[] args) {
        String password= "password";
        char[]passarray = password.toCharArray();
        String encrypted ="";
        for (char c : passarray) {
            encrypted = encrypted + (char)(c+3);

        }
        System.out.println(encrypted);
    }


}
