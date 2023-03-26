package coche_vehiculojuanquerol;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche damcar = new Coche(4, 0, 60);
		damcar.acerelar(100);
		damcar.consumir(20);
		damcar.frenar(60);
		System.out.print("gasolina: " + damcar.getCombustible() + " litros");
		damcar.acerelar(90);
		damcar.consumir(10);
		damcar.frenar(damcar.getVelocidad());
		damcar.acerelar(130);
		System.out.print("gasolina: " + damcar.getCombustible() + " litros");
	}

}
