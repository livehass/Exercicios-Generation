package exerciciosjava;

import java.util.Scanner;

public class lacosDeCondicao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
        int a, b, c;
        System.out.println("Digite o número A:");
        a = leia.nextInt();
        System.out.println("Digite o número B:");
        b = leia.nextInt();
        System.out.println("Digite o número C:");
        c = leia.nextInt();
        
        if(b + a > c) {
        	System.out.println("A soma de A + B é Maior que C");
        }else if(a + b < c) {
        	System.out.println("A soma de A + B é Menor que C");
        }else {
        	System.out.println("A Soma de A + B é Igual a C");
        }
        leia.close();
	}
}
