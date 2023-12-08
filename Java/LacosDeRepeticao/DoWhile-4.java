package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int n,total = 0;
		do {
			System.out.println("\nDigite um número inteiro ");
			n = sc.nextInt();
			if(n > 0) {
				total += n;
			}	
		}
			while(n != 0);	
		
		System.out.println("A soma dos números positivos é "+ total);
		sc.close();
	}

}
