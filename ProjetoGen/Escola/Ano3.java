package Escola;

public class Ano3 extends MateriasFixas {

	//ATRIBUTO
	private int carga;
	
	//METODOS
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
		System.out.println("\nOs conte�dos de Matem�tica e Suas Tecnologias do 3� ano s�o:"
				+ "\nAritm�tica:\r\n"
				+ "- Conjuntos Dos N�meros Complexos;"
				+ "- M�dulo De N�meros Complexos;"
				+ "- Forma Trigonom�trica Ou Polar De Z."
				+ "\n�lgebra:\r\n"
				+ "- Fun��o Polinomial;"
				+ "- Polin�mios Iguais;"
				+ "- Ra�zes Complexas."
				+ "\nGeometria:\r\n"
				+ "- Plano Cartesiano;"
				+ "- Geometria Anal�tica;"
				+ "- Hip�rbole;"
				+ "- Par�bola."
				+ "\nProbabilidade e Estat�stica:\r\n"
				+ "- Tabelas E Gr�ficos Estat�sticos;"
				+ "- Medidas De Tend�ncia Central;"
				+ "- Medidas De Dispers�o;"
				+ "- No��es de derivada.");
	}
	@Override
	public void linguagens(String materia)
	{
		System.out.println("\nOs conte�dos de Linguagens e Suas Tecnologias s�o: "
				+ "\nL�ngua Portuguesa:\r\n"
				+ "- Estrutura das palavras;"
				+ "- Processos de forma��o das palavras;"
				+ "- Substantivo, Pronome, Verbos, Adv�rbio, Frase;"
				+ "- Termos essenciais da ora��o;"
				+ "- Concord�ncia verbal;"
				+ "- Regra geral e casos especiais;"
				+ "- Reg�ncia e crase;"
				+ "- Conjun��es coordenativas e subordinativas."
				+ "\nLiteratura:\r\n"
				+ "- Quinhentismo;"
				+ "- Barroco;"
				+ "- Arcadismo;"
				+ "- Romantismo;"
				+ "- Realismo no Brasil."
				+ "\nL�ngua Inglesa:\r\n"
				+ "- Listening;"
				+ "- Oral Production;"
				+ "- Writing and listening relations;"
				+ "- Reading;"
				+ "- Writing.");
	}
	@Override
	public void cHumanas(String materia)
	{
		System.out.println("\nOs cont�udos de Ci�ncia Humanas s�o:"
				+ "\nGeografia:\r\n"
				+ "- Geografia como ci�ncia do espa�o;"
				+ "- Globaliza��o do espa�o geogr�fico;"
				+ "- Regionaliza��o do espa�o geogr�fico;"
				+ "- Fragmenta��o do espa�o geogr�fico;"
				+ "- Quest�o ambiental."
				+ "\nHist�ria:\r\n"
				+ "- O Brasil na Primeira Rep�blica;"
				+ "- A Primeira Guerra Mundial;"
				+ "- A Crise de 1929 e a ascens�o dos Regimes Totalit�rios;"
				+ "- A Segunda Guerra Mundial;"
				+ "- A Era Vargas;"
				+ "- A Guerra Fria;"
				+ "- Processos emancipat�rios na �frica e na �sia;"
				+ "- Populismo na Am�rica Latina;"
				+ "- Ditaduras na Am�rica Latina;"
				+ "- O Fim do Socialismo Real;"
				+ "- Brasil, da Redemocratiza��o aos dias atuais;"
				+ "- O mundo globalizado.");
	}
	@Override
	public void cNatureza(String materia)
	{
		System.out.println("\nOs cont�udos de Ci�ncia da Natureza s�o:"
				+ "\nBiologia:\r\n"
				+ "- Histologia e fisiologia;"
				+ "- Gen�tica;"
				+ "- Evolu��o;"
				+ "- Biotecnologia e bio�tica;"
				+ "\nQu�mica:\r\n"
				+ "- Cin�tica qu�mica;"
				+ "- Equil�brio qu�mico;"
				+ "- Eletroqu�mica;"
				+ "- Qu�mica Org�nica."
				+ "\nF�sica:\r\n"
				+ "- Ondulat�ria;"
				+ "- Eletricidade;"
				+ "- Eletrost�tica;"
				+ "- Eletrodin�mica;"
				+ "- Eletromagnetismo;"
				+ "- F�sica Moderna.");
	}
	
}