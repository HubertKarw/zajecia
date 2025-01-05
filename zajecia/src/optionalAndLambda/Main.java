package optionalAndLambda;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 10};
        int[] arr2 = {};
        findFirstEven(arr2).ifPresentOrElse(System.out::println,
                () -> System.out.println("Even not found")
        );
        mapToUppercase(Optional.empty()).ifPresentOrElse(System.out::println,
                () -> System.out.println("empty")
        );
        findPositive(Optional.of(5)).ifPresentOrElse(System.out::println,
                () -> System.out.println("empty")
        );
        findPositive(Optional.empty()).ifPresentOrElse(System.out::println,
                () -> System.out.println("empty")
        );
        findPositive(Optional.ofNullable(null)).ifPresentOrElse(System.out::println,
                () -> System.out.println("empty")
        );
        Consumer<String> action = System.out::println;
        processIfPresent(Optional.empty(), action);
        String[] stringArr = {"apple", "banana", "cherry"};
        applyConsumerToArray(stringArr, action);
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Function<Integer, String> addEvenPrefix = x -> "Even: " + x;
        int[] arrayFor6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(filterAndTransform(arrayFor6, isEven, addEvenPrefix)));

        //7
        Predicate<Integer> condition1 = x -> x > 5;
        Predicate<Integer> condition2 = x -> x < 20;
        int[] array = {1, 10, 15, 25};
        Integer[] arrayInteger = {1, 10, 15, 25};
        System.out.println(Arrays.toString(filterWithCombinedPredicate(arrayInteger, condition1, condition2)));
        Function<String, String> first = s -> s.toUpperCase(Locale.ROOT);
        Function<String, String> second = s -> s + "!!!";
        System.out.println(applyFunction("java", first, second));
        //9
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> subtract = (a, b) -> a - b;
        System.out.println(calculate(1, 2, add));
        System.out.println(calculate(2, 2, multiply));
        System.out.println(calculate(1, 2, subtract));
        //10
        Predicate<Integer> test10 = n -> n >= 10;
        System.out.println(countIf(array, test10));
        //11
        Optional<String> opt11 = Optional.of("12345");
        Optional<String> opt112 = Optional.empty();
        System.out.println(getLengthOrZero(opt11));
        System.out.println(getLengthOrZero(opt112));
        //12
        BiFunction<String, String, String> combineOpts = (s1, s2) -> s1 + s2;
        Optional<String> opt12 = Optional.of("67890");
        System.out.println(combineOptionals(opt11, opt12, combineOpts));
        System.out.println(combineOptionals(opt112, opt12, combineOpts));
        System.out.println(combineOptionals(opt11, opt112, combineOpts));
        //13
        System.out.println(flatMapToInt(opt11));
        System.out.println(flatMapToInt(opt112));
        //14

        System.out.println(transformAndSum(arrayInteger, ((n) -> n * 2)));
        System.out.println(transformAndSum(arrayInteger, ((n) -> n * n)));
        //15
        partitionArray(array, (x -> x >= 10), ((x) -> System.out.println("Large: " + x)), ((x) -> System.out.println("small: " + x)));
    }

    public static Optional<Integer> findFirstEven(int[] numbers) {
        /*
        Zadanie 1
Napisz metodę findFirstEven(int[] numbers), która:

Pobiera tablicę liczb całkowitych.
Zwraca Optional<Integer> reprezentujący pierwszą liczbę parzystą w tablicy.
W main wywołaj metodę dla {1,3,5,8,10} oraz dla pustej tablicy i wyświetl wynik (lub komunikat, że brak wartości).

         */
        Optional<Integer> optional = Optional.empty();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                return Optional.of(numbers[i]);
            }
        }

        return Optional.empty();

    }

    public static Optional<String> mapToUppercase(Optional<String> optional) {
        /*
        Zadanie 2
Napisz metodę mapToUppercase(Optional<String> optional), która:

Jeśli wartość jest w Optional, zamienia ją na wielkie litery (używając map i lambdy).
Zwraca nowy Optional<String>.
W main przetestuj metodę dla Optional.of("java") oraz Optional.empty().
         */
        return optional.map(String::toUpperCase);
    }

    public static Optional<Integer> findPositive(Optional<Integer> number) {
        /*
        Zadanie 3
Napisz metodę findPositive(Optional<Integer> number), która:

Sprawdza, czy wartość w Optional jest dodatnia (użyj filter i lambdy).
Zwraca oryginalny Optional jeśli warunek jest spełniony, w przeciwnym wypadku Optional.empty().
W main przetestuj dla Optional.of(5), Optional.of(-3) i Optional.empty().
         */
        if (number == null) {
            return Optional.empty();
        }
        return number.filter(x -> x > 0);
    }

    public static void processIfPresent(Optional<String> optional, Consumer<String> action) {
        optional.ifPresent(action);
        /*
        Zadanie 4
Napisz metodę processIfPresent(Optional<String> optional, Consumer<String> action), która:

Jeśli wartość w Optional istnieje, wywołuje action.accept() dla tej wartości.
W main przetestuj metodę, przekazując lambdę wypisującą wartość na ekran.
         */
    }

    public static void applyConsumerToArray(String[] array, Consumer<String> consumer) {
        for (String s : array) {
            consumer.accept(s);
        }
    }

    public static String[] filterAndTransform(int[] array, Predicate<Integer> predicate, Function<Integer, String> transformer) {
        List<String> result = new ArrayList<>();
//        result.toArray();
        for (int i : array) {
            if (predicate.test(i)) {
                result.add(transformer.apply(i));
            }
        }
        return result.toArray(new String[0]);
    }

    public static Integer[] filterWithCombinedPredicate(Integer[] array, Predicate<Integer> condition1, Predicate<Integer> condition2) {
        /*
        Zadanie 7
Napisz metodę filterWithCombinedPredicate(int[] array, Predicate<Integer> condition1, Predicate<Integer> condition2), która:

Zwraca tablicę liczb spełniających oba warunki (condition1.and(condition2)).
W main przetestuj na tablicy {1,10,15,25} szukając liczb >5 i <20.
         */
        List<Integer> result = new ArrayList<>();
//        result.toArray();
        for (int i : array) {
            if (condition1.and(condition2).test(i)) {
                result.add(i);
            }
        }
        return result.toArray(Integer[]::new);
    }

    public static String applyFunction(String input, Function<String, String> first, Function<String, String> second) {
/*
Zadanie 8
Napisz metodę applyFunctions(String input, Function<String, String> first, Function<String, String> second), która:

Najpierw stosuje first do input.
Następnie wynik przekazuje do second.
W main przetestuj metodę z Function zmieniającą napis na wielkie litery i taką, która dodaje "!!!" na końcu.
 */
        if (input == null || first == null || second == null) {
            throw new IllegalArgumentException("Input and functions must not be null");
        }
        return first.andThen(second).apply(input);
    }

    /*
    Zadanie 9
Napisz metodę calculate(int a, int b, BiFunction<Integer, Integer, Integer> operation), która:

Wykonuje operację zdefiniowaną w BiFunction na dwóch liczbach całkowitych.
W main przetestuj z lambdami dodającymi, mnożącymi i odejmującymi.
     */
    public static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> operation) {
        if (operation == null) {
            throw new IllegalArgumentException("operation can not be null");
        }
        return operation.apply(a, b);
    }

    /*
    Zadanie 10
Napisz metodę countIf(int[] array, Predicate<Integer> predicate), która:

Zlicza liczbę elementów w tablicy spełniających predicate.
W main przetestuj licząc liczby >10 i liczby podzielne przez 3 w przykładowej tablicy.
     */
    public static long countIf(int[] array, Predicate<Integer> predicate) {
        return Arrays.stream(array).filter(predicate::test).count();
    }

    /*
    Zadanie 11
Napisz metodę getLengthOrZero(Optional<String> opt), która:

Jeśli opt ma wartość, zwraca długość tego łańcucha (użyj map i lambdy), w przeciwnym razie zwraca 0.
W main przetestuj dla Optional.of("lambda") i Optional.empty().
     */
    public static int getLengthOrZero(Optional<String> opt) {
        return opt.map(String::length).orElse(0);
    }

    /*
    Zadanie 12
Napisz metodę combineOptionals(Optional<String> opt1, Optional<String> opt2, BiFunction<String,String,String> combiner), która:

Jeśli obie wartości istnieją, łączy je używając combiner.
Jeśli którejś brakuje, zwraca Optional.empty().
W main przetestuj, łącząc dwie nazwy np. "Hello" i "World".
     */
    public static Optional<String> combineOptionals(Optional<String> opt1, Optional<String> opt2, BiFunction<String, String, String> combiner) {
        if (opt1.isEmpty() || opt2.isEmpty()) {
            return Optional.empty();
        } else {
            return opt1.flatMap(value1 ->
                    opt2.map(value2 -> combiner.apply(value1, value2))
            );
        }

    }

    /*
    Zadanie 13
Napisz metodę flatMapToInt(Optional<String> opt), która:

Jeśli wartość istnieje, próbuje sparsować ją do Integer używając flatMap i lambdy.
Zwraca Optional<Integer> z wynikiem lub pusty Optional jeśli parse się nie uda.
W main przetestuj dla "123", "abc" i pustego Optional.
     */
    public static Optional<Integer> flatMapToInt(Optional<String> opt) {
        return opt.flatMap(s -> {
            try {
                return Optional.of(Integer.valueOf(s));
            } catch (NumberFormatException nfe) {
                return Optional.empty();
            }
        });
    }

    /*
    Zadanie 14
Napisz metodę transformAndSum(int[] array, Function<Integer,Integer> transformer), która:

Stosuje transformer do każdego elementu tablicy i sumuje wyniki.
Zwraca sumę.
W main przetestuj z lambdą podwajającą liczby i lambdą zwracającą kwadrat liczby.
     */
    public static int transformAndSum(Integer[] array, Function<Integer, Integer> transformer) {
        return Arrays.stream(array).map(transformer).reduce(0, Integer::sum);
    }

    /*
    Zadanie 15
Napisz metodę partitionArray(int[] array, Predicate<Integer> pred, Consumer<Integer> trueConsumer, Consumer<Integer> falseConsumer) która:

Dla każdego elementu tablicy sprawdza pred.
Jeśli true, wywołuje trueConsumer.accept(element), w przeciwnym razie falseConsumer.accept(element).
W main przetestuj, np. dla liczb <10 wyświetl "Small:" i liczbę, a dla >=10 "Large:" i liczbę.
     */
    public static void partitionArray(int[] array, Predicate<Integer> pred, Consumer<Integer> trueConsumer, Consumer<Integer> falseConsumer) {
        Arrays.stream(array).forEach(i -> {
            if (pred.test(i)) {
                trueConsumer.accept(i);
            } else {
                falseConsumer.accept(i);
            }
        });
    }
}
