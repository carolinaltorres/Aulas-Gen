package Escola;

public class Ano2 extends MateriasFixas{

	//ATRIBUTO
	private int carga;
	
	
	//POLIMORFISMO SOBRECARGA
	public void cargaH(int x)
	{
		this.carga=x;
	}
	public void cargaH(int x, int y)
	{
		this.carga=x/y;
	}

	//GETTERS e SETTERS
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	//METODOS - POLIMORFISMO SOBREESCRITO
	@Override
	public void matematica(String materia)
	{
		System.out.println("\nOs conte�dos de Matem�tica e Suas Tecnologias do 2� ano s�o:\n"
				+ "\r\nMatem�tica:\n"
				+ "Algebra\n"
				+ "Geometria\n"
				+ "Probabilidade e Estat�stica\n");
	}
	@Override
	public void linguagens(String materia)
	{
		System.out.println("\nOs conte�dos de Linguagens e Suas Tecnologias do 2� ano s�o:\n"
				+ "\r\nPortugu�s:\n"
				+ "Escrita e Oralidade\n"
				+ "Concord�ncia Nominal\n"
				+ "Ora��es Coordenadas\n"
				+ "Ora��es Adverbiais\n"
				+ "\r\nIngl�s:\n"
				+ "Frases nas formas afirmativa, negativa e interrogativa\n"
				+ "Formas longa e contra�da dos verbos\n"
				+ "Adjetivos e adv�rbios\n"
				+ "Graus de formalidade\n"
				+ "\r\nLiteratura:\n"
				+ "O contexto art�stico no �nicio do s�culo XX\n"
				+ "Modernismo no Brasil - Gera��o de 22: Fase de destrui��o\n"
				+ "Neovanguardas: hibridismo e intermidialidade\n"
				+ "Prosa contempor�nea no Brasil\n");
	}
	@Override
	public void cHumanas(String materia)
	{
		System.out.println("\nOs conte�dos de Ci�ncias Humanas do 2� ano s�o:\n"
				
				+ "\r\nHist�ria:\n"
				+ "Mercantilismo e Coloniza��o\n"
				+ "Antigo Regime e Iluminismo\n"
				+ "Independ�ncia do Brasil\n"
				+ "Primeiro Reinado\n"
				+ "Segundo Reinado\n"
				
				+ "\r\nGeografia:\n"
				+ "O espa�o industrial\n"
				+ "O espa�o urbano\n"
				+ "O espa�o agr�rio\n"
				+ "Din�mica Populacional\n"
				
				+ "\r\nFilosofia:\n"
				+ "Livre-arb�trio\n"
				+ "Meta�tica\n"
				+ "�tica\n"
				+ "�tica pr�tica\n"
				+ "Filosofia da Mente\n");
	}
	@Override
	public void cNatureza(String materia)
	{
		System.out.println("\nOs conte�dos de Ci�ncias da Natureza e suas Tecnologias s�o:\n "
				  + "\nBiologia:\r\n"
				  + "- Origem da Vida, Citologia, Reprodu��o;\r\n"
			      + "- Embriologia, Histologia, Seres Vivos;\r\n"
				  + "- Gen�tica, Evolu��o e Ecologia.\r\n"
				  + "\nQu�mica:\r\n"
			      + "- Qu�mica Geral, F�sico-Qu�mica;\r\n"
			      + "- Qu�mica Nuclear e Qu�mica Org�nica.\r\n"
			      + "\nF�sica:\r\n"
			      + "- Mec�nica(teorias que explicam o movimento dos corpos);\r\n"
			      + "- Termologia(conceitos relacionados � temperatura e calor).\r\n");
	}
	
	
}
