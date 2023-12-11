package exerciciosjava;

import java.util.Arrays;
import java.util.Scanner;

public class Matrizes2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float[][] matrix = new float[10][4];
		float[] vetorM = new float[10];
		int coluna = 0;
		for (int linha = 0; linha < matrix.length; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {

				System.out.println("Digite o numero da linha: [" + linha + "] e coluna[" + coluna + "]");
				matrix[linha][coluna] = sc.nextFloat();
				vetorM[linha] += matrix[linha][coluna];
			}
			vetorM[linha] /= 4;
			vetorM[linha] = round(vetorM[linha], 1);
		}
		System.out.println(Arrays.toString(vetorM));
		sc.close();
	}
	private static float round(float vetorM, int precisao) {
		int escala = (int) Math.pow(10, precisao);
		return (float) Math.round(vetorM * escala) / escala;
	}
}
