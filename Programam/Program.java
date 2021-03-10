package Programam;

import file.CreateFIleText;
import bubbleSort.BubbleSort;
import createVetor.Vetor;

public class Program {

	public static void main(String[] args) {
		BubbleSort buble = new BubbleSort();

		Vetor vet1 = new Vetor();
		CreateFIleText.writeInNotepad("Entrando BublleSort 1 milhão\n\n");
		buble.bublleSortOrderGrowing(vet1.createVetorRandom(1000));

	}

}
