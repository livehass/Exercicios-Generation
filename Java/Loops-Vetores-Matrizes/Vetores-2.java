package exerciciosjava;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[10], i;
		float media = 0, soma = 0;
        
		for (i = 0; i < vetor.length; i++) {
			System.out.print("\nDigite o " + (i + 1) + " Número: ");
			vetor[i] = sc.nextInt();
		}
		System.out.println("\nElementos nos índices ímpares: ");
		for (i = 0; i < vetor.length; i++) {
			if (i % 2 != 0) {
				System.out.print(" " + vetor[i]);
			}
		}
		System.out.println("\nElementos pares: ");
		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(" " + vetor[i]);
			}
		}
		for (i = 0; i <= vetor.length; i++) {
			soma = soma + i;
			media = soma / 10;
		}
		System.out.print("\nSoma: " + soma);
		System.out.print("\nMédia: " + media);
	}
}
