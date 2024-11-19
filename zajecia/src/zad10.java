import java.util.Arrays;

public class zad10 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int[] triangle = {a, b, c};
        Arrays.sort(triangle);
        if ((triangle[1] * triangle[1]) + (triangle[0] * triangle[0]) == triangle[2] * triangle[2]){
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }
    }
}
