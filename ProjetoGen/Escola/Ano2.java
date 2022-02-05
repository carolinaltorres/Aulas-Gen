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
		System.out.println("\nOs conteúdos de Matemática e Suas Tecnologias do 2° ano são:\n"
				+ "\r\nMatemática:\n"
				+ "Algebra\n"
				+ "Geometria\n"
				+ "Probabilidade e Estatística\n");
	}
	@Override
	public void linguagens(String materia)
	{
		System.out.println("\nOs conteúdos de Linguagens e Suas Tecnologias do 2° ano são:\n"
				+ "\r\nPortuguês:\n"
				+ "Escrita e Oralidade\n"
				+ "Concordância Nominal\n"
				+ "Orações Coordenadas\n"
				+ "Orações Adverbiais\n"
				+ "\r\nInglês:\n"
				+ "Frases nas formas afirmativa, negativa e interrogativa\n"
				+ "Formas longa e contraída dos verbos\n"
				+ "Adjetivos e advérbios\n"
				+ "Graus de formalidade\n"
				+ "\r\nLiteratura:\n"
				+ "O contexto artístico no ínicio do século XX\n"
				+ "Modernismo no Brasil - Geração de 22: Fase de destruição\n"
				+ "Neovanguardas: hibridismo e intermidialidade\n"
				+ "Prosa contemporânea no Brasil\n");
	}
	@Override
	public void cHumanas(String materia)
	{
		System.out.println("\nOs conteúdos de Ciências Humanas do 2° ano são:\n"
				
				+ "\r\nHistória:\n"
				+ "Mercantilismo e Colonização\n"
				+ "Antigo Regime e Iluminismo\n"
				+ "Independência do Brasil\n"
				+ "Primeiro Reinado\n"
				+ "Segundo Reinado\n"
				
				+ "\r\nGeografia:\n"
				+ "O espaço industrial\n"
				+ "O espaço urbano\n"
				+ "O espaço agrário\n"
				+ "Dinâmica Populacional\n"
				
				+ "\r\nFilosofia:\n"
				+ "Livre-arbítrio\n"
				+ "Metaética\n"
				+ "Ética\n"
				+ "Ética prática\n"
				+ "Filosofia da Mente\n");
	}
	@Override
	public void cNatureza(String materia)
	{
		System.out.println("\nOs conteúdos de Ciências da Natureza e suas Tecnologias são:\n "
				  + "\nBiologia:\r\n"
				  + "- Origem da Vida, Citologia, Reprodução;\r\n"
			      + "- Embriologia, Histologia, Seres Vivos;\r\n"
				  + "- Genética, Evolução e Ecologia.\r\n"
				  + "\nQuímica:\r\n"
			      + "- Química Geral, Físico-Química;\r\n"
			      + "- Química Nuclear e Química Orgânica.\r\n"
			      + "\nFísica:\r\n"
			      + "- Mecânica(teorias que explicam o movimento dos corpos);\r\n"
			      + "- Termologia(conceitos relacionados à temperatura e calor).\r\n");
	}
	
	
}
