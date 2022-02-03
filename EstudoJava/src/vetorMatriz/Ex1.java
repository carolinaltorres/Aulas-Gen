package vetorMatriz;

import java.util.Scanner;

public class Ex1 {
	public static void main (String arg[])
	{
		int vet[]= new int[5],maiorval=0;
		Scanner ler = new Scanner (System.in);
		
		for(int x=0;x<5;x++)
		{
			System.out.println("Digite aqui um valor: ");
			vet[x]=ler.nextInt();
				
				if (maiorval< vet[x]);
				{
					maiorval= vet[x];
				}
		}
		System.out.println("O maior valor do seu vetor é: "+maiorval);
	}
}
