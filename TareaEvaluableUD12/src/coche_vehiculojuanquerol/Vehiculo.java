package coche_vehiculojuanquerol;

public class Vehiculo {
	private int ruedas;
	private int velocidad;
	//constructor con parametros
	public Vehiculo(int ruedas, int velocidad) {
		this.ruedas = ruedas;
		this.velocidad = velocidad;
	}
	//constructor sin parametros
	public Vehiculo() {
		this(0,0);
	}
	public void acerelar(int mas) {
		this.velocidad= this.velocidad+mas;
	}
	public void frenar(int menos) {
		this.velocidad= this.velocidad-menos;
	}
	//getters
	public int getRuedas() {
		return ruedas;
	}
	public int getVelocidad() {
		return velocidad;
	}
	
	
	
}
