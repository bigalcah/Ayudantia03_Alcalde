import java.util.InputMismatchException;
import java.util.Scanner;

public class Persona {
	private String nombre;

	public static Scanner scanner = new Scanner(System.in);
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public float validarInt(){
		int distancia = 0;
		while (true) {
			try {
				System.out.println("Introduzca la distancia de su destino en km: ");
				distancia = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Error: Debe ingresar un número entero válido.");
				scanner.nextLine(); // Limpia el búfer de entrada
			}
		}
		return distancia;
	}
	public void introducirNombrePersona(){
		System.out.println("Introduzca su nombre: ");
		String nombrePersona = scanner.next();
		setNombre(nombrePersona);
	}
	public String introducirNombreDestino(){
		System.out.println("Introduzca el nombre de su destino: ");
		return scanner.next();
	}
	public void viajar() {
		int eleccion = elegirVehiculo();
		if(eleccion == 1){
			Auto auto = new Auto();
			introducirNombrePersona();
			String nombreDestino = introducirNombreDestino();
			float distanciaDestino = validarInt();
			float tiempoEnLlegar = auto.tiempoEnLlegar(distanciaDestino);
			System.out.println("Hola " + this.nombre + "! el tiempo en llegar a " + nombreDestino + " en " +
					auto.nombre + " es de " + tiempoEnLlegar + " horas");
		}else if(eleccion == 2){
			Motocicleta moto = new Motocicleta();
			introducirNombrePersona();
			String nombreDestino = introducirNombreDestino();
			float distanciaDestino = validarInt();
			float tiempoEnLlegar = moto.tiempoEnLlegar(distanciaDestino);
			System.out.println("Hola " + this.nombre + "! el tiempo en llegar a " + nombreDestino + " en " +
					moto.nombre + " es de " + tiempoEnLlegar + " horas");
		}else if(eleccion == 3){
			Bicicleta bici = new Bicicleta();
			introducirNombrePersona();
			String nombreDestino = introducirNombreDestino();
			float distanciaDestino = validarInt();
			float tiempoEnLlegar = bici.tiempoEnLlegar(distanciaDestino);
			System.out.println("Hola " + this.nombre + "! el tiempo en llegar a " + nombreDestino + " en " +
					bici.nombre + " es de " + tiempoEnLlegar + " horas");
		}else {
			System.out.println("Algo salió mal");
		}
	}
	public int elegirVehiculo(){
		int opcion = 0;
		int eleccion = 0;
		do {
			System.out.println("Qué vehiculo desea conducir? Escoja una opción: ");
			System.out.println("[1] Auto (60 km)");
			System.out.println("[2] Motocicleta (50 km)");
			System.out.println("[3] Bicicleta (20 km)");
			opcion = scanner.nextInt();
			if (opcion >=1 && opcion <=3){
				eleccion = opcion;
				break;
			}else {
				System.out.println("Ingrese una opcion valida");
			}
		}while (true);
		return eleccion;
	}
}