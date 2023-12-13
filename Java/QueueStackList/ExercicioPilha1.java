package estruturadadosfilapilhalinked;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();
		int op;

		do {
			System.out.println("-----------------------------------");
			System.out.println("\n1- Adicionar livro a pilha ");
			System.out.println("\n2- listar todos os livros ");
			System.out.println("\n3- Retirar livro da pilha ");
			System.out.println("\n0- Sair");
			System.out.println("-----------------------------------");
			System.out.println("\nEntre com a opção desejada ");
			op = sc.nextInt();
			switch (op) {

			case 1:
				System.out.println("Digite o nome do livro");
				String livro;
				sc.nextLine();
				livro = sc.nextLine();
				pilha.push(livro);
				System.out.println("O " + livro + " Foi adicionado com sucesso");

				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia");
					break;
				}
				System.out.println("\nLista de todos os livros");
				System.out.println(pilha);
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia");
					break;
				}
				System.out.println("Digite o livro a ser removido");
				String removido;
				sc.nextLine();
				removido = sc.nextLine();
				pilha.remove(removido);
				System.out.println("O livro foi removido da lista!");
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}

		} while (op != 0);
		sc.close();

	}

}
