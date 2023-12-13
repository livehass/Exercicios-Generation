package javaexerciciosestruturadedados;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSet2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> setNumeros = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Entre com o " + (i + 1) + "° Número");
			setNumeros.add(sc.nextInt());
		}
		System.out.println("Digite o número que você deseja encontrar:");
		int num = sc.nextInt();
		if (setNumeros.contains(num)) {
			System.out.println("O número " + num + " foi encontrado!");
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}
		sc.close();
	}
	
}
