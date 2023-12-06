package exercicios_java;

import java.util.Scanner;

public class abonoSalarial{

	public static void main(String[] args) {
		
	
		Scanner leia = new Scanner(System.in);
	
		int slario, abono, novoSalario;
		
		System.out.println("\n Digite o salario");
		salario = leia.nextInt();
		System.out.println("\n Digite o abono");
		abono = leia.nextInt();

		novoSalario = salario + abono;

		System.out.println("\n o novo salario é" + novoSalario);

		leia.close();
	}

}
