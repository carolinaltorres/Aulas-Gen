package orientacaoObjeto;

public class Ex3class {
	//Atributos produto eletronico
	
	String tipo;
	int voltagem;
	boolean funciona;
	boolean liga;
	
	//M�todos
	
	public void funciona()
	{
		if(funciona==true)
			System.out.println("O produto est� funcionando.");
		else
			System.out.println("O produto n�o est� funcionando.");
	}
	public void liga()
	{
		if(liga==true)
			System.out.println("O produto est� ligando.");
		else 
			System.out.println("O produto n�o est� ligando.");
	}
	

}
