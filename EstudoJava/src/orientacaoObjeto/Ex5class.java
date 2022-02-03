package orientacaoObjeto;

public class Ex5class {
	//Atributos patinete
	
	int rodas;
	String cor;
	boolean quebrado;
	
	//Métodos
	
	public void quebrado()
	{
		if(quebrado==true)
			System.out.println("Você não pode andar de patinete pois ele está quebrado.");
		else
			System.out.println("Você pode andar de patinete.");
	}
	public void manobra()
	{
		if(quebrado==true)
			System.out.println("Você não pode manobrar pois o patinete está quebrado.");
		else
			System.out.println("Você pode fazer manobras com o patinete.");
	}

}
