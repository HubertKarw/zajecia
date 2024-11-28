package zajecia6;

public class zadanie5 {
    public static void main(String[] args) {
        int number = 1234;
        String numberAsString = Integer.toString(number);
        System.out.println(numberAsString);
        int stringLength = numberAsString.length();
        while(stringLength>0){
            System.out.println(numberAsString.charAt(stringLength-1));
            stringLength--;
        }
    }


//    while(){
//
//    }
}
