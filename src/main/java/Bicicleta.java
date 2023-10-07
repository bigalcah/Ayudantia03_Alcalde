public class Bicicleta{

	private float velocidad;
	String nombre;

	public Bicicleta() {
		this.velocidad = 20.0f;
		this.nombre = "Bicicleta";
	}
	public float tiempoEnLlegar(float distancia){
		return distancia / this.velocidad;
	}
}