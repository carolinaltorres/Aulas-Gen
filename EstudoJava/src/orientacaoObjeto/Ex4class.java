package orientacaoObjeto;

public class Ex4class {
	//Atributos funcionário
	
	String nome;
	String cracha;
	boolean doente;
	boolean trabalhando;
	
	//Métodos
	
	public void trabalhando()
	{
		if(trabalhando==true)
			System.out.println("O funcinário está trabalhando: ");
		else
			System.out.println("O funcionário não está trabalhando: ");
	}
	public void doente()
	{
		if(doente==true)
			System.out.println("O funcionário está doente.");
		else
			System.out.println("O funcionário está saudável.");
	}	

}
