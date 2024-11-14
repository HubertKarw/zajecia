package zajecia6;

public class zadanie9 {
    public static void main(String[] args) {
        int x = 1;
        int temp;
        int y = 1;
        int range = 10;
        int counter = 1;
        while(counter != range){
            if (counter == 1){
                System.out.println(x);
            }
            System.out.println(y);
            temp=y;
            y=x+y;
            x=temp;
            counter++;
        }
    }
}
