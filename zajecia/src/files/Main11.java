package files;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        if (createOutput()) {
            System.out.println("output directory created");
        } else {
            System.out.println("output directory already exists");
        }
        File[] files = getAllFiles();
        int resultFilesNumber = files.length;
        if (resultFilesNumber == 0) {
            System.out.println("Brak plików do przetworzenia");
            return;
        }
        System.out.println("reszta programu");
        ArrayList<String> allLines = new ArrayList<>();
        for (File f : files) {
            System.out.println(f);
            allLines.addAll(readFileIntoList(f));
        }
        int resultLinesNumber = allLines.size();
        long resultInfoLinesNumber = countInfoLines(allLines);
        long resultErrorLinesNumber = countErrorLines(allLines);
        long resultWarnLinesNumber = countWarnLines(allLines);
        String errorAbsolutePath = combinedFile(allLines, "ERROR", "errors_combined");
        String infoAbsolutePath = combinedFile(allLines, "INFO", "info_combined");
        System.out.println(String
                .format("Number of files: %d \nNumber of all lines: %d\nNumber of:\n\twarn: %d\n\terror: %d\n\tinfo: %d\nerrors path: %s \ninfo path: %s"
                        , resultFilesNumber, resultLinesNumber, resultWarnLinesNumber, resultErrorLinesNumber, resultInfoLinesNumber
                        , errorAbsolutePath, infoAbsolutePath));
//        System.out.println(allLines.toString());
    }

    public static boolean createOutput() {
        return new File("zajecia/src/files/output").mkdirs();
    }

    public static File[] getAllFiles() {
        File dir = new File("zajecia/src/files/input");
        File[] directories = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
//        System.out.println(Arrays.toString(directories));
        return directories;
    }

    public static ArrayList<String> readFileIntoList(File file) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
//                System.out.println(line);
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static long countInfoLines(ArrayList<String> lines) {
        return lines.stream()
                .filter(l -> l.contains("INFO"))
                .count();
    }

    public static long countErrorLines(ArrayList<String> lines) {
        return lines.stream()
                .filter(l -> l.contains("ERROR"))
                .count();
    }

    public static long countWarnLines(ArrayList<String> lines) {
        return lines.stream()
                .filter(l -> l.contains("WARN"))
                .count();
    }

    public static String combinedFile(ArrayList<String> lines, String containsText, String fileName) {
        try {
            String path = "zajecia/src/files/output/" + fileName + ".txt";
            new File(path).createNewFile();
            FileWriter errorsWriter = new FileWriter(path);
            lines.stream()
                    .filter(l -> l.contains(containsText))
                    .forEach(line -> {
                        try {
                            errorsWriter.append(line + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
            errorsWriter.close();
            return new File(path).getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}
