package heranca;

public class Exercicio1 {
	//Animal
		private String nome;
		private String idade;
		private boolean som;
		
		public Exercicio1 (String nome, String idade,boolean som)
		{
			this.nome = nome;
			this.idade = idade;
			this.som = true;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getIdade() {
			return idade;
		}

		public void setIdade(String idade) {
			this.idade = idade;
		}

		public boolean isSom() {
			return som;
		}

		public void setSom(boolean som) {
			this.som = som;
		}
		public void status()
		{
			System.out.println("O nome do animal é: "+this.nome);
			System.out.println("A idade do animal é: "+this.idade);
			System.out.println("O animal emite som? "+this.som);
		}

}
