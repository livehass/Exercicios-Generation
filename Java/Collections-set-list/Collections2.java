package javaexerciciosestruturadedados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		int  num;
		
		for(int i=0;i<=9; i++) {
			System.out.println("Digite os números da lista ");
			minhaLista.add(sc.nextInt());
		}	
		System.out.println("Digite o número que você deseja encontrar: ");
		
		num = sc.nextInt();
		if(minhaLista.contains(num)) {
			System.out.println("O número "+num+"está localizado na posição: "+minhaLista.indexOf(num));
		}else {
			System.out.println("O número: "+num+" não foi encontrado!");
		}
		sc.close();
	}

}
