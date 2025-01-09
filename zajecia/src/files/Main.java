package files;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static final String PATH = "zajecia" + File.separator + "src" + File.separator + "files" + File.separator + "files" + File.separator;

    public static void main(String[] args) {
        //'zad1'
        System.out.println("zad1");
        createNotes();
        //zad2
        System.out.println("zad2");
        readConfig();
        //zad3
        System.out.println("zad3");
        createLog();
        //zad4
        System.out.println("zad4");
        readFileWithLineCount(PATH + "data.txt");
        //zad5
        System.out.println("zad5");
        LineWriter(PATH + "report.txt", 5);
        //zad6
        System.out.println("zad6");
//        createCopy("info.txt");
        //zad7
        System.out.println("zad7");
        countNumbersInFile(PATH + "numbers.txt");
        //zad8
        System.out.println("zad8");
        copyImage("image.jpg");
        //zad9
        System.out.println("zad9");
        printLogs();
        //zad10
        System.out.println("zad10");
        countErrorLines("large_data.txt");
    }

    /*
    Zadanie 1
    Napisz program, który:

    Sprawdza, czy w bieżącym katalogu istnieje plik notes.txt.
    Jeśli nie istnieje, utwórz go i zapisz w nim linijkę tekstu: "Notatki startowe".
    Jeśli istnieje, wyświetl jego rozmiar w bajtach oraz datę ostatniej modyfikacji.
    */
    public static void createNotes() {
        try {
            File notes = new File("zajecia" + File.separator + "src" + File.separator + "files" + File.separator + "files" + File.separator + "notes.txt");
            if (notes.exists()) {
                printFileInformation(notes);
            } else {
                if (notes.createNewFile()) {
                    PrintWriter writer = new PrintWriter(notes);
                    writer.println("\"Notatki startowe\"");
                    writer.close();
                } else {
                    System.out.println("cannot create file");
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printFileInformation(File file) {
        System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println("\tFile Size: " + file.length());
        Date date = new Date(file.lastModified());
        System.out.println("\tFile Last modified: " + date);
    }

    /*
    Zadanie 2
    Napisz program, który:

    Odczytuje z pliku config.ini pojedyncze linie tekstu (każda linia to np. klucz=wartość).
    Wyświetla odczytane linie na ekranie.
    Jeśli plik nie istnieje, utwórz go i zapisz w nim "config=default".
    */
    public static void readConfig() {
        BufferedReader reader;
        File config = new File("zajecia" + File.separator + "src" + File.separator + "files" + File.separator + "files" + File.separator + "config.ini");
        try {
            if (!config.exists()) {
                config.createNewFile();
                PrintWriter writer = new PrintWriter(config);
                writer.println("config=default");
                writer.close();
            } else {
                reader = new BufferedReader(new FileReader(config));
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
                reader.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    /*
    Zadanie 3
    Napisz program, który:

    Używając File, sprawdza czy istnieje katalog o nazwie backup.
    Jeśli nie istnieje, utwórz go.
    W katalogu backup utwórz plik log.txt i zapisz w nim jedną linijkę tekstu. Następnie wyświetl ścieżkę absolutną do tego pliku.
    */
    public static void createFile(String path, String fileName, boolean isDirectory) {
        File file = new File(path + fileName);
        if (!file.exists()) {
            try {
                if (isDirectory) {
                    file.mkdir();
                } else {
                    file.createNewFile();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void createLog() {
        createFile(PATH, "backup", true);
        createFile(PATH + "backup" + File.separator, "log.txt", false);
        File log = new File(PATH + "backup" + File.separator + "log.txt");
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(log);
            writer.println("Log created");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(log.getAbsolutePath());

    }

    /*
    Zadanie 4
    Napisz program, który:

    Używając FileReader i BufferedReader, odczyta cały plik tekstowy data.txt i wypisze jego zawartość linia po linii.
    Wypisz również informację o liczbie wczytanych linii.
    */
    public static void readFileWithLineCount(String path) {
        File file = new File(path);
        BufferedReader reader;
        int counter = 1;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
                counter++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Exception");
        }
        System.out.println("file has: " + counter + " lines");
    }

    /*
    Zadanie 5
    Napisz program, który:

    Używając FileWriter i PrintWriter, zapisze kilka linii tekstu do pliku report.txt. Każda linia powinna zawierać dane typu: "Linia X", gdzie X to numer linii.
    Zapisz np. 5 linii i wyświetl komunikat "Zapisano 5 linii do report.txt".
    */
    public static void LineWriter(String path, int numberOfLines) {
        File file = new File(path);
        PrintWriter writer = null;
        try {
            for (int i = 0; i < numberOfLines; i++) {
                writer = new PrintWriter(file);
                writer.println("Log created");
            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Zapisano " + numberOfLines + " linii do " + path.substring(path.lastIndexOf(File.separator) + 1));
    }

    /*
    Zadanie 6
    Napisz program, który:

    Za pomocą Files i Paths sprawdzi istnienie pliku info.txt.
    Jeśli plik istnieje, skopiuje go do copy_info.txt (nadpisując, jeśli copy_info.txt już istnieje), używając Files.copy().
    Jeśli plik nie istnieje, wyświetl komunikat "Brak pliku info.txt".
    */
    public static void createCopy(String fileName) {
        Path path = Paths.get(PATH + fileName);
        Path newPath = Paths.get(PATH + File.separator + "copy_" + fileName);
        if (Files.exists(path)) {
            try {
                Files.copy(path, newPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("no file named: " + fileName);
        }
    }

    /*
    Zadanie 7
    Napisz program, który:

    Używając Scanner oraz File, wczyta plik numbers.txt zawierający liczby całkowite (jedna liczba na linię).
    Obliczy sumę wszystkich liczb i wyświetli ją na ekranie.
    Jeśli plik nie istnieje, wyświetl komunikat "Brak pliku numbers.txt".
    */
    public static void countNumbersInFile(String path) {
        File file = new File(path);
        Scanner scanner;
        int counter = 0;
        if (file.exists()) {
            try {
                scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    try {
                        counter += Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException nfe) {
                        System.out.println("it is not a number");
                    }
                }
                System.out.println("Sum of numbers= " + counter);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("no such file");
        }
    }

    /*
    Zadanie 8
    Napisz program, który:

    Używając FileInputStream i FileOutputStream, skopiuje plik binarny (np. obraz picture.jpg) do pliku picture_copy.jpg.
    Po zakończeniu kopiowania wyświetl komunikat "Kopiowanie zakończone pomyślnie".
    Zadbaj o użycie bufora (np. tablicy bajtów) dla wydajności.
    */
    public static void copyImage(String imageName) {
        try (FileInputStream in = new FileInputStream(PATH + imageName);
             FileOutputStream out = new FileOutputStream(PATH + "copy_" + imageName)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
                System.out.println(buffer);
                System.out.println(bytesRead);
            }


        } catch (IOException e) {
            System.out.println("blad");
        }

    }

    /*
Zadanie 9
Napisz program, który:

Używając Files.walk() przejdzie rekurencyjnie po katalogu logs.
Wypisze nazwy wszystkich plików .log znalezionych w tym katalogu i podkatalogach.
Jeśli katalog logs nie istnieje, wyświetl komunikat "Brak katalogu logs".
*/
    public static void printLogs() {
        Path path = Paths.get(PATH + "log");
        System.out.println(path);
        try {
            Files.walk(path)
                    .filter(p -> (p.toString().endsWith(".log")))
//                .filter(p -> (p.getFileName()))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    Zadanie 10
    Napisz program, który:

    Używając Files.lines(), wczyta plik large_data.txt, który może być duży.
    Za pomocą strumieni i metody filter() przefiltruje linie, które zawierają słowo "ERROR".
    Policzy ile takich linii jest i wyświetli wynik.
    Jeśli plik nie istnieje, wypisz komunikat "Plik large_data.txt nie istnieje".
     */
    public static void countErrorLines(String fileName) {
        Path path = Paths.get(PATH + fileName);
        try {
            if (Files.exists(path)) {
                System.out.println(Files.lines(path)
                        .filter(l -> l.contains("ERROR"))
                        .count());
            }else{
                System.out.println("file: "+ fileName+" does not exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
