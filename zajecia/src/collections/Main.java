package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
        zad8();
        zad9();
        zad10();
        zad11();
        zad12();
        zad13();
        zad14();
        zad15();
    }

    public static void zad1() {
        /*
        Zadanie 1
        Utwórz List<String> i dodaj do niej kilka łańcuchów znaków. Następnie wyświetl zawartość listy w pętli for-each.
         */
        List<String> stringList = new ArrayList<>(Arrays.asList("123", "234", "345"));
        for (String s : stringList) {
            System.out.println(s);
        }
    }

    public static void zad2() {
        /*
        Zadanie 2
        Utwórz List<Integer> i dodaj liczby od 1 do 5. Następnie pobierz i wyświetl element na indeksie 2.
        Usuń element o wartości 3 i wyświetl listę ponownie, aby sprawdzić czy został usunięty.
         */
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        intList.get(2);
        intList.remove((Integer) 3);
        intList.forEach(System.out::println);

    }

    public static void zad3() {
    /*
    Zadanie 3
    Utwórz Set<String> i dodaj do niego kilka powtarzających się napisów, np. "Apple", "Banana", "Apple", "Cherry".
    Wyświetl zawartość seta i sprawdź, że duplikaty nie występują.
     */
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Apple");
        stringSet.add("Cherry");
        System.out.println(stringSet);
    }

    public static void zad4() {
        /*
        Zadanie 4
        Utwórz Map<String, Integer> i dodaj do niej pary klucz-wartość odpowiadające np. produktom i ich cenom. Wyświetl wszystkie klucze,
        wszystkie wartości oraz każdą parę klucz-wartość (użyj entrySet()).
        */
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 12);
        map.put("Orange", 13);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }

    public static void zad5() {
/*
Zadanie 5
Utwórz Queue<String> (np. LinkedList jako implementację), dodaj kilka elementów i symuluj działanie kolejki:
pobierz (poll) element z kolejki i wyświetl go, a następnie pokaż stan kolejki po usunięciu elementu.
 */
        Queue<String> kolejka = new LinkedList<>();
        kolejka.add("str");
        kolejka.add("str2");
        kolejka.add("str3");
        kolejka.add("str4");
        System.out.println(kolejka);
        kolejka.poll();
        System.out.println(kolejka);
    }

    public static void zad6() {
/*
Zadanie 6
Utwórz Stack<Integer> przy użyciu Deque<Integer> (np. ArrayDeque). Dodaj kilka liczb,
a następnie zdejmij (pop) kilka z nich, wyświetlając za każdym razem element usuwany ze stosu i aktualny stan stosu.
 */
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(7);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }

    public static void zad7() {
/*
Zadanie 7
Utwórz List<Integer> z losowymi liczbami i posortuj ją korzystając z Collections.sort(). Wyświetl listę przed i po sortowaniu.
 */
        List<Integer> list = new ArrayList<>(Arrays.asList((int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100)));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void zad8() {
/*
Zadanie 8
Utwórz List<String> i dodaj kilka napisów. Użyj Collections.shuffle() aby je potasować. Wyświetl listę przed i po tasowaniu.
 */
        List<String> list = new ArrayList<>(Arrays.asList("123", "12", "223", "342"));
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }

    public static void zad9() {
/*
Zadanie 9
Utwórz List<String> z kilkoma napisami. Użyj Collections.frequency() aby sprawdzić, ile razy występuje w niej określony napis. Wyświetl wynik.
 */
        List<String> list = new ArrayList<>(Arrays.asList("123", "12", "223", "342", "12", "223", "223"));
        System.out.println(Collections.frequency(list, "12"));
        System.out.println(Collections.frequency(list, "223"));
    }

    public static void zad10() {
/*
Zadanie 10
Utwórz LinkedList<Integer> i dodaj kilkanaście liczb. Użyj metody subList() na List
(którą LinkedList implementuje), aby wyświetlić fragment listy (np. elementy od indeksu 3 do 7).
 */
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        System.out.println(list);
        System.out.println(list.subList(3, 7));
    }

    public static void zad11() {
/*
Zadanie 11
Utwórz HashMap<String, Integer> z danymi o liczbie produktów w magazynie (np. "Jabłka" -> 10, "Banany" -> 5).
Wypisz ile jest "Banany" używając get(). Jeśli klucz nie istnieje, wypisz że nie ma takiego produktu.
 */
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 12);
        map.put("Orange", 13);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (map.get(input) == null) {
            System.out.println("no such product");
        } else {
            System.out.println(map.get(input));
        }
    }

    public static void zad12() {
/*
Zadanie 12
Utwórz TreeSet<String> i dodaj do niego różne napisy. Wyświetl jego zawartość, sprawdź jak jest posortowana.
Następnie użyj metod takich jak first(), last() aby wyświetlić pierwszy i ostatni element w porządku sortowania.
 */
        TreeSet<String> set = new TreeSet<>();
        set.add("ala");
        set.add("ma");
        set.add("kota");
        set.add("a");
        set.add("Kot");
        set.add("ma");
        set.add("Ale");
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
    }

    public static void zad13() {
/*
Zadanie 13
Utwórz HashMap<String, Double> z informacjami o nazwach produktów i ich cenach. Użyj metody replace() aby
zmienić cenę jednego z produktów, a następnie wyświetl mapę przed i po zmianie.

 */
        HashMap<String, Double> map = new HashMap<>();
        map.put("Apple", 10.0);
        map.put("Banana", 12.1);
        map.put("Orange", 13.2);
        System.out.println(map);
        map.replace("Apple", 9.5);
        System.out.println(map);
    }

    public static void zad14() {
/*
Zadanie 14
Utwórz LinkedHashSet<String> i dodaj kilka napisów w określonej kolejności. Wyświetl je, aby zobaczyć,
że LinkedHashSet zachowuje kolejność wstawiania elementów. Następnie usuń jeden z elementów i ponownie wyświetl zawartość.

 */
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("ala");
        set.add("ma");
        set.add("kota");
        set.add("a");
        set.add("Kot");
        set.add("ma");
        set.add("Ale");
        System.out.println(set);
        set.remove("ala");
        System.out.println(set);
    }

    public static void zad15() {
/*
Zadanie 15
Utwórz List<Integer> z powtarzającymi się wartościami. Użyj Collections.replaceAll()
aby zamienić wszystkie wystąpienia danej wartości na inną. Wyświetl listę przed i po operacji, aby potwierdzić działanie metody.
 */
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 4, 5, 6, 7, 7, 7, 8, 9));
        System.out.println(list);
        Collections.replaceAll(list, 7, 10);
        System.out.println(list);
    }

}
