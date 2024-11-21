package klasy;

public enum DzienTygodnia {
    /*
    Zadanie 10
Zdefiniuj enum DzienTygodnia z wartościami: PONIEDZIAŁEK, WTOREK, ŚRODA, CZWARTEK, PIĄTEK, SOBOTA, NIEDZIELA.
Napisz program, który używa tego enumu do wyświetlenia nazwy dnia tygodnia.
W metodzie main przypisz zmiennej typu DzienTygodnia jedną z wartości i wyświetl ją.
     */
    PONIEDZIAŁEK, WTOREK, ŚRODA, CZWARTEK, PIĄTEK, SOBOTA, NIEDZIELA;
    public void printDay(){
        System.out.println(this.name());
    }
}
