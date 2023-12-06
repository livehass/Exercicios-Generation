package TesteJava;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		
		
		Scanner leia = new Scanner(System.in);
	
		String nome = "Felipe";
		int idade = 26;
		float altura = (float)1.85;
		

		
		System.out.println("\n Entre com a nome ");
		nome = leia.nextLine();
		
		System.out.println("\n Entre com o idade ");
		idade = leia.nextInt();
	
		System.out.println("\n Entre com a altura ");
		altura = leia.nextFloat();
		
		System.out.println("\n Meu nome é" + " felipe");
		System.out.println("\n Minha idade é " + idade);
		System.out.println("\n Minha altura é " + altura);
		
		leia.close();
	}

}
