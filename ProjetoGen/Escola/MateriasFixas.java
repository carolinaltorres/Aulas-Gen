package Escola;

public abstract class MateriasFixas {

	//ATRIBUTOS
	private String linguagens;
	private String cNatureza;
	private String cHumanas;
	private String matematica;
	
	//METODOS
	public void matematica(String materia)
	{
		this.matematica=matematica;
		System.out.println("\nOs conte�dos de Matem�tica e Suas Tecnologias do 1� ano s�o:\n"
				+"\nN�meros: conhecendo os n�meros"
				+"\nN�meros: opera��es"
				+"\n�lgebra"
				+"\nGeometria"
				+"\nGrandezas e medidas"
				+"\nProbabilidade e estat�stica");
	}
	public void linguagens(String materia)
	{
		this.linguagens=linguagens;
		System.out.println("\nOs conte�dos de Linguagens e Suas Tecnologias do 1� ano s�o:\n"
			  + "\nArte:\n"
			  + "- Conceitos e t�cnicas de diversos estilos art�sticos.\r\n"
			  + "\nEduca��o F�sica:\r\n"
		      + "- Pr�ticas corporais e autonomia;;\r\n"
		      + "- Esportes.\r\n"
		      + "\nLingua Portuguesa:\r\n"
		      + "- Ortografia, verbos e as normas da L�ngua Portuguesa;\r\n"
		      + "- Teorias de leitura e escrita focadas na produ��o dos mais diversos g�neros textuais.\r\n"
		      + "- As origens da literatura mundial e brasileira.\r\n"
			  + "\nLingua Inglesa:\r\n"
			  + "- Gram�tica da L�ngua Inglesa.\r\n");
	}
	public void cHumanas(String materia)
	{
		this.cHumanas=cHumanas;
		System.out.println("\nOs conte�dos de Ci�ncias Humanas e Sociais Aplicadas do 1� s�o:\n"
			  + "\nFilosofia:\r\n"
			  + "- Ess�ncia da humanidade e a realidade em que vivemos;\r\n"
		      + "- Reflex�es sobre fil�sofos e pensadores.\r\n"
			  + "\nGeografia:\r\n"
		      + "- Clima, relevo e vegeta��o \r\n"
		      + "- Geografia Humana, Brasil e mundo.\r\n"
		      + "\nHist�ria:\r\n"
		      + "- Hist�ria da humanidade;\r\n"
		      + "- Hist�ria do Brasil;\r\n"
		      + "- Hist�ria Geral.\r\n"
		      + "\nSociologia:\r\n"
		      + "- Como a humanidade se organiza em sociedade;\r\n"
		      + "- Quais s�o seus h�bitos;\r\n"
		      + "- Costumes e como se relaciona entre si.\r\n");
	}
	public void cNatureza(String materia)
	{
		this.cNatureza=cNatureza;
		System.out.println("\nOs conte�dos de Ci�ncias da Natureza e suas Tecnologias do 1� s�o:\n"
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
	
	//GETTERS e SETTERS
	public String getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(String linguagens) {
		this.linguagens = linguagens;
	}
	public String getcNatureza() {
		return cNatureza;
	}
	public void setcNatureza(String cNatureza) {
		this.cNatureza = cNatureza;
	}
	public String getcHumanas() {
		return cHumanas;
	}
	public void setcHumanas(String cHumanas) {
		this.cHumanas = cHumanas;
	}
	public String getMatematica() {
		return matematica;
	}
	public void setMatematica(String matematica) {
		this.matematica = matematica;
	}
}