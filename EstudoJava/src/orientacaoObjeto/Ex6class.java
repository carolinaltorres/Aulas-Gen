package orientacaoObjeto;

public class Ex6class {
	//Atributos de conta bancária
	String nome;
	String nconta;
	int dinheiro;
	
	//Métodos
	public void extrato()
	{
		System.out.println("Sua saldo é de: R$"+this.dinheiro);
	}
	public void emprestimo()
	{
		System.out.println("Empréstimo de até: R$"+this.dinheiro*2);
	}
	public void recarga()
	{
		System.out.println("Recarga de: 15,30,40 e 50 reais.");
	}

}
