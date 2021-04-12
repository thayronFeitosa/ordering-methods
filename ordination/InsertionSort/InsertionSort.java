package InsertionSort;

import file.CreateFIleText;

public class InsertionSort {
	private int i;
	private int j;
	private int aux;
	private int cont;
	private int[] vet;

	public InsertionSort() {
	}

	/**
	 * Metodo ordena um vetor de forma crescnete
	 * 
	 * @param vetor
	 * @return
	 */
	public int[] InsertionSortOrderGrowing(int[] vetor) {

		long tempoInicial = System.currentTimeMillis();
		for (i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i - 1;

			while (j >= 0 && vetor[j] > aux) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			cont++;
			vetor[j + 1] = aux;
		}
		long tempofinal = System.currentTimeMillis();
    String message = CreateFIleText.prepareWriteToTheNotePad("InsertionSortOrderGrowing", tempoInicial, tempofinal, cont);
    CreateFIleText.writeInNotepad(message);
		this.vet = vetor;
		return vet;
	}

	/**
	 * Metodo ordena o vetor em ordem decresente
	 * 
	 * @param vetor
	 * @return
	 */
	public int[] InsertionSortOrderDescending(int[] vetor) {
		long tempoInicial = System.currentTimeMillis();

		for (i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i - 1;

			while (j >= 0 && vetor[j] < aux) {
				vetor[j + 1] = vetor[j];
				j--;
		
			}
			cont++;
			vetor[j + 1] = aux;

		}
		long tempofinal = System.currentTimeMillis();
    String message = CreateFIleText.prepareWriteToTheNotePad("InsertionSortOrderDescending", tempoInicial, tempofinal, cont);
    CreateFIleText.writeInNotepad(message);
		this.vet = vetor;
		return vet;

	}

	/**
	 * metodo corre todas as possi��es do vetor mostrando seus valores
	 * 
	 * @param vetor
	 */
	public void mostrar(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");
		}
	}

}
