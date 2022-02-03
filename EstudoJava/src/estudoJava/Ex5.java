package estudoJava;

import java.util.Scanner;

public class Ex5 {
	public static void main (String arg[])
	{
		int not1,not2,not3,P1=2,P2=3,P3=5,media,result;
		Scanner ler = new Scanner( System.in );
		System.out.println("Calcule aqui a nota dos alunos");
		
		System.out.println("Insira aqui a nota com peso 2: ");
		not1 = ler.nextInt();
		
		System.out.println("Insira aqui a nota com peso 3: ");
		not2 = ler.nextInt();
		
		System.out.println("Insira aqui a nota com peso 5: ");
		not3 = ler.nextInt();
		
		media= (not1*P1)+(not2*P2)+(not3*P3);
		result= media/10;
		
		System.out.println("A nota final do aluno foi: " +result);
			
		
	}

}
