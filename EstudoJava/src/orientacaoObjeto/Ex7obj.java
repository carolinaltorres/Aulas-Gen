package orientacaoObjeto;

import java.util.Scanner;

public class Ex7obj {
	public static void main (String[]args) {
		Ex7class paciente = new Ex7class();
		Scanner ler = new Scanner(System.in);
		
		int idade; 
		System.out.println("Nome do paciente: ");
		paciente.nome = ler.next();
		
		System.out.println("Doença do paciente: ");
		paciente.doenca = ler.next();
		
		System.out.println("Idade do paciente: ");
		idade = ler.nextInt();
				
		System.out.println("Peso: ");
		paciente.peso = ler.nextInt();
		
		paciente.classIdade(idade);
		paciente.status();
	}

}
