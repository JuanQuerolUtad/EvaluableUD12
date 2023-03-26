package coche_vehiculojuanquerol;

public class Coche extends Vehiculo{
	private int combustible;

	public Coche(int ruedas, int velocidad, int combustible) {
		super(ruedas, velocidad);
		this.combustible = combustible;
	}

	public Coche() {
		this(0,0,0);
	}
	public void repostar(int mas) {
		this.combustible= this.combustible+mas;
	}
	public void consumir(int menos) {
		this.combustible= this.combustible-menos;
	}

	public int getCombustible() {
		return combustible;
	}
	
}
