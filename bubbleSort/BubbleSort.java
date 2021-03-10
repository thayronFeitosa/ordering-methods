package bubbleSort;

import file.CreateFIleText;

public class BubbleSort {
	/*
	 * 
	 * metodo ordena em ordem crescente
	 */
	public int[] bublleSortOrderGrowing(int[] vetor) {
		// int aux = 0;
		int cont = 0;
		long tempoInicial = System.currentTimeMillis();
		int i, j, aux;

		for (j = 0; j < vetor.length; j++) {
			for (i = 0; i < vetor.length - 1; i++) {

				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					cont++;
				}
			}
		}
		long tempofinal = System.currentTimeMillis();
    String message = CreateFIleText.prepareWriteToTheNotePad("bublleSortOrderGrowing", tempoInicial, tempofinal, cont);
    CreateFIleText.writeInNotepad(message);
		return vetor;
	}

	/**
	 * metodo ordena em orden decresente
	 * 
	 * @param vetor
	 * @return
	 */
	public int[] bublleSortOrderDescending(int[] vetor) {
		int aux = 0;
		int cont = 0;
		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] < vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					cont++;
				}
			}
		}
		long tempofinal = System.currentTimeMillis();
		String message = CreateFIleText.prepareWriteToTheNotePad("bublleSortOrderDescending", tempoInicial, tempofinal, cont);
    CreateFIleText.writeInNotepad(message);


		return vetor;
	}
	/**
	 * mostra os valores das possi��o do vetor
	 * 
	 * @param vetor
	 */
	public void mostrar(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");
		}
	}
}
