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
			System.out.println("Você não está bebendo o conteúdo da garrafa pois ela está tampada.");
		else
			System.out.println("Você está bebendo o conteúdo da garrafa.");
	}
	public void status()
	{
		System.out.println("A cor da garrafa é: "+this.cor);
		System.out.println("A quantidade do conteúdo está em: "+this.qtade);
		System.out.println("Está tampada? "+this.tampada);
	}
		
}
