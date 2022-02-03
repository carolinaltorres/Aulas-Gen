package polimorfismoInterclass;

public class Cachorro extends Animal {
	private String corre;

	public Cachorro(String nome,String idade,boolean som,String corre)
	{
		super(nome,idade,som,corre);
		this.corre= corre;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	public void status()
	{
		System.out.println("O nome do animal é: "+this.getNome());
		System.out.println("A idade do animal é: "+this.getIdade());
		System.out.println("O animal emite som? "+this.isSom());
		System.out.println("O animal: "+this.corre);
	}

}