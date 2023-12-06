package exercicios_java;

import java.util.Scanner;

public class salarioLiquido {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		float salbruto, adnoturno, hextras, descontos, saliquido;

		System.out.println("Digite o Salário Bruto: ");
		salariobruto = read.nextFloat();
		System.out.println("Digite O Adicional Noturno: ");
		adnoturno = read.nextFloat();
		System.out.println("Digite as Horas Extras: ");
		hextras = read.nextFloat();
		System.out.println("Digite os Descontos: ");
		descontos = read.nextFloat();

		saliquido = (salbruto + adnoturno + (hextras * 5) - descontos);

		System.out.println("Seu Salário Líquido é de: R$" + saliquido);

		leia.close();
		
	}
}
	
}
