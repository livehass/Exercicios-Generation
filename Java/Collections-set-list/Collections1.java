package javaexerciciosestruturadedados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collections1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> novaLista = new ArrayList<String>();

		for(int i = 0; i <= 4; i++) {
			System.out.println("Digite a "+(i + 1)+"° cor da lista: ");
			String cor = sc.nextLine();
			novaLista.add(cor);
		}
		System.out.println("\nLista das cores: "+novaLista);
		
		Collections.sort(novaLista);
		System.out.println("Lista Ordenada:"+novaLista);
		
		sc.close();
	}

}
