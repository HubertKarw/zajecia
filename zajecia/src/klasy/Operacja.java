package klasy;

public enum Operacja {
    /*
    Zadanie 19
Rozszerz enum Operacja, który reprezentuje cztery podstawowe operacje matematyczne: DODAJ, ODEJMIJ, POMNÓŻ, PODZIEL.
Dodaj abstrakcyjną metodę wykonaj(double a, double b), którą każda wartość enumu zaimplementuje inaczej.
W metodzie main pobierz od użytkownika dwie liczby i znak operacji, a następnie użyj odpowiedniej wartości enumu do wykonania operacji.
     */
    DODAJ {
        public double wykonaj(double a, double b) {
            return a + b;
        }
    },
    ODEJMIJ {
        public double wykonaj(double a, double b) {
            return a - b;
        }
    },
    POMNÓŻ {
        public double wykonaj(double a, double b) {
            return a * b;
        }
    },
    PODZIEL {
        public double wykonaj(double a, double b) {
            if (b==0){
                throw new IllegalArgumentException("Nie można dzielić przez zero!");
            }
            return a / b;
        }
    };

    public abstract double wykonaj(double a, double b);

}

