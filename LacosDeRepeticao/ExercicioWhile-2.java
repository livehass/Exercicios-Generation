package loops;

import java.util.Scanner;

public class while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, i = 0, qtd = 11, somaMenor21 = 0, somaMaior50 = 0;

		while (i < qtd) {
			System.out.println("Digite uma idade");
			n = sc.nextInt();
			if (n < 0) {
				break;
			}
			if (n < 21) {
				somaMenor21++;
			}
			if (n > 50) {
				somaMaior50++;
			}
			i++;
		}
		System.out.println("Total de pessoas menores de 21 anos:" + somaMenor21);
		System.out.println("Total de pessoas maiores de 50 anos:" + somaMaior50);
		sc.close();
	}

}
