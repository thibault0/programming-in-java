package agh.ii.prinjava.lab03.lst03_06;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    private static final String[] textLines = {
            "All I have for you is a gesture, in combination with a word.",
            "Tenet.",
            "Use it carefully.",
            "It'll open the right doors, but some of the wrong ones, too."
    };

    private static final String demoFileName1 = "tenet.txt";

    private static void deleteDemoFile() {
        try {
            Files.deleteIfExists(Path.of("tenet.txt"));
            System.out.println("\nDemo file deleted");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Low-level style writing to a text file demo */
    private static void demo1() {
        System.out.println("demo1...");
        try (var fout = new BufferedWriter(new FileWriter(demoFileName1))) {
            for (var line : textLines) {
                fout.write(line);
            }
            System.out.println("Writing to " + demoFileName1 + " completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** As {@link #demo1} but with the use of {@link PrintWriter} */
    private static void demo2() {
        System.out.println("\ndemo2...");
        try (PrintWriter fout = new PrintWriter(demoFileName1)) {
            for (var line : textLines) {
                fout.println(line);
            }
            System.out.println("Writing to " + demoFileName1 + " completed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /** Low-level style reading from a text file demo */
    private static void demo3() {
        System.out.println("\ndemo3...");
        try (var fin = new BufferedReader(new InputStreamReader(new FileInputStream(demoFileName1)))) {
            String line;
            while ((line = fin.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** As {@link #demo3} but with the use of {@link Scanner} */
    private static void demo4() {
        System.out.println("\ndemo4...");
        try (var fin = new Scanner(Path.of(demoFileName1))) {
            while (fin.hasNextLine()) {
                String line = fin.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        demo1();
        deleteDemoFile();
        demo2();
        demo3();
        demo4();
        deleteDemoFile();
    }
}
