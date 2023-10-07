import java.util.InputMismatchException;
import java.util.Scanner;

public class Persona {

	private String nombre;

	public static Scanner scanner = new Scanner(System.in);
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public int validarInt(){
		int distancia = 0;
		while (true) {
			try {
				System.out.println("Introduzca la distancia de su destino (debe ser un número entero):");
				distancia = scanner.nextInt();
				break; // Si se ingresa un valor válido, sal del bucle
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
		String nombreDestino;
		return nombreDestino = scanner.next();
	}
	public void viajar() {
		if(elegirVehiculo() == 1){
			Auto auto = new Auto();
			introducirNombrePersona();
			String nombreDestino = introducirNombreDestino();
			int distanciaDestino = validarInt();
			float tiempoEnLlegar = auto.tiempoEnLlegar(distanciaDestino);
			System.out.println("Hola " + this.nombre + " el tiempo en llegar a " + nombreDestino + " en " +
					auto.nombre + " es de " + tiempoEnLlegar + " minutos");
		}else if(elegirVehiculo() == 2){
			Motocicleta moto = new Motocicleta();
			introducirNombrePersona();
			String nombreDestino = introducirNombreDestino();
			int distanciaDestino = validarInt();
			float tiempoEnLlegar = moto.tiempoEnLlegar(distanciaDestino);
			System.out.println("Hola " + this.nombre + " el tiempo en llegar a " + nombreDestino + " en " +
					moto.nombre + " es de " + tiempoEnLlegar + " minutos");
		}else if(elegirVehiculo() == 3){
			Bicicleta bici = new Bicicleta();
			introducirNombrePersona();
			String nombreDestino = introducirNombreDestino();
			int distanciaDestino = validarInt();
			float tiempoEnLlegar = bici.tiempoEnLlegar(distanciaDestino);
			System.out.println("Hola " + this.nombre + " el tiempo en llegar a " + nombreDestino + " en " +
					bici.nombre + " es de " + tiempoEnLlegar + " minutos");
		}else {
			System.out.println("Algo salió mal");
		}
	}
	public int elegirVehiculo(){
		int opcion;
		int seleccion = 0;
		do {
			System.out.println("Qué vehiculo desea conducir? Escoja una opción: ");
			System.out.println("[1] Auto");
			System.out.println("[2] Motocicleta");
			System.out.println("[3] Bicicleta");
			opcion = scanner.nextInt();
			switch (opcion){
				case 1 -> {
					seleccion = 1;
				}
				case 2 -> {
					seleccion = 2;
				}
				case 3 -> {
					seleccion = 3;
				}
				default -> System.out.println("Intente con una opción valida: ");
			}
		}while (seleccion < 1 && seleccion > 3);
		return seleccion;
	}
}