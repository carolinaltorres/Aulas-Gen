package heranca;

public class Ex1Preguica extends Exercicio1 {
	private String sobearv;
	
	public Ex1Preguica(String nome,String idade,boolean som,String sobearv)
	{
		super(nome,idade,som);
		this.sobearv=sobearv;
	}

	public String getSobearv() {
		return sobearv;
	}

	public void setSobearv(String sobearv) {
		this.sobearv = sobearv;
	}
	public void status()
	{
		System.out.println("O nome do animal é: "+this.getNome());
		System.out.println("A idade do animal é: "+this.getIdade());
		System.out.println("O animal emite som? "+this.isSom());
		System.out.println("O animal: "+this.sobearv);
	}

}
