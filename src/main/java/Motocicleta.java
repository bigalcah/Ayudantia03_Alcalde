public class Motocicleta{

	private float velocidad;
	String nombre;

	public Motocicleta() {
		this.velocidad = 50.0f;
		this.nombre = "Bicicleta";
	}
	public float tiempoEnLlegar(float distancia){
		return distancia / this.velocidad;
	}
}