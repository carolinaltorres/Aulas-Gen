package repeticao;

import java.util.Scanner;

public class Ex3 {
	public static void main (String arg[]) 
	{
		Scanner ler = new Scanner (System.in);
		int idade,men21=0,mais50=0;
		
		System.out.println("Escreva aqui a idade, quando desejar parar digite: -99");
		idade = ler.nextInt();
		
		while (idade!=-99)
		{
			System.out.println("Escreva aqui a idade, quando desejar parar digite: -99");
			idade = ler.nextInt();
			
			if (idade<=21)
			{
				men21++;
			}
			if (idade>=50)
			{
				mais50++;
			}
		}
		
		System.out.println("O número de pessoas com menos de 21 anos é : "+men21);
		System.out.println("O número de pessoas com mais de 50 anos é: "+mais50);
		
	}

}
