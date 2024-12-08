package generics;
/*
Zadanie 10
Dwu kierunkowy konwerter z typami generycznymi

Utwórz klasę generyczną TwoWayConverter<A, B> z abstrakcyjnymi metodami B convertForward(A a) oraz A convertBackward(B b).
Zaimplementuj klasę StringIntegerConverter rozszerzającą TwoWayConverter<String, Integer>:

convertForward(String a) zamienia napis na liczbę całkowitą (np. "123" -> 123)
convertBackward(Integer b) zamienia liczbę całkowitą na napis
W main przetestuj oba kierunki konwersji.
 */
public abstract class TwoWayConverter <A,B>{
    public abstract B convertForward(A a);
    public abstract A convertBackword(B b);
}
