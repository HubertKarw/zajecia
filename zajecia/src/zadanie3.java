public class zadanie3 {
    public static void main(String[] args) {
        int tempertaure = 0;
        if(tempertaure>30){
            System.out.println("gorąco");
        }else if(tempertaure>20){
            System.out.println("ciepło");
        }else if(tempertaure>10){
            System.out.println("chłodno");
        }else if(tempertaure>=0){
            System.out.println("zimno");
        }else{
            System.out.println("mróz");
        }
    }
}