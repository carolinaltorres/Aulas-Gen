package orientacaoObjeto;

public class Ex1obj {
	
	public static void main(String arg[]) 
	{
		Ex1class cliente = new Ex1class();
		
		//Definindo atributos do meu cliente
		cliente.nome = "Bruno de Oliveira Santos";
		cliente.CPF = "299.188.123-45";
		cliente.RG = "12.345.678.9";
		cliente.nascimento = "10/01/2000";
		
		//Imprimindo os dados
		cliente.nome();
		cliente.cpf();
		cliente.rg();
		cliente.nascimento();
	}

}
