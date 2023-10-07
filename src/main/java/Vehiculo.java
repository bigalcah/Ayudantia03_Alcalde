public class Vehiculo {

	private int velocidad;

	public float tiempoEnLlegar(int distancia) {
		float tiempoHoras =  distancia / this.velocidad;
		float tiempoMinutos = tiempoHoras * 60;
		return tiempoMinutos;
	}
	public Vehiculo(){

	}
}