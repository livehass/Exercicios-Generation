package exerciciosjava;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float vetor[] = new float[10];
		int i, verificaNumero;
		for (i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + " número do vetor");
			vetor[i] = sc.nextInt();
		}
		System.out.println("Digite o número que você deseja encontrar:");
		verificaNumero = sc.nextInt();
		for (i = 0; i < vetor.length; i++) {
			if (verificaNumero == vetor[i]) {
				System.out.println("O número " + vetor[i] + " está localizado na posição: " + i + "");
			} else {
				if (i == (vetor.length - 1)) {
					System.out.println("O número " + verificaNumero + " não foi encontrado!");
				}
			}

		}

		sc.close();

	}

}
