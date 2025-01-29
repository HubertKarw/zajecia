package zajecia5;

public class zad6 {
    public static void main(String[] args) {
        /*
        Zadanie 6
Napisz program, który sprawdza, czy liczba jest dodatnia, ujemna, czy zero. Wykorzystaj if, else if, i else.
         */
        int num = 0;
        if(num > 0){
            System.out.println("dodatnia");
        }else if(num<0){
            System.out.println("ujemna");
        }else{
            System.out.println("0");
        }
    }
}
