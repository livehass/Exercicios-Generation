package loops;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age, iDg, pD, backend = 0, mFrontEnd = 0, mMobile = 0, fStack = 0, total = 0, totalAge = 0;
		String s = "s";
		double media = 0;

		while (s.equalsIgnoreCase("s")) {

			System.out.println("Didite a Idade");
			age = sc.nextInt();

			System.out.println("Digite sua Identidade de Gênero ");
			System.out.println("\n1 - Mulher Cis ");
			System.out.println("\n2 – Homem Cis ");
			System.out.println("\n3 – Não Binário ");
			System.out.println("\n4 – Mulher Trans ");
			System.out.println("\n5 – Homem Trans ");
			System.out.println("\n6 – Outros");
			iDg = sc.nextInt();

			System.out.println("Qual a sua aréa na tecnologia?");
			System.out.println("\n1 – Backend");
			System.out.println("\n2 – Frontend");
			System.out.println("\n3 – Mobile");
			System.out.println("\n4 – FullStack");

			pD = sc.nextInt();
			
			System.out.println(" deseja continuar a leitura dos dados de um novo colaborador ou não (S/N)");
			s = sc.next();
			total++;
			totalAge += age;
			media = totalAge / total;
			if (pD == 1)
				backend++;
			if ((iDg == 1 || iDg == 4) && pD == 2)
				mFrontEnd++;
			if ((iDg == 2 || iDg == 5) && pD == 3 && age > 40)
				mMobile++;
			if(iDg ==3 && pD ==4 && age < 30)
				fStack++;

		}
		System.out.println("\nO número de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("\nO número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mFrontEnd);
		System.out.println("\nO número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mMobile);
		System.out.println("\nO número de Não Binários desenvolvedores FullStack menores de 30 ano: " + fStack);
		System.out.println("\nO número total de pessoas que responderam à pesquisa: " + total);
		System.out.println("\n média de idade das pessoas que responderam à pesquisa: "+ media );
		sc.close();
	}

}
