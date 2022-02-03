package vetorMatriz;

import java.util.Scanner;

public class Ex2 {
	public static void main (String arg[])
	{
		int vet[] = new int[10],contador=0,soma=0;
		Scanner ler = new Scanner (System.in);
		
		for (int x=0;x<10;x++)
		{
			System.out.println("Digite o número da face do dado: ");
			vet[x] = ler.nextInt();
			soma = vet[x]+soma;
			
			if(vet[x]==6)
			{
				contador++;
			}
		}
		System.out.println("A média aritmética dos lançamentos dos dados foi: "+soma/10);
		System.out.println("E o número de vezes em que ocorreu o maior número dos lançamentos foi: "+contador);
	}

}
