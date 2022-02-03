package repeticao;

import java.util.Scanner;

public class Ex5 {
	public static void main (String arg[]) {
		Scanner ler = new Scanner (System.in);
		
		int x,soma=0;
		

		
		do 
		{
			System.out.println("Digite aqui um número do seu teclado: ");
			x = ler.nextInt();
			System.out.println("Para parar a soma digite 0.");
			soma = x + soma;
				
		}
		while (x!=0);
		System.out.println("A soma de todos os números que você digitou do seu teclado é: "+soma);
	}

}
