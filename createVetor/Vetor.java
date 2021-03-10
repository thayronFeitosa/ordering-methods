package createVetor;

import java.util.Random;

public class Vetor {
	Random ran = new Random();
	public int []createVetorRandom(int size) {
		int []vetor = new int [size];
		for (int i = 0; i < size; i++) {
			vetor[i] = ran.nextInt(size);
		}
		return vetor;
	}

}
