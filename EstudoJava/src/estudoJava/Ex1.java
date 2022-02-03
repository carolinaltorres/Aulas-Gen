package estudoJava;

import java.util.Scanner;

public class Ex1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int meses,dias,anos,idadedias;
		System.out.println("Digite sua idade em anos: ");
		anos = ler.nextInt();
		
		System.out.println("Digite a quantidade de meses: ");
		meses = ler.nextInt();
		
		System.out.println("Digite a quantidade de dias: ");
		dias = ler.nextInt();
		
		idadedias = (anos*365)+(meses*30)+(dias);
		
		System.out.println("Sua idade em dias é de: " +idadedias);
		
	}

	

}
