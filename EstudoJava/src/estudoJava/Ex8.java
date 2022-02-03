package estudoJava;


import java.util.Scanner;

public class Ex8 {
	public static void main (String arg[])
	{
		Scanner ler = new Scanner (System.in);
		double custfab, custfinal;
		
		System.out.println("Digite aqui o valor de fábrica do carro: ");
		custfab = ler.nextDouble();
		
		custfinal = (custfab*0.28)+(custfab*0.45)+custfab;
		System.out.println("O custo final do carro é de: " +custfinal);
		
	}

}
