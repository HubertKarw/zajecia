package zajecia6;

public class zadanie15 {
    public static void main(String[] args) {
        int height = 5;
        int width = 10;
        for (int i = 1; i<=height;i++){
            for(int j = 1; j<=width ;j++){
                if (i == 1 || i == height){
                    System.out.print("*");
                }else if(j==1||j==width ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
