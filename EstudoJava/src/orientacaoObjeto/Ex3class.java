package orientacaoObjeto;

public class Ex3class {
	//Atributos produto eletronico
	
	String tipo;
	int voltagem;
	boolean funciona;
	boolean liga;
	
	//Métodos
	
	public void funciona()
	{
		if(funciona==true)
			System.out.println("O produto está funcionando.");
		else
			System.out.println("O produto não está funcionando.");
	}
	public void liga()
	{
		if(liga==true)
			System.out.println("O produto está ligando.");
		else 
			System.out.println("O produto não está ligando.");
	}
	

}
