package exercicios_java;

import java.util.Scanner;

public class Exercicio4{
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float[] numeros =  new float[4];
		float calculo;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite um número " + (i + 1));
			numeros[i] = leia.nextFloat();
		}
			calculo = (numeros[0] * numeros[1] - numeros[2] * numeros[3]);
			
			
			System.out.println("A diferença é: " + calculo);
		leia.close();

	}
}

