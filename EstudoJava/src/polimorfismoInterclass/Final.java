package polimorfismoInterclass;

public class Final {
	public static void main (String[]args)
	{
		Animal cachorro = new Cachorro("Doguinho","9 anos",true, "Corre");
		Animal cavalo = new Cavalo("Horse","10","Corre", true);
		Animal preguica = new Preguica("Fofinha","5",true, "Sobe em arvore");
		
		cachorro.status();
		System.out.println("\n");
		cavalo.status();
		System.out.println("\n");
		preguica.status();
	}

}
