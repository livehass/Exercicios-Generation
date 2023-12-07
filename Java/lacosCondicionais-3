package exerciciosjava;

import java.util.Scanner;

public class lacosDeCondicao3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
      String nome;
      int idade;
      boolean primeiraVez;
      
      	System.out.println("Digite o Nome do doador");
      	nome = leia.next();
      	leia.nextLine();
      	
      	System.out.println("Digite a Idade do doador:");
      	idade = leia.nextInt();
       
      	System.out.println("Primeira doação de sangue?");
      	primeiraVez = leia.nextBoolean();
      	
      	if((idade < 18 || idade > 69 ) || (idade >= 60 && idade <= 69 && primeiraVez)){
      		System.out.println(nome + " Não está apto(a) apra doar sangue!");
      	}else {
      		System.out.println(nome +" está apto(a) para doar sangue!");
      	}
      leia.close();
        
	} 

}
