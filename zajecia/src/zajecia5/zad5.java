package zajecia5;

public class zad5 {
    public static void main(String[] args) {
        /*
        Zadanie 5
Napisz program, który na podstawie punktów (0-100) przyznaje ocenę: 0-59 - "Niedostateczny", 60-69 - "Dostateczny",
70-79 - "Dobry", 80-89 - "Bardzo dobry", 90-100 - "Celujący". Wykorzystaj else if do zakresów wartości.
         */
        int score = 10;
        if (score >= 90) {
            System.out.println("cel");
        } else if (score >= 80) {
            System.out.println("bdob");
        } else if (score >= 70) {
            System.out.println("dob");
        } else if (score >= 60) {
            System.out.println("dost");
        } else {
            System.out.println("niedost");
        }
    }
}
