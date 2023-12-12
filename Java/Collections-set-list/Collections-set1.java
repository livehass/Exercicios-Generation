package javaexerciciosestruturadedados;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionsSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> setNumeros = new HashSet<Integer>();

		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);

		System.out.println("notas" + setNumeros.toString());
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int num = sc.nextInt();
		if (setNumeros.contains(num)) {
			System.out.println(
					"O número " + num + " está localizado na posição " + setNumeros.toArray()[num] + "da Lista");
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}

		sc.close();

	}

}
