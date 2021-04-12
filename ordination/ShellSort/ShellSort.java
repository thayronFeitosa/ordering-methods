package ShellSort;

import file.CreateFIleText;

public class ShellSort {
  public static int[] shellSortOrderGrowing(int vetor[]) {
    long tempoInicial = System.currentTimeMillis();

    int h = vetor.length / 2;
    int key, j, i;
    int cont = 0;

    while (h > 0) {
      for (i = h; i < vetor.length; i++) {
        key = vetor[i];
        j = i;

        while (j >= h && vetor[j - h] > key) {
          vetor[j] = vetor[j - h];
          j = j - h;
          cont++;
        }
        vetor[j] = key;
       
      }
      h = h / 2;
    }
    long tempofinal = System.currentTimeMillis();
    String message = CreateFIleText.prepareWriteToTheNotePad("shellSortOrderGrowing", tempoInicial, tempofinal, cont);
    CreateFIleText.writeInNotepad(message);
    return vetor;
  }

  public static int[] shellSortOrderDescending(int vetor[]) {
    long tempoInicial = System.currentTimeMillis();

    int h = vetor.length / 2;
    int key, j, i;
    int cont = 0;

    while (h > 0) {
      for (i = h; i < vetor.length; i++) {
        key = vetor[i];
        j = i;

        while (j >= h && vetor[j - h] < key) {
          vetor[j] = vetor[j - h];
          j = j - h;
          cont++;
        }
        vetor[j] = key;
      }
      h = h / 2;
    }
    long tempofinal = System.currentTimeMillis();
    String message = CreateFIleText.prepareWriteToTheNotePad("shellSortOrderDescending", tempoInicial, tempofinal,
        cont);
    CreateFIleText.writeInNotepad(message);
    return vetor;
  }
}