package exerciciosjava;

import java.util.Scanner;

public class switchCase3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float n1, n2,result;
		int op;
		System.out.println("Digite o 1º número:");
		n1 = sc.nextFloat();
		System.out.println("Digite o 2º número");
		n2 = sc.nextFloat();
		System.out.println("Operação:");
		op = sc.nextInt();
		
		switch(op) {
		case 1:
			result = n1 + n2;
			System.out.println(result);
			break;
		case 2:
			result = n1 - n2;
			System.out.println(result);
			break;
		case 3:
			result = n1 * n2;
			System.out.println(result);
			break;
		case 4:
			result = n1 / n2;
			System.out.println(result);
			break;
		default:
			System.out.println("Operação Inválida!");
		}	
		sc.close();
	}
}
