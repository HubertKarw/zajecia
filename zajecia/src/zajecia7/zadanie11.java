package zajecia7;

/*
Zadanie 11
Napisz program,
który sortuje tablicę liczb całkowitych rosnąco bez użycia wbudowanych metod sortowania
(zaimplementuj sortowanie bąbelkowe).
 */
public class zadanie11 {
    //skopiowane z zajecia6/zadanie12
    public static void main(String[] args) {
        int array[] = {1, 30, 10, 4, 6, 1};
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
//        System.out.println(array.toString());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        ;
    }
}
