package zajecia7;

/*
Zadanie 9
Napisz program, który zamienia małe litery na duże w podanym łańcuchu znaków
, używając tablicy znaków, a następnie wyświetla zmodyfikowany łańcuch.
 */
public class zadanie9 {
    public static void main(String[] args) {
        char[] array = {'x', 'y', 'z'};
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.toUpperCase(array[i]);
        }
        ;
        for (char c : array) {
            System.out.print(c);
        }
    }
}
