package orientacaoObjeto;

public class Exemplo {
	
	String cor;
	int qtade;
	boolean tampada;
	
	public void tampar()
	{
		this.tampada=true;
	}
	public void destampar()
	{
		this.tampada=false;
	}
	public void escrever()
	{
		if(this.tampada==tampada)
			System.out.println("Voc� n�o est� bebendo o conte�do da garrafa pois ela est� tampada.");
		else
			System.out.println("Voc� est� bebendo o conte�do da garrafa.");
	}
	public void status()
	{
		System.out.println("A cor da garrafa �: "+this.cor);
		System.out.println("A quantidade do conte�do est� em: "+this.qtade);
		System.out.println("Est� tampada? "+this.tampada);
	}
		
}
