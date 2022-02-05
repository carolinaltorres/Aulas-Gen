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
		System.out.println("\nOs conteúdos de Matemática e Suas Tecnologias do 3° ano são:"
				+ "\nAritmética:\r\n"
				+ "- Conjuntos Dos Números Complexos;"
				+ "- Módulo De Números Complexos;"
				+ "- Forma Trigonométrica Ou Polar De Z."
				+ "\nÁlgebra:\r\n"
				+ "- Função Polinomial;"
				+ "- Polinômios Iguais;"
				+ "- Raízes Complexas."
				+ "\nGeometria:\r\n"
				+ "- Plano Cartesiano;"
				+ "- Geometria Analítica;"
				+ "- Hipérbole;"
				+ "- Parábola."
				+ "\nProbabilidade e Estatística:\r\n"
				+ "- Tabelas E Gráficos Estatísticos;"
				+ "- Medidas De Tendência Central;"
				+ "- Medidas De Dispersão;"
				+ "- Noções de derivada.");
	}
	@Override
	public void linguagens(String materia)
	{
		System.out.println("\nOs conteúdos de Linguagens e Suas Tecnologias são: "
				+ "\nLíngua Portuguesa:\r\n"
				+ "- Estrutura das palavras;"
				+ "- Processos de formação das palavras;"
				+ "- Substantivo, Pronome, Verbos, Advérbio, Frase;"
				+ "- Termos essenciais da oração;"
				+ "- Concordância verbal;"
				+ "- Regra geral e casos especiais;"
				+ "- Regência e crase;"
				+ "- Conjunções coordenativas e subordinativas."
				+ "\nLiteratura:\r\n"
				+ "- Quinhentismo;"
				+ "- Barroco;"
				+ "- Arcadismo;"
				+ "- Romantismo;"
				+ "- Realismo no Brasil."
				+ "\nLíngua Inglesa:\r\n"
				+ "- Listening;"
				+ "- Oral Production;"
				+ "- Writing and listening relations;"
				+ "- Reading;"
				+ "- Writing.");
	}
	@Override
	public void cHumanas(String materia)
	{
		System.out.println("\nOs contéudos de Ciência Humanas são:"
				+ "\nGeografia:\r\n"
				+ "- Geografia como ciência do espaço;"
				+ "- Globalização do espaço geográfico;"
				+ "- Regionalização do espaço geográfico;"
				+ "- Fragmentação do espaço geográfico;"
				+ "- Questão ambiental."
				+ "\nHistória:\r\n"
				+ "- O Brasil na Primeira República;"
				+ "- A Primeira Guerra Mundial;"
				+ "- A Crise de 1929 e a ascensão dos Regimes Totalitários;"
				+ "- A Segunda Guerra Mundial;"
				+ "- A Era Vargas;"
				+ "- A Guerra Fria;"
				+ "- Processos emancipatórios na África e na Ásia;"
				+ "- Populismo na América Latina;"
				+ "- Ditaduras na América Latina;"
				+ "- O Fim do Socialismo Real;"
				+ "- Brasil, da Redemocratização aos dias atuais;"
				+ "- O mundo globalizado.");
	}
	@Override
	public void cNatureza(String materia)
	{
		System.out.println("\nOs contéudos de Ciência da Natureza são:"
				+ "\nBiologia:\r\n"
				+ "- Histologia e fisiologia;"
				+ "- Genética;"
				+ "- Evolução;"
				+ "- Biotecnologia e bioética;"
				+ "\nQuímica:\r\n"
				+ "- Cinética química;"
				+ "- Equilíbrio químico;"
				+ "- Eletroquímica;"
				+ "- Química Orgânica."
				+ "\nFísica:\r\n"
				+ "- Ondulatória;"
				+ "- Eletricidade;"
				+ "- Eletrostática;"
				+ "- Eletrodinâmica;"
				+ "- Eletromagnetismo;"
				+ "- Física Moderna.");
	}
	
}