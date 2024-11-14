package zajecia6;

import java.util.Locale;

public class zadanie14 {
    public static void main(String[] args) {
        String text = "llalal1112**";
        text = text.toLowerCase();
        int numCounter=0;
        int charCounter=0;
        int diffCounter=0;
        char textarray[] = text.toCharArray();
        for (char c: textarray) {
            if (c>='a' && c<='z'){
                charCounter++;
            }else if (c>='0' && c<='9'){
                numCounter++;
            }else{
                diffCounter++;
            }
        }
        System.out.println("text zawiera " + numCounter + " liczb, " + charCounter +" liter, "+ diffCounter + " innych znaków"  );
    }
}
