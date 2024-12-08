package generics;

import java.util.Arrays;
import java.util.stream.Stream;

import static generics.GenericArray.fillArray;

public class Main {
    public static void main(String[] args) {
//        String s = "string";
//        int n = 10;
//        System.out.println(identity(s));
//        System.out.println(identity(n));
//        Holder<String> stringHolder = new Holder<>();
//        Holder<Integer> intHolder = new Holder<>();
//        stringHolder.setValue("String");
//        intHolder.setValue(10);
//        System.out.println(stringHolder.getValue());
//        System.out.println(intHolder.getValue());
        String[] strArray = {"string", "is", "string"};
        Integer[] intArray = {1, 2, 3};
        Double[] doubArray = {1.0, 2.0, 3.0};
        Float[] floatArray = {1.0f, 2.0f, 3.0f};
//        printArray(strArray);
//        printArray(intArray);
//        GenericArray<Integer> genArr = new GenericArray<>(3);
//        genArr.set(0,10);
//        genArr.set(1,11);
//        genArr.set(2,12);
//        genArr.set(3,12);
//        System.out.println((int)genArr.get(0));
//        System.out.println((int)genArr.get(1));
//        System.out.println((int)genArr.get(2));
//        System.out.println((int)genArr.get(4));
//        System.out.println(average(intArray));
//        System.out.println(average(doubArray));
//        System.out.println(sum(intArray));
//        System.out.println(sum(floatArray));
//        Integer[] dest = new Integer[strArray.length];
//        Transformer<String,Integer> strLTrans = new StringLengthTransformer();
//        transformArray(strArray,strLTrans,dest);

//        GenericArray<Object> genArr = new GenericArray<>(3);
//        fillArray(genArr,1);
//        System.out.println(genArr.get(0) + " " +
//        genArr.get(1) + " " +
//        genArr.get(2));

//        GenericArray<Number> num = new GenericArray<>(3);
//        GenericArray<Integer> integ = new GenericArray<>(3);
//        fillArray(integ,1);
//        num.copyFrom(integ);
//        System.out.println(num.get(0) + " " +
//        num.get(1) + " " +
//        num.get(2));
        String string = "12a";
        StringIntegerConverter stringIntegerConverter = new StringIntegerConverter();
        int integer = stringIntegerConverter.convertForward(string);
        System.out.println(integer);
        String converted = stringIntegerConverter.convertBackword(integer);
        System.out.println(converted);


    }

    /*
    Zadanie 1
Podstawowa metoda generyczna

Napisz statyczną metodę generyczną identity(T value), która przyjmuje dowolny obiekt typu T i zwraca go bez zmian.
W metodzie main wywołaj identity z obiektem typu String i Integer i wyświetl wyniki.
(Zadanie tylko pod sprawdzenie czy kod się kompiluje)
     */
    public static <T> T identity(T value) {
        return value;
    }

    /*
    Zadanie 3
Metoda generyczna z tablicą

Napisz metodę generyczną printArray(T[] array), która wyświetla wszystkie elementy tablicy.
W main przetestuj ją na tablicy String[] oraz Integer[].
     */
    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    /*
    Zadanie 5
Ograniczenie typu z Number

Napisz metodę generyczną average(T[] array) z ograniczeniem T extends Number, która oblicza średnią wartość elementów w tablicy typu liczbowego.
W main przetestuj ją z tablicą Integer[] oraz Double[].

     */
    public static <T extends Number> Double average(T[] array) {
        Double sum = 0.0;
        for (T t : array) {
            sum += t.doubleValue();
        }
        return sum / array.length;
    }

    /*
    Zadanie 6
Sumowanie elementów numerycznych

Napisz metodę generyczną sumArray(T[] array) z ograniczeniem T extends Number, która sumuje wszystkie elementy tablicy typu liczbowego i zwraca wynik jako double.
W main przetestuj ją na tablicy Integer[] oraz Float[].
     */
    public static <T extends Number> Double sum(T[] array) {
        Double sum = 0.0;
        for (T t : array) {
            sum += t.doubleValue();
        }
        return sum;
    }

    public static <S, R> void transformArray(S[] source, Transformer<S, R> transformer, R[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = transformer.transform(source[i]);
            System.out.println(transformer.transform(source[i]));
        }
    }
}

