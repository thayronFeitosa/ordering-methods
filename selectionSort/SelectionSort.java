package selectionSort;

import file.CreateFIleText;

public class SelectionSort {
	private int i;
	private int j;
	private int min;
	private int aux;

	/**
	 * metodo ordena em ordem crescente
	 * 
	 * @param vetor
	 * @return
	 */
	public int[] selectionSortOrderGrowing(int vetor[]) {
		int cont = 0;
		long tempoInicial = System.currentTimeMillis();

		for (i = 0; i < vetor.length - 1; i++) {
			min = i;

			for (j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[min])
					min = j;
				cont++;
			}
			aux = vetor[i];
			vetor[i] = vetor[min];
			vetor[min] = aux;

		}
		long tempofinal = System.currentTimeMillis();
		String message = CreateFIleText.prepareWriteToTheNotePad("selectionSortOrderGrowing", tempoInicial, tempofinal, cont);
    CreateFIleText.writeInNotepad(message);
		return vetor;
	}

	public int[] selectionSortOrderDescending(int vetor[]) {
		int cont = 0;
		long tempoInicial = System.currentTimeMillis();

		for (i = 0; i < vetor.length - 1; i++) {
			min = i;
		
			for (j = i + 1; j < vetor.length; j++) {
				if (vetor[j] > vetor[min])
					min = j;
				cont++;

			}
			aux = vetor[i];
			vetor[i] = vetor[min];
			vetor[min] = aux;

		}
		long tempofinal = System.currentTimeMillis();
		String message = CreateFIleText.prepareWriteToTheNotePad("selectionSortOrderDescending", tempoInicial, tempofinal, cont);
    CreateFIleText.writeInNotepad(message);
		return vetor;
	}

	public void mostrar(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");

		}
	}
}