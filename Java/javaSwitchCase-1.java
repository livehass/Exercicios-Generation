package exerciciosjava;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int qtd,op;
		float valorTotal;
		
		System.out.println("\n\t\t lanchone Família 71");
		System.out.println("\n1- Cachorro Quente -- R$10,00");
		System.out.println("\n2- X-Salada -- R$15,00\"");
		System.out.println("\n3- X-Bacon Quente -- R$18,00");
		System.out.println("\n4- Bauru -- R$12,00");
		System.out.println("\n5- Refrigerante -- R$8,00");
		System.out.println("\n6- Suco Laranja -- R$13,00");
		System.out.println("\nDigite sua opção");
		
		op = leia.nextInt();
		System.out.println("\nDigite a quantidade desse produto");
		qtd = leia.nextInt();
		
		switch(op) {
		case 1:
			valorTotal = 10 * qtd;
			System.out.println("\nProduto: Cachoro quente e o seu "
					+ "valor total foi de:"+valorTotal);
			break;
		case 2:
			valorTotal = 15 * qtd;
			System.out.println("\nProduto: X-Salada e o seu "
					+ "valor total foi de:"+valorTotal);
			break;
		case 3:
			valorTotal = 18 * qtd;
			System.out.println("\nProduto: X-Bacon e o seu "
					+ "valor total foi de:"+valorTotal);
			break;
		case 4:
			valorTotal = 12 * qtd;
			System.out.println("\nProduto: Bauru e o seu "
					+ "valor total foi de:"+valorTotal);
			break;
		case 5:
			valorTotal = 8 * qtd;
			System.out.println("\nProduto: Refrigerante e o seu "
					+ "valor total foi de:"+valorTotal);
			break;
		case 6:
			valorTotal = 13 * qtd;
			System.out.println("\nProduto: Suco de laranja e o seu "
					+ "valor total foi de:"+valorTotal);
			break;
			default:
				System.out.println("\nEsta opção não tem no menu!!!");
		}

	}

}
