package estudoJava;

import java.util.Scanner;

public class Ex2 {
	public static void main (String arg[])
	{
		int anos,meses,dias,valor;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite aqui sua idade em dias: ");
		valor = ler.nextInt();
		
		anos= valor/365;
		meses= valor%365/30;
		dias= valor/365%12;
		
		System.out.println("Sua idade é de: " +anos+ " ano(s) " +meses+ " mes(es) e " +dias+ " dia(s).");		
		
	}

}
