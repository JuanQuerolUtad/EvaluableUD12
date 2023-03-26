package asalariadoJuanQuerol;

public class Asalariado {
	//he puesto los atributos de la clase padre para que en las clases hijas se puedan hacer un toString
	protected String nombre;
	protected long dni;
	protected int numVacaciones;
	//constructor
	public Asalariado(String nombre, long dni, int numVacaciones) {
		this.nombre = nombre;
		this.dni = dni;
		this.numVacaciones = numVacaciones;
	}
	//getters
	public String getNombre() {
		return nombre;
	}
	public long getDni() {
		return dni;
	}
	public int getNumVacaciones() {
		return numVacaciones;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public void setNumVacaciones(int numVacaciones) {
		this.numVacaciones = numVacaciones;
	}
	
	
}
