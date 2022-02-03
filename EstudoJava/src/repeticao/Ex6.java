package repeticao;

import java.util.Scanner;

public class Ex6 {
	public static void main (String arg[]) {
		Scanner ler = new Scanner (System.in);
		int y,soma=0,contador=0,media;
		
		do 
		{
			System.out.println("Digite aqui um número, se o número for multiplo de 3 ao final será feito a média.\nSe desejar parar digite 0.");
			y = ler.nextInt();
			
			if (y%3==0 && y!=0)
			{
				soma = y + soma;
				contador++;
			}
		}
		while(y!=0);
		media = soma/contador;
		System.out.println("A média dos números digitados é: "+media);
	}

}
