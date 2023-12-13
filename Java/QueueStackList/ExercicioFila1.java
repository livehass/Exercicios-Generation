package estruturadadosfilapilhalinked;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<String> chegada = new LinkedList<String>();
		int op;

		do {
			System.out.println("-----------------------------------");
			System.out.println("\n1- Adicionar CLiente na Fila ");
			System.out.println("\n2- listar todos os Clientes ");
			System.out.println("\n3- Retirar CLiente da Fila ");
			System.out.println("\n0- Sair");
			System.out.println("-----------------------------------");
			System.out.println("\nEntre com a opção desejada ");
			op = sc.nextInt();
			switch (op) {

			case 1:
				System.out.println("Digite o nome ");
				sc.nextLine();
				String nome = sc.nextLine();
				chegada.add(nome);
				System.out.println("Cliente " + nome + " Adicionado com sucesso");
				break;
			case 2:
				if(chegada.isEmpty()) {
					System.out.println("A Fila está vazia");
					break;
				}
				System.out.println("\nLista de todos os clientes");
				System.out.println(chegada);
				break;
			case 3:
				if(chegada.isEmpty()) {
					System.out.println("A Fila está vazia");
					break;
				}
				System.out.println("Digite o elemento a ser removido");
				String removido;
				sc.nextLine();
				removido = sc.nextLine();
				chegada.remove(removido);
				System.out.println("O elemento foi removido da lista!");
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}

		} while (op != 0);
		sc.close();

	}

}
