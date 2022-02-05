package Escola;

public class Ano1 extends MateriasFixas {
	
	//ATRIBUTO
	private int carga;
	
	//METODOS - POLIMORFISMO SOBRECARGA
	public void cargaH(int x)
	{
		this.carga=x;
	}
	public void cargaH(int x ,int y)
	{
		this.carga=x/y;
	}
	
	//GETTERS e SETTERS
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}

}
