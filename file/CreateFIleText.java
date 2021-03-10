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

	public static void main(String[] args) {
	  String teste = "teste";
	  writeInNotepad(teste);
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
  
	public static void writeInNotepad (String infor) {
	  openFile();
	  addRecords(infor);
	  closeFile();
	}
  
  }
  