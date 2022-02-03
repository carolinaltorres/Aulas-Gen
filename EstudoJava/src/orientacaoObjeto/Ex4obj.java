package orientacaoObjeto;

public class Ex4obj {
	
	public static void main (String[]args) 
	{ 
		Ex4class funcionario = new Ex4class();
		{
			String nome,cracha;
			
			funcionario.cracha="34424";
			funcionario.nome="Paulo Gustavo";
			funcionario.trabalhando=true;
			funcionario.doente=false;
			
			System.out.println("Funcionário: "+funcionario.nome+" n° "+funcionario.cracha);
			funcionario.trabalhando();
			funcionario.doente();
		}
			
	}

}
