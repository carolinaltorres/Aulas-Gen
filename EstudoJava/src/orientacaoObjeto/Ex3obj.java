package orientacaoObjeto;

import java.util.Scanner;

public class Ex3obj {
	
	public static void main (String []args)
	{
		Scanner ler = new Scanner(System.in);
		Ex3class eletronico = new Ex3class();
		String tipo;
		
		System.out.println("Digite aqui o tipo do seu aparelho: ");
		tipo = ler.next();
		eletronico.tipo=tipo;
		eletronico.liga=true;
		eletronico.funciona=true;
		
		System.out.println("O tipo de aparelho é: "+tipo);
		eletronico.liga();
		eletronico.funciona();
		
	}

}
