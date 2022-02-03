package heranca;

public class Final {
	public static void main (String[]args) {
		
		Exercicio1 cachorro = new Ex1Cachorro("Doguinho","9 anos",true,"Corre");
		Exercicio1 cavalo= new Ex1Cavalo("Horse","10","Corre",true);
		Exercicio1 preguica= new Ex1Preguica("Fofinha","5",true,"Sobe arvore");
		
	
		cachorro.status();
		System.out.println("\n");
		cavalo.status();
		System.out.println("\n");
		preguica.status();
	
	}
}
