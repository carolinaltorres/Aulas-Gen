package orientacaoObjeto;

public class Ex1class {
	//Atributos
	
	String nome;
	String CPF;
	String RG;
	String nascimento;
	
	//Métodos
	public void nome()
	{
		System.out.println("Nome completo: "+this.nome);
	}
	
	public void cpf()
	{
		if(this.CPF.length()==14)
			System.out.println("CPF: "+this.CPF);
		else
			System.out.println("Cpf digitado incorretamente.");
	}
	public void rg()
	{
		if(this.RG.length()==12)
			System.out.println("RG: "+this.RG);
		else
			System.out.println("RG digitado incorretamente.");
	}
	public void nascimento()
	{
		System.out.println("Data de nascimento: "+this.nascimento);
	}

}
