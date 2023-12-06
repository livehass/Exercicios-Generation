package exercicios_java;

import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota, media, totalNotas = 0;
		int qtdNotas;
		
		System.out.println("\n Digite a quantidade de notas");
		qtdNotas = leia.nextInt();

		for(int i = 1; i <= qtdNotas; i++) {
			System.out.println("Digite a " + i + "° Nota");
			
			nota = leia.nextFloat();
			
			totalNotas += nota;
		}
		
		
		media = totalNotas / qtdNotas;
		
		System.out.printf("\n o novo salario é %.1f ", media);
		
		
		
		leia.close();

	}
	
}
