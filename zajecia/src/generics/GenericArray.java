package generics;
/*
Zadanie 4
Klasa generyczna operująca na tablicy

Utwórz klasę generyczną GenericArray<T>, która w konstruktorze przyjmuje rozmiar i tworzy wewnętrznie tablicę typu T[].
Dodaj metody set(int index, T value) oraz T get(int index).
W main utwórz GenericArray<Integer>, ustaw kilka elementów i wyświetl je.
 */

/*
Zadanie 8
Dzika karta z ograniczeniem górnym w klasie GenericArray

Rozszerz klasę GenericArray<T> o metodę copyFrom(GenericArray<? extends T> source), która kopiuje elementy z source do obiektu
this (zakładając, że obie tablice mają ten sam rozmiar).
W main przetestuj kopiowanie z GenericArray<Integer> do GenericArray<Number>.

 */
public class GenericArray<T> {
    T[] array;

    //https://stackoverflow.com/questions/529085/how-can-i-create-a-generic-array-in-java
//E[] arr = (E[])new Object[INITIAL_ARRAY_LENGTH];
    public GenericArray(int size) {
        this.array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        try {
            this.array[index] = value;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public <T> T get(int index) {
        try {
            return (T) this.array[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("no index, returning last object");
            return (T) this.array[array.length - 1];
        }

    }

    public <T> void copyFrom(GenericArray<? extends T> source) {
        if (this.array.length != source.array.length) {
            throw new ArrayStoreException("Arrays have different lengths");
        } else {
            for (int i = 0; i < source.array.length; i++) {
                Object s = source.get(i);
//                @SuppressWarnings
                this.set(i, source.get(i));
                System.out.println(this.array[i]);
            }
        }
    }

    /*
    Zadanie 9
Dzika karta z ograniczeniem dolnym przy wypełnianiu tablicy

Napisz metodę generyczną fillArray(GenericArray<? super Integer> array, Integer value), która ustawia każdy element w array na podaną wartość value.
W main przygotuj GenericArray<Object> i wywołaj fillArray z wartością typu Integer.
     */
    public static <T> void fillArray(GenericArray<? super Integer> array, Integer value) {
        for (int i = 0; i < array.array.length; i++) {
            array.set(i, value);
        }
    }
}
