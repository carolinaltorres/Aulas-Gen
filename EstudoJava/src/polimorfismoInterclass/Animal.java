package polimorfismoInterclass;

public class Animal {
	//Animal
		private String nome;
		private String idade;
		private boolean som;
		private String corre;
		
		public Animal (String nome, String idade,boolean som, String corre)
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
			System.out.println("O Animal corre? "+this.corre);
		}

		public String getCorre() {
			return corre;
		}

		public void setCorre(String corre) {
			this.corre = corre;
		}

}
