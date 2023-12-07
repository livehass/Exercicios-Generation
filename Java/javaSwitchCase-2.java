package exerciciosjava;

import java.util.Scanner;

public class switchCase {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		int code;
		float salary;
		System.out.println("Nome do colaborador:");
		name = sc.nextLine();
		System.out.println("Digite um cargo(codigo de 1 a 6)");
		code = sc.nextInt();
		System.out.println("Salário:");
		salary = sc.nextFloat();

		switch (code) {
		case 1:
			System.out.println("Nome Do Colaborador:" + name + "\nCargo: Gerente" + "\nSalário: R$"+ (salary + 0.10 * salary));
			break;
		case 2:
			System.out.println("Nome Do Colaborador:" + name + "\nCargo: Vendedor" + "\nSalário: R$"+ (salary + 0.07 * salary));
			break;
		case 3:
			System.out.println("Nome Do Colaborador:" + name + "\nCargo: Supervisor" + "\nSalário: R$"+ (salary + 0.09 * salary));
			break;
		case 4:
			System.out.println("Nome Do Colaborador:" + name + "\nCargo: Motorista" + "\nSalário: R$"+ (salary + 0.06 * salary));
			break;
		case 5:
			System.out.println("Nome Do Colaborador:" + name + "\nCargo: Estoquista" + "\nSalário: R$"+ (salary + 0.05 * salary));
			break;
		case 6:
			System.out.println("Nome Do Colaborador:" + name + "\nCargo: Técnico de TI" + "\nSalário: R$"+ (salary + 0.08 * salary));
			break;
		default: 
			System.out.println("O número escolhido é inválido, digite um código de 1 a 6");
		}
		
		sc.close();
	}
	

}
