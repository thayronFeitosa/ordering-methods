package file;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

public class CreateFIleText {
  private static Formatter output;

  /**
   * 
   * the execution time transforming the milliseconds into: seconds, minutes,
   * hours ... according to the divisor that is passed as a parameter
   * 
   * @param timeInitial
   * @param timeFinal
   * @param divider
   * @return
   */
  private static long calculateRunTime(long timeInitial, long timeFinal, int divider) {
    return ((timeFinal - timeInitial) / divider);
  }

  public static String prepareWriteToTheNotePad(String nameFunction, long timeInitial, long timeFinal, int cont) {
    return ("<--" + nameFunction + "-->\nTempo em Milissegundos e de: " + (timeFinal - timeInitial)
        + "\nO tempo em Segundos e de: " + calculateRunTime(timeInitial, timeFinal, 1000)
        + "\nO tempo em Minutos e de : " + calculateRunTime(timeInitial, timeFinal, 600000)
        + "\nQuantidade de trocas e de: " + cont
        + "\n-------------------------------------------------------------------");

  }

  private static void openFile() {
    try {
      Path p = Paths.get("relatorio.txt");
      if (Files.exists(p)) {
        FileWriter f = new FileWriter("relatorio.txt", true);
        output = new Formatter(f);
      } else {
        output = new Formatter("relatorio.txt");
      }

    } catch (SecurityException securityException) {
      System.err.println("Permission writing danied. finish.");
      System.exit(1);
    } catch (FileNotFoundException fileNotFoundException) {
      System.err.println("Error opening file. finish.");
      System.exit(1);
    } catch (IOException e) {
      System.out.println("Error opening file one existing.");
      System.exit(1);
    }
  }

  private static void addRecords(String info) {

    try {
      output.format("%s%n", info);
    } catch (FormatterClosedException formatterClosedException) {

      System.err.println("Error writing to file.");
      return;
    } catch (NoSuchElementException noSuchElementException) {
      System.err.println("Invalid Input. Try again.");
    }
    System.out.println("Created in notepad");

  }

  private static void closeFile() {
    if (output != null) {
      output.close();
    }
  }

  public static void writeInNotepad(String infor) {
    openFile();
    addRecords(infor);
    closeFile();
  }

}
