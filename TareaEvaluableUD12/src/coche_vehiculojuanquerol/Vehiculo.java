package coche_vehiculojuanquerol;

public class Vehiculo {
	private int ruedas;
	private int velocidad;
	public Vehiculo(int ruedas, int velocidad) {
		this.ruedas = ruedas;
		this.velocidad = velocidad;
	}
	public Vehiculo() {
		this(0,0);
	}
	public void acerelar(int mas) {
		this.velocidad= this.velocidad+mas;
	}
	public void frenar(int menos) {
		this.velocidad= this.velocidad-menos;
	}
	public int getRuedas() {
		return ruedas;
	}
	public int getVelocidad() {
		return velocidad;
	}
	
	
	
}
