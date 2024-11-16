package zajecia7;

/*
Zadanie 16
Napisz program, który w podanej tablicy liczb całkowitych znajduje najdłuższy ciąg kolejnych elementów o tej samej wartości
(tzw. najdłuższy podciąg stały). Program powinien wyświetlić wartość tego elementu oraz długość najdłuższego ciągu.

 */
public class zadanie16 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 4, 4, 2, 2};
        int currentValue = array[0];
        int maxSequence = 1;
        int currentSequence = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentSequence++;
            } else {
                if (currentSequence > maxSequence) {
                    maxSequence = currentSequence;
                    currentValue = array[i - 1];
                }
                currentSequence = 1;
//                System.out.println(maxSequence);
            }

        }
        System.out.println("max sequence: " + maxSequence);
        System.out.println("element: " + currentValue);
    }
}
