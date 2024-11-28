package zajecia7;

import java.util.Scanner;

/*
Zadanie 17
Napisz program, który kompresuje podany łańcuch znaków,
używając podstawowej metody kompresji polegającej na zliczaniu powtarzających się znaków.
Jeśli "skomprymowany" łańcuch jest dłuższy od oryginalnego, program powinien zwrócić oryginalny łańcuch.

 */
public class zadanie17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String charSequence = scanner.nextLine();
        char[] charArray = charSequence.toCharArray();
        String output = "";
        output += charArray[0];
        int charCounter = 1;
        for (int i = 1; i <= charArray.length - 1; i++) {

            if (charArray[i] == charArray[i - 1]) {
                charCounter++;
                if (i == (charArray.length - 1)) {
                    if (charCounter != 1) {
                        output += charCounter;
                    }
                }
            } else {

                if (charCounter != 1) {
                    output += charCounter;
                }
                output += charArray[i];
                if (i == (charArray.length - 1)) {
                    if (charCounter != 1) {
                        output += charCounter;
                    }
                }
                charCounter = 1;
            }
        }
//        if (output.length()>charSequence.length()){
//            output = charSequence;
//        }
        System.out.println(output);
    }


}
