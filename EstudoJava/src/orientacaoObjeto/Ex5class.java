package orientacaoObjeto;

public class Ex5class {
	//Atributos patinete
	
	int rodas;
	String cor;
	boolean quebrado;
	
	//M�todos
	
	public void quebrado()
	{
		if(quebrado==true)
			System.out.println("Voc� n�o pode andar de patinete pois ele est� quebrado.");
		else
			System.out.println("Voc� pode andar de patinete.");
	}
	public void manobra()
	{
		if(quebrado==true)
			System.out.println("Voc� n�o pode manobrar pois o patinete est� quebrado.");
		else
			System.out.println("Voc� pode fazer manobras com o patinete.");
	}

}
