package repeticao;

import java.util.Scanner;

public class Ex2 {
	public static void main (String arg[]) {
		Scanner ler = new Scanner (System.in);
		
		int impar=0,par=0,x,n;
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Digite aqui um n�mero: ");
			n = ler.nextInt();
			
			if (n%2==0)
			{
				par++;
			}
			else 
			{
				impar++;
			}
		}
		System.out.println("S�o: "+par+" n�meros pares e "+impar+ " n�meros impares." );
	}

}