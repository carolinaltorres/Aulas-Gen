package orientacaoObjeto;

public class Ex4class {
	//Atributos funcion�rio
	
	String nome;
	String cracha;
	boolean doente;
	boolean trabalhando;
	
	//M�todos
	
	public void trabalhando()
	{
		if(trabalhando==true)
			System.out.println("O funcin�rio est� trabalhando: ");
		else
			System.out.println("O funcion�rio n�o est� trabalhando: ");
	}
	public void doente()
	{
		if(doente==true)
			System.out.println("O funcion�rio est� doente.");
		else
			System.out.println("O funcion�rio est� saud�vel.");
	}	

}
