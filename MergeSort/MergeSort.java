package MergeSort;

import file.CreateFIleText;

public class MergeSort {

  public static void sortOrderOrderGrowing(int vetor[], int inicio, int fim) {

    if (inicio < fim) {
      int meio = (inicio + fim) / 2;
      sortOrderOrderGrowing(vetor, inicio, meio);
      sortOrderOrderGrowing(vetor, meio + 1, fim);
      mergeOrderOrderGrowing(vetor, inicio, meio, fim);
    }
  }

  private static void mergeOrderOrderGrowing(int vetor[], int inicio, int meio, int fim) {

    int secundario[] = new int[vetor.length];

    for (int k = inicio; k <= fim; k++) {
      secundario[k] = vetor[k];
    }

    int indiceEsquerdo = inicio;
    int indiceDireito = meio + 1;

    for (int k = inicio; k <= fim; k++) {
      if (indiceEsquerdo > meio)
        vetor[k] = secundario[indiceDireito++];
      else if (indiceDireito > fim)
        vetor[k] = secundario[indiceEsquerdo++];
      else if (secundario[indiceEsquerdo] < secundario[indiceDireito])
        vetor[k] = secundario[indiceEsquerdo++];
      else
        vetor[k] = secundario[indiceDireito++];
    }
  }
}