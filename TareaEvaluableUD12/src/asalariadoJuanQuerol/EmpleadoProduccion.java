package asalariadoJuanQuerol;

public class EmpleadoProduccion extends Asalariado {
	private String turno;
	public EmpleadoProduccion(String nombre, long dni, int numVacaciones, String turno) {
		super(nombre, dni, numVacaciones);
		this.turno=turno;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	// creo un to string que muestre todo los atributos
	@Override
	public String toString() {
		return "EmpleadoProduccion [turno=" + turno + ", nombre=" + nombre + ", dni=" + dni + ", numVacaciones="
				+ numVacaciones + "]";
	}
	

}
