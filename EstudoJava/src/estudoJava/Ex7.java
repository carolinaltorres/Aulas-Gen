package estudoJava;

import java.util.Scanner;

public class Ex7 {
	public static void main (String arg[])
	{
		int a,b,c,d,e,f,x,y;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Resolução de sistema linear do tipo ax+by=c e dx+ey=f");
		System.out.println("Digite aqui um valor para a: ");
		a = ler.nextInt();
		System.out.println("Digite aqui um valor para b: ");
		b = ler.nextInt();
		System.out.println("Digite aqui um valor para c: ");
		c = ler.nextInt();
		System.out.println("Digite aqui um valor para d: ");
		d = ler.nextInt();
		System.out.println("Digite aqui um valor para e: ");
		e = ler.nextInt();
		System.out.println("Digite aqui um valor para f: ");
		f = ler.nextInt();
		
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.println("O valor de x é: " +x+ " e de y é:" +y);
	}

}
