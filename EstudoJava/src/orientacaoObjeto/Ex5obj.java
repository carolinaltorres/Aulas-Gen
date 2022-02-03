package orientacaoObjeto;

import java.util.Scanner;

public class Ex5obj {

	public static void main(String[] args) {
		Ex5class patinete = new Ex5class();
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite aqui a cor do seu patinete: ");
		patinete.cor=ler.next();
		System.out.println("Digite aqui o tamanho das rodas do seu patinete: ");
		patinete.rodas= ler.nextInt();
		System.out.println("O patinete está quebrado? Responda com true ou false:");
		patinete.quebrado= ler.nextBoolean();
		
		System.out.println("O seu patinete é de cor: "+patinete.cor+" com rodas tamanho: "+patinete.rodas);
		patinete.quebrado();
		patinete.manobra();
	}

}
