package zajecia6;

public class zadanie11 {
    public static void main(String[] args) {
        for(int i = 1; i<1000;i++){
            int sum = 0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    sum=j+sum;
                }
            }
            if (sum==i){
                System.out.println(i);
            }
        }
    }
}
