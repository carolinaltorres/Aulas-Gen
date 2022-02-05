package Escola;

import java.util.ArrayList;
import java.util.Scanner;

public class Consulta {

	public static void main(String[] args) {
		//SCANNER
		Scanner ler = new Scanner(System.in);
		
		//OBJETOS
		Ano1 ano1 = new Ano1();
		Ano2 ano2 = new Ano2();
		Ano3 ano3 = new Ano3();
		
		//VARIAVEIS
		int anoEscolar;
		int materia;
		int parar=0;
		int eletivas;
		
		try { 
		do {
			
			System.out.println("\n---REPROGRAMA EDUCA---\n");
			System.out.println("Qual o ano escolar está cursando?(Digite somente o número) ");
		
			anoEscolar=ler.nextInt();
			System.out.println("\n(1) Matemática e Suas Tecnologias"
					+ "\n(2) Linguagens e Suas Tecnologias\n"
					+ "(3) Ciências da Natureza\n"
					+ "(4) Ciências Humanas\n"
					+ "Digite o numero da área que você deseja ver:");
			materia=ler.nextInt();
			
			
			if(materia == 1 && anoEscolar == 1)
			{
				ano1.matematica("materia");
				ano1.setCarga(165);
				System.out.println("A carga horaria dessa área é de "+ ano1.getCarga()+" horas por ano");
			}
			else if(materia == 2 && anoEscolar == 1)
			{
				ano1.linguagens("materia");
				ano1.setCarga(165);
				System.out.println("A carga horaria dessa área é de "+ ano1.getCarga()+" horas por ano");
			
			}
			else if(materia == 3 && anoEscolar == 1)
			{
				ano1.cNatureza("materia");
				ano1.setCarga(165);
				System.out.println("A carga horaria dessa área é de "+ ano1.getCarga()+" horas por ano");
			
			}
			else if(materia == 4 && anoEscolar == 1)
			{
				ano1.cHumanas("materia");
				ano1.setCarga(165);
				System.out.println("A carga horaria dessa área é de "+ ano1.getCarga()+" horas por ano");
				
			}
			
			
			else if(materia == 1 && anoEscolar == 2)
			{
				ano2.matematica("materia");
				ano2.setCarga(127);
				System.out.println("A carga horaria dessa área é de: "+ ano2.getCarga()+" horas por ano");
				
			}
			else if(materia == 2 && anoEscolar == 2)
			{
				ano2.linguagens("materia");
				ano2.setCarga(127);
				System.out.println("A carga horaria dessa área é de: "+ ano2.getCarga()+" horas por ano");
			}
			else if(materia == 3 && anoEscolar == 2)
			{
				ano2.cNatureza("materia");
				ano2.setCarga(127);
				System.out.println("A carga horaria dessa área é de: "+ ano2.getCarga()+" horas por ano");
			}
			else if(materia == 4 && anoEscolar == 2)
			{
				ano2.cHumanas("materia");
				ano2.setCarga(127);
				System.out.println("A carga horaria dessa área é de: "+ ano2.getCarga()+" horas por ano");
			}
			
		
			else if(materia == 1 && anoEscolar == 3)
			{
				ano3.matematica("materia");
				ano3.setCarga(127);
				System.out.println("A carga horaria dessa área é de "+ ano3.getCarga()+" horas por ano");
			}
			else if(materia == 2 && anoEscolar == 3)
			{
				ano3.linguagens("materia");
				ano3.setCarga(127);
				System.out.println("A carga horaria dessa área é de "+ ano3.getCarga()+" horas por ano");
			}
			else if(materia == 3 && anoEscolar == 3)
			{
				ano3.cNatureza("materia");
				ano3.setCarga(127);
				System.out.println("A carga horaria dessa área é de "+ ano3.getCarga()+" horas por ano");
			}
			else if (materia == 4 && anoEscolar == 3)
			{
				ano3.cHumanas("materia");
				ano3.setCarga(127);
				System.out.println("A carga horaria dessa área é de "+ ano3.getCarga()+" horas por ano");
			}
			else
			{
				System.out.println("\nOPÇÃO INVALIDA!!!");
			}
			
			System.out.println("\nGostaria de ver alguma outra área? (1)Sim (2) Não");
			parar=ler.nextInt();
			
				}while(parar==1);
		
		
			System.out.println("\nDeseja ver as opções de materias eletivas? (1)sim (2) não");
			eletivas=ler.nextInt();
		    
			
			if(eletivas == 1)
			{
				ArrayList<String> arte = new ArrayList<>();
				ArrayList<String> historia = new ArrayList<>();
				ArrayList<String> portugues = new ArrayList<>();
				ArrayList<String> matematica= new ArrayList<>();
				ArrayList<String> tecnologia= new ArrayList<>();
				
				arte.add("ARTES");
				arte.add("Fotografia");
				arte.add("Ilustração");
				arte.add("Música");
				arte.add("Dança");
				
				historia.add("HISTORIA");
				historia.add("História da Arte");
				historia.add("Turismo");
				historia.add("Arquivologia");
				historia.add("Ciências Sociais");
				
				portugues.add("PORTUGUÊS");
				portugues.add("Biblioteconomia");
				portugues.add("Redação Criativa");
				portugues.add("Leitura Dinâmica");
				portugues.add("Redação Livre");
				
				matematica.add("MATEMÁTICA");
				matematica.add("Estatística Básica");
				matematica.add("Contabilidade ");
				matematica.add("Matemática Financeira");
				matematica.add("Cálculos Numéricos");
				
				tecnologia.add("TECNOLOGIA");
				tecnologia.add("Análise e Desenvolvimento de Sistemas");
				tecnologia.add("Redes de Computadores");
				tecnologia.add("Jogos Digitais");
				tecnologia.add("Sistemas Da Informacão"); 
				
				
				System.out.println("\n"+arte);
				System.out.println("\n"+historia);
				System.out.println("\n"+portugues);
				System.out.println("\n"+matematica);
				System.out.println("\n"+tecnologia);
				
				System.out.println("\n\nATENÇÃO: Você poderá escolher somente duas opção dessas apresentadas.");
				ano1.cargaH(400, 2);
				System.out.println("A carga horaria de cada uma dessas áreas é de :"+ano1.getCarga()+" horas\n");
				
				}
				else
				{
					System.out.println("\nFIM DO PROGRAMA");
				}

					
			System.out.println("\nRESUMO:\nO primeiro ano tem uma carga horaria total de 1100 horas anuais,"
								+"sendo 660 de materias fixas e média de 400 horas de materias eletivas\n ");
	
			System.out.println("\nO segundo e terceiro ano tem uma carga horaria total de 1000 horas anuais,"
					+"sendo 600 horas de matérias fixas 400 horas de matérias eletivas\\n ");
		
			
			System.out.println("\n\nFIM DO PROGRAMA");}catch (Exception erro) {
				System.out.println("OPÇÃO INVALIDA! REINICIE O PROGRAMA E DIGITE UM NUMERO CORRESPONDENTE.");
			}

			
			
			
			
		

	}

}
