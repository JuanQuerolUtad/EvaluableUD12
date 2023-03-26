package asalariadoJuanQuerol;

public class TestAsalariado {

	public static void main(String[] args) {
		EmpleadoProduccion produccion = new EmpleadoProduccion("José", 1234567890, 22, "Tarde");
		EmpleadoDistribucion distribuicion = new EmpleadoDistribucion("Francisco", 987654321, 21, "Sur");
		System.out.println(produccion.toString());
		System.out.println(distribuicion.toString());
	}

}
