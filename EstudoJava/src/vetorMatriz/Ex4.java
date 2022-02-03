package vetorMatriz;

import java.util.Scanner;

public class Ex4 {
	public static void main (String arg[])
	{
		Scanner ler = new Scanner (System.in);
		int[][] matriz = new int[3][3];
		
		for(int linha=0;linha<3;linha++) 
		{
			for(int coluna=0;coluna<3;coluna++) 
			{
				System.out.println("Digite um valor para preencher a matriz: ");
				matriz[linha][coluna] = ler.nextInt();
			}
		}
		System.out.println("\nA matriz sua matriz é: \n");
			for(int linha=0;linha<3;linha++) 
			{
				for(int coluna=0;coluna<3;coluna++)
				{
					System.out.println(matriz[linha][coluna]+"\t");
				}
			}
	}
}
