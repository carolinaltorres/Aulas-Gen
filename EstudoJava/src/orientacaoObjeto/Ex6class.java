package orientacaoObjeto;

public class Ex6class {
	//Atributos de conta banc�ria
	String nome;
	String nconta;
	int dinheiro;
	
	//M�todos
	public void extrato()
	{
		System.out.println("Sua saldo � de: R$"+this.dinheiro);
	}
	public void emprestimo()
	{
		System.out.println("Empr�stimo de at�: R$"+this.dinheiro*2);
	}
	public void recarga()
	{
		System.out.println("Recarga de: 15,30,40 e 50 reais.");
	}

}
