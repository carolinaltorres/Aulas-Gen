package estudoJava;

import java.util.Scanner;

public class Ex3 {
	public static void main( String args[])
	{
		Scanner ler = new Scanner (System.in);
		int horas,minutos,segundos,resp;
		
		System.out.println("M�quina de contabilizar quanto tempo durar� seu evento");
		
		System.out.println("Digite aqui quantos segundos seu evento durar�: ");
		resp = ler.nextInt();
		
       horas = resp/3600;
       minutos = resp%3600/60;
       segundos = resp%60;
       
		
        System.out.println("A dura��o do evento ser� de: " +horas+ " hora(s) " +minutos+ " minuto(s) e " +segundos+ " segundo(s).");
		
	}

}
