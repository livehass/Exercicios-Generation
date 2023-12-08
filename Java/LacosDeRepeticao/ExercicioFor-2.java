package loops;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n,p=0,im=0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o "+ (i + 1) +" número:");
			n = sc.nextInt();
			if(n%2==0) {
				p++;
				
			}else {
				im++;
			}
		}
		System.out.println("Total de números pares: "+ p);
		System.out.println("Total de números ímpares: "+ im);

		sc.close();
	}

}
