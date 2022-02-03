package estudoJava;

import java.util.Scanner;

public class Ex6 {
	public static void main (String a[])
	{
		Scanner ler = new Scanner (System.in);
		double x1,x2,y1,y2,dist,p1,p2;
		
		System.out.println("Digite x e depois y do ponto inicial: ");
		x1 = ler.nextDouble();
		y1 = ler.nextDouble();
		
		System.out.println("Digite x e depois y do ponto final: ");
		x2 = ler.nextDouble();
		y2 = ler.nextDouble();
		

        p1=Math.pow((x2-x1), 2);

        p2=Math.pow((y2-y1), 2);

        dist =Math.sqrt((p1+p2));
        
        System.out.println("A distância entre os pontos é de: "+dist);
		
	}

}
