package orientacaoObjeto;

public class Ex6obj {
	public static void main(String []args) {
		Ex6class conta = new Ex6class();
		
		conta.nome="Vitor Santos";
		conta.nconta= "43543";
		conta.dinheiro= 12345;
		
		conta.extrato();
		conta.emprestimo();
		conta.recarga();
		
	}

}
