package zajecia7;
/*
Zadanie 2
Napisz program, który tworzy tablicę 10 liczb całkowitych, inicjalizuje ją tak,
że każdy element jest równy dwukrotności jego indeksu (tj. element o indeksie i ma wartość 2*i),
a następnie wyświetla zawartość tablicy.

 */
public class zadanie2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i *2;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("element: " + array[i]);
        }
    }
    }

