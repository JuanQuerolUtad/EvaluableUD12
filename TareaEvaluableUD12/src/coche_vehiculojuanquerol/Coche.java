package coche_vehiculojuanquerol;

public class Coche extends Vehiculo{
	private int combustible;
	//constructor con parametros
	public Coche(int ruedas, int velocidad, int combustible) {
		super(ruedas, velocidad);
		this.combustible = combustible;
	}
	//constructor sin parametros
	public Coche() {
		this(0,0,0);
	}
	//repostar el combustible
	public void repostar(int mas) {
		this.combustible= this.combustible+mas;
	}
	//combustible consimido
	public void consumir(int menos) {
		this.combustible= this.combustible-menos;
	}

	public int getCombustible() {
		return combustible;
	}
	
}
