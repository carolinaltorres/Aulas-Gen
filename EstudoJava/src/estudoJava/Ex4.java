package estudoJava;

import java.util.Scanner;

public class Ex4 {
	public static void main (String arg[])
	{
		Scanner ler = new Scanner (System.in);
		int A,B,C,D,AB,CD,R,S;
		
		System.out.println("Calculadora de D = (R+S)/2 onde R = (A+B)^2 e S= (B+C)^2");
		System.out.println("Digite aqui o valor que você deseja atribuir para A: ");
		A = ler.nextInt();
		
		System.out.println("Digite aqui o valor que você deseja atribuir para B: ");
		B = ler.nextInt();
		
		System.out.println("Digite aqui o valor que você deseja atribuir para C: ");
		C = ler.nextInt();
		
		System.out.println("Digite aqui o valor que você deseja atribuir para D: ");
		D = ler.nextInt();
		
		AB = (A+B);
		CD = (C+D);
		R = (int) Math.pow(AB, 2);
		S = (int) Math.pow(CD, 2);
		D = (R+S)/2;
		
		
		System.out.println("O resultado é: " +D);
		
		
				
				
	}

}
