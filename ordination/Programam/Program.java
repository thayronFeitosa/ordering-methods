package Programam;

import file.CreateFIleText;
import bubbleSort.BubbleSort;
import createVetor.Vetor;
import ShellSort.ShellSort;
import MergeSort.MergeSort;

public class Program {

  public static void main(String[] args) {
    BubbleSort buble = new BubbleSort();
    ShellSort shellSort = new ShellSort();
    MergeSort mergeSort = new MergeSort();

    Vetor vet1 = new Vetor();
    int[] vetAux;
    // CreateFIleText.writeInNotepad("Entrando BublleSort 1 milhão\n\n");
    // // vetAux = buble.bublleSortOrderGrowing(vet1.createVetorRandom(1000000));
    // //order when random
    // vetAux = buble.bublleSortOrderGrowing(vet1.createVetorRandom(500000));
    // //order when random
    // vetAux = buble.bublleSortOrderGrowing(vetAux); // already ordered
    // vetAux = buble.bublleSortOrderDescending(vetAux); // sort Growing
    // buble.bublleSortOrderDescending(vetAux); //already ordered Descending

    // CreateFIleText.writeInNotepad("Entrando BublleSort 50 millões\n\n");
    // vetAux = buble.bublleSortOrderGrowing(vet1.createVetorRandom(50000000));
    // //order when random
    // vetAux = buble.bublleSortOrderGrowing(vetAux); // already ordered
    // vetAux = buble.bublleSortOrderDescending(vetAux); // sort Growing
    // buble.bublleSortOrderDescending(vetAux); //already ordered Descending

    // CreateFIleText.writeInNotepad("Entrando BublleSort 100 millões\n\n");
    // vetAux = buble.bublleSortOrderGrowing(vet1.createVetorRandom(100000000));
    // //order when random
    // vetAux = buble.bublleSortOrderGrowing(vetAux); // already ordered
    // vetAux = buble.bublleSortOrderDescending(vetAux); // sort Growing
    // buble.bublleSortOrderDescending(vetAux); //already ordered Descending

    // CreateFIleText.writeInNotepad("Entrando shellSort 1 milhão\n\n");
    // vetAux = shellSort.shellSortOrderGrowing(vet1.createVetorRandom(10000000));
    // vetAux = shellSort.shellSortOrderGrowing(vetAux);
    // vetAux = shellSort.shellSortOrderDescending(vetAux);
    // shellSort.shellSortOrderDescending(vetAux);
    CreateFIleText.writeInNotepad("Entrando shellSort 1 milhão\n\n");
    mergeSort.sortOrderOrderGrowing(vet1.createVetorRandom(5), 0, 4);





  }

}
