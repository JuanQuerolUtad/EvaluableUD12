package asalariadoJuanQuerol;

public class EmpleadoDistribucion extends Asalariado{
	private String zona;

	public EmpleadoDistribucion(String nombre, long dni, int numVacaciones, String zona) {
		super(nombre, dni, numVacaciones);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	// creo un to string que muestre todo los atributos
	@Override
	public String toString() {
		return "EmpleadoDistribucion [zona=" + zona + ", nombre=" + nombre + ", dni=" + dni + ", numVacaciones="
				+ numVacaciones + "]";
	}

	
	
}
