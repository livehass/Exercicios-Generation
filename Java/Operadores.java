package TesteJava;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, y, resul;
		
		System.out.println("\n Entre com o primeiro numero");
		x = leia.nextInt();
		System.out.println("\n Entre com o segundo numero ");
		y = leia.nextInt();
		
		
		resul = x % y;
		
		
		System.out.println("\n resultado " + resul);
		
		
		
		leia.close();

	}
	
}
