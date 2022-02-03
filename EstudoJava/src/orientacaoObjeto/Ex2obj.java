package orientacaoObjeto;

public class Ex2obj {
	
	public static void main (String []args)
	{
		Ex2class aviao = new Ex2class();
		
		aviao.modelo="Boeng44";
		aviao.capacidade=400;
		aviao.nmotores= 4;
		System.out.println(aviao.modelo+"\n"+aviao.capacidade+"\n"+aviao.nmotores);
		
		aviao.voar();
		aviao.pousar();
		aviao.manobrar();
	}

}
