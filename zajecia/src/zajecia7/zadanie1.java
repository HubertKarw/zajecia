package zajecia7;

/*
Zadanie 1
Napisz program, który tworzy tablicę 5 liczb całkowitych,
inicjalizuje ją wartościami od 1 do 5, a następnie wyświetla zawartość tablicy.

 */
public class zadanie1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("element: " + array[i]);
        }
    }


}
