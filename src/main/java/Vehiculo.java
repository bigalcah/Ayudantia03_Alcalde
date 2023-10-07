public class Vehiculo extends Auto {

	private int velocidad;

	public float tiempoEnLlegar(int distancia) {
		float tiempoHoras =  distancia / this.velocidad;
		float tiempoMinutos = tiempoHoras * 3600;
		return tiempoMinutos;
	}
}