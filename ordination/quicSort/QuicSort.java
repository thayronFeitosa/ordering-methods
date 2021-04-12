package quicSort;

import file.CreateFIleText;
import createVetor.Vetor;

public class QuicSort {
  public static int contador; 
  public static int comparacao;
  public static void main(String[] args) {
    Vetor vet1 = new Vetor();
    CreateFIleText.writeInNotepad("Entrando QuicSort 100k \n\n");
    int vetor[] = vet1.createVetorRandom(100000000);
   
    sort(vetor, 0, vetor.length - 1);
    // printarVetor(vetor);

    // System.out.println(contador);
    // System.out.println(comparacao);
    CreateFIleText.writeInNotepad("terminou o QuicSort 100k \n\n");

  }

  public static void sort(int vetor[], int inicio, int fim) {
    if (inicio < fim) {
      int posicaoPivo = separar(vetor, inicio, fim);
      sort(vetor, inicio, posicaoPivo - 1);
      sort(vetor, posicaoPivo + 1, fim);
    }
  }

  public static int separar(int vetor[], int inicio, int fim) {
    int pivo = vetor[inicio];
    int pontaEsq = inicio + 1;
    int pontaDir = fim;

    while (pontaEsq <= pontaDir) {
      comparacao ++;

      if (vetor[pontaEsq] <= pivo) {
        pontaEsq++;
      }

      else if (vetor[pontaDir] > pivo) {
        pontaDir--;
      }

      else {
        contador++;
        troca(vetor, pontaEsq, pontaDir);
      }
    }

    vetor[inicio] = vetor[pontaDir];
    vetor[pontaDir] = pivo;
    return pontaDir;
  }

  public static void troca(int vetor[], int pontaEsq, int pontaDir) {
    int troca = vetor[pontaEsq];
    vetor[pontaEsq] = vetor[pontaDir];
    vetor[pontaDir] = troca;
    pontaEsq++;
    pontaDir--;
  }

  public static void printarVetor(int vetor[]) {
    System.out.print("vetor [ ");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.print("]; ");
    System.out.println(" ");
  }

}