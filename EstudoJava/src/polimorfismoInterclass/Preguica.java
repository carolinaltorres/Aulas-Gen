package polimorfismoInterclass;

public class Preguica extends Animal {
private String corre;
private String sobearv;
	
	public Preguica(String nome,String idade,boolean som,String corre)
	{
		super(nome,idade,som,corre);
		this.corre= corre;
	}
	public String getCorre() 
	{
		return corre;
	}
	@Override
	public void setCorre(String sobearv)
	{
		System.out.println("O animal sobe arvores. "+sobearv);
	}
	public void status()
	{
		System.out.println("O nome do animal é: "+this.getNome());
		System.out.println("A idade do animal é: "+this.getIdade());
		System.out.println("O animal emite som? "+this.isSom());
		System.out.println("O animal: "+this.getCorre());
	}

}
