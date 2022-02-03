package orientacaoObjeto;

public class Ex7class {
	//Atributos paciente
	
	String nome, doenca;
	int peso, idade;
	
	//Métodos
	public void pesagem()
	{
		System.out.println("O paciente apresenta o peso de: "+this.peso);
	}
	public void classIdade(int id)
	{
		this.idade=id;
		if(this.idade==0)
				System.out.println("Recém nascido.");
		else if(this.idade >= 1 && this.idade<10)
			System.out.println("Criança");
		else if(this.idade >= 10 && this.idade<13)
			System.out.println("Pré-Adolescente");
		else if(this.idade >=13 && this.idade<16)
			System.out.println("Adolescente");
		else if(this.idade >=16 && this.idade <55)
			System.out.println("Adulto");
		else 
			System.out.println("Idoso");
	}
	public void status()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Doença: "+this.doenca);
		System.out.println("Peso: "+this.peso);
	}

}
