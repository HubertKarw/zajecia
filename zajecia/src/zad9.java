public class zad9 {
    public static void main(String[] args) {
        int year = 2012;
        if(year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("przestępny");
                }else{
                    System.out.println(0);
                }
            }else{
                System.out.println("przestepny");
            }

        }else{
            System.out.println(0);
        }
    }
}
