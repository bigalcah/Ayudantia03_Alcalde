public class Auto{

	public float velocidad;
	String nombre;

	public Auto() {
		this.velocidad = 60.0f;
		this.nombre = "auto";
	}
	public float tiempoEnLlegar(float distancia){
		return distancia / this.velocidad;
	}
}