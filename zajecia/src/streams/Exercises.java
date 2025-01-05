package streams;

import streams.generator.HoldingGenerator;
import streams.model.*;
import streams.model.Currency;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Exercises {

    private static final List<Holding> holdings = new HoldingGenerator().generate();

    public static void main(String[] args) {
//        System.out.println(getHoldingsWhereAreCompanies());
//        System.out.println(getHoldingNamesAsString());
//        System.out.println(getCompaniesAmount());
//        System.out.println(getAllUserAmount());
//        System.out.println(getAllCompaniesNamesAsLinkedList());
//        Account acc= new Account(AccountType.LO1, "6754", new BigDecimal("10.50"), Currency.EUR);
//        System.out.println(getAccountAmountInPLN(acc));
//        Consumer<Company> consumerCompany = c -> System.out.println(c.getName());
//        executeForEachCompany(consumerCompany);
//        getRichestWoman().ifPresent(user -> System.out.println(user.getFirstName() + " " + user.getLastName()));
//        System.out.println(getUserPerCompany());
//        Predicate<User> userPredicate = (user) -> user.getAge()==22;
//        System.out.println(getUser(userPredicate).getFirstName());
//        showAllUser();
//        getCurenciesSet().stream().forEach(System.out::println);
        System.out.println(createAccountsMap().size());
    }

    /**
     * Napisz metodę, która zwróci liczbę holdingów, w których jest przynajmniej jedna firma.
     */
    public static long getHoldingsWhereAreCompanies() {

        return holdings.stream()
                .map(Holding::getCompanies)
                .filter(comp -> comp.size() > 0)
                .count();
    }

    /**
     * Napisz metodę, która zwróci nazwy wszystkich holdingów pisane z wielkiej litery w formie listy.
     */
    public static List<String> getHoldingNames() {
        return holdings.stream()
                .filter(Objects::nonNull)
                .map(Holding::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    /**
     * Zwraca nazwy wszystkich holdingów sklejone w jeden string i posortowane.
     * String ma postać: (Coca-Cola, Nestle, Pepsico)
     */
    public static String getHoldingNamesAsString() {
        return holdings.stream()
                .map(Holding::getName)
                .sorted()
                .collect(Collectors.joining(", "));

    }

    /**
     * Zwraca liczbę firm we wszystkich holdingach.
     */
    public static long getCompaniesAmount() {
        return holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .count();
    }


    /**
     * Zwraca liczbę wszystkich pracowników we wszystkich firmach.
     */
    public static long getAllUserAmount() {
        return holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .flatMap(c -> c.getUsers().stream())
                .count();
    }

    /**
     * Zwraca listę wszystkich firm jako listę, której implementacja to LinkedList. Obiektów nie przepisujemy
     * po zakończeniu działania strumienia.
     */
    public static LinkedList<String> getAllCompaniesNamesAsLinkedList() {
        return holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .map(Company::getName)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Przelicza kwotę na rachunku na złotówki za pomocą kursu określonego w enum Currency.
     */
    public static BigDecimal getAccountAmountInPLN(Account account) {
        if (account == null) {
            System.out.println("account does not exist");
            return BigDecimal.ZERO.stripTrailingZeros();
        }
        return account.getAmount()
                .multiply(BigDecimal.valueOf(account.getCurrency().getRate()))
                .setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Zwraca imiona użytkowników w formie zbioru, którzy spełniają podany warunek.
     */
    public static Set<String> getUsersForPredicate(final Predicate<User> userPredicate) {
        return holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .flatMap(c -> c.getUsers().stream())
                .filter(userPredicate)
                .map(user -> user.getFirstName() + " " + user.getLastName())
                .collect(Collectors.toSet());
    }

    /**
     * Dla każdej firmy uruchamia przekazaną metodę.
     */
    public static void executeForEachCompany(Consumer<Company> consumer) {
        holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .forEach(consumer);
    }

    /**
     * Wyszukuje najbogatsza kobietę i zwraca ją. Metoda musi uzwględniać to że rachunki są w różnych walutach.
     */
    //pomoc w rozwiązaniu problemu w zadaniu: https://stackoverflow.com/a/55052733/9360524
    public static Optional<User> getRichestWoman() {
        return holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .flatMap(c -> c.getUsers().stream())
                .filter(user -> user.getSex().equals(Sex.WOMAN))
                .max(Comparator.comparing(Exercises::getUserAmountInPLN));
    }

    private static BigDecimal getUserAmountInPLN(final User user) {
        return user.getAccounts()
                .stream()
                .map(Exercises::getAccountAmountInPLN)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Zwraca nazwy pierwszych N firm. Kolejność nie ma znaczenia.
     */
    private static Set<String> getFirstNCompany(final int n) {
        return getAllCompaniesNamesAsLinkedList().stream()
                .limit(n)
                .collect(Collectors.toSet());
    }

    /**
     * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników.
     */
    public static Map<String, List<User>> getUserPerCompany() {
        return holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .collect(Collectors.toMap(Company::getName, Company::getUsers));
    }

    /**
     * Zwraca pierwszego z brzegu użytkownika dla podanego warunku. W przypadku kiedy nie znajdzie użytkownika, wyrzuca
     * wyjątek IllegalArgumentException.
     */
    public static User getUser(final Predicate<User> predicate) {
        return holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .flatMap(c -> c.getUsers().stream())
                .filter(predicate)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    /**
     * Zwraca mapę rachunków, gdzie kluczem jest numer rachunku, a wartością ten rachunek.
     */
    public static Map<String, Account> createAccountsMap() {
        return holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .flatMap(c -> c.getUsers().stream())
                .flatMap(u -> u.getAccounts().stream())
                .distinct()
                .collect(Collectors.toMap(Account::getNumber, account -> account));
    }

    /**
     * Zwraca listę wszystkich imion w postaci Stringa, gdzie imiona oddzielone są spacją i nie zawierają powtórzeń.
     */
    public static String getUserNames() {
        return holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .flatMap(c -> c.getUsers().stream())
                .map(u -> u.getFirstName() + " " + u.getLastName())
                .reduce("", (result, u) -> result + u + " ")
                .strip();
    }

    /**
     * Metoda wypisuje na ekranie wszystkich użytkowników (imię, nazwisko) posortowanych od z do a.
     * Zosia Psikuta, Zenon Kucowski, Zenek Jawowy ... Alfred Pasibrzuch, Adam Wojcik
     */
    public static void showAllUser() {
        holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .flatMap(c -> c.getUsers().stream())
                .map(u -> u.getFirstName() + " " + u.getLastName())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    /**
     * Zwraca zbiór walut w jakich są rachunki.
     */
    public static Set<Currency> getCurenciesSet() {
        return holdings.stream()
                .flatMap(h -> h.getCompanies().stream())
                .flatMap(c -> c.getUsers().stream())
                .flatMap(u -> u.getAccounts().stream())
                .map(Account::getCurrency)
                .collect(Collectors.toSet());
    }

    /**
     * Zwraca strumień wszystkich firm.
     */
    //Nie zauważyłem, że miałem do zrobienia te metody i mogłem je użyć w poprzednich zadaniach, ale przynajmniej poćwiczyłem
    private static Stream<Company> getCompanyStream() {
        return holdings.stream()
                .flatMap(h -> h.getCompanies().stream());
    }

    /**
     * Tworzy strumień użytkowników.
     */
    private static Stream<User> getUserStream() {
        return getCompanyStream()
                .flatMap(c -> c.getUsers().stream());
    }

    /**
     * Tworzy strumień rachunków.
     */
    private static Stream<Account> getAccoutStream() {
        return getUserStream()
                .flatMap(u -> u.getAccounts().stream());
    }

}
