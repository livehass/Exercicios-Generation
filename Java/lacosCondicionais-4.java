package exerciciosjava;

import java.util.Scanner;

public class lacosDeCondicao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String tipoVertebra, tipoAnimal, tipoALimentacao;

		System.out.println("Digite se o animal é vertebrado ou invertebrado");
		tipoVertebra = leia.nextLine();

		if (tipoVertebra.equalsIgnoreCase("vertebrado")) {
			System.out.println("Digite se o animal é ave ou mamífero");
			tipoAnimal = leia.nextLine();
			if (tipoAnimal.equalsIgnoreCase("ave")) {
				System.out.println("Digite é o tipo de alimentação do animal");
				tipoALimentacao = leia.nextLine();
				if (tipoALimentacao.equalsIgnoreCase("carnivoro")) {
					System.out.println("Aguia");
				} else if (tipoALimentacao.equalsIgnoreCase("onivoro")) {
					System.out.println("Pomba");
				} else {
					System.out.println("Opção inválida");
				}
			} else if (tipoAnimal.equalsIgnoreCase("mamifero")) {
				System.out.println("Digite é o tipo de alimentação onivoro ou herbivoro");
				tipoALimentacao = leia.nextLine();
				if (tipoALimentacao.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				} else if (tipoALimentacao.equalsIgnoreCase("herbivoro")) {
					System.out.println("Vaca");
				} else {
					System.out.println("Opção inválida");
				}
			} else {
				System.out.println("Opção inválida");
			}

		} else if (tipoVertebra.equalsIgnoreCase("invertebrado")) {
			System.out.println("Digite se o animal é inseto ou anelídeo");
			tipoAnimal = leia.nextLine();
			if (tipoAnimal.equalsIgnoreCase("inseto")) {
				System.out.println("Digite é o tipo de alimentação do animal");
				tipoALimentacao = leia.nextLine();
				if (tipoALimentacao.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				} else if (tipoALimentacao.equalsIgnoreCase("herbivoro")) {
					System.out.println("Lagarta");
				} else {
					System.out.println("Opção inválida!");
				}
			} else if (tipoAnimal.equals("anelideo")) {
				System.out.println("O animal é onivoro ou hematófago?");
				tipoALimentacao = leia.nextLine();
				if (tipoALimentacao.equalsIgnoreCase("onivoro")) {
					System.out.println("Minhoca");
				} else if (tipoALimentacao.equalsIgnoreCase("hematófago")) {
					System.out.println("Sanguessuga");
				} else {
					System.out.println("Opção inválida");
				}
			} else {
				System.out.println("Opção Inválida");
			}

		} else {
			System.out.println("Opção Inválida");
		}
		leia.close();

	}

}
