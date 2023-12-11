package exerciciosjava;

import java.util.Scanner;

public class Matrizes1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite o numero da linha: [" + linha + "][" + coluna + "]");
				matriz[linha][coluna] = sc.nextInt();
			}
		}
		System.out.println("\nElementos da Diagonal Principal: " + matriz[0][0] + matriz[1][1] + matriz[2][2]);
		System.out.println("\nElementos da Diagonal Secundária: " + matriz[0][2] + matriz[1][1] + matriz[2][0]);
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + (matriz[0][0] + matriz[1][1] + matriz[2][2]));
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + (matriz[0][2] + matriz[1][1] + matriz[2][0]));
	}
}
