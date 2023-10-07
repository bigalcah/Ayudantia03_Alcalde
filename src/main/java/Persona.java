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
	public void mensaje(){
		System.out.println("Introduzca su nombre: ");
		String nombrePersona = scanner.next();
		setNombre(nombre);
		System.out.println("Introduzca el nombre de su destino: ");
		String nombreDestino = scanner.next();
		int distanciaDestino = validarInt();

		System.out.println("Hola " + this.nombre + "!, el tiempo de viaje aproximado para llegar a " + nombreDestino +
				"es de: " + viajar(distanciaDestino));
	}
	public float viajar(int distancia) {
		Vehiculo vehiculo = elegirVehiculo();
		float tiempo = vehiculo.tiempoEnLlegar(distancia);
		return tiempo;
	}
	public Vehiculo elegirVehiculo(){
		int opcion;
		Vehiculo seleccion = null;
		do {
			System.out.println("Qué vehiculo desea conducir? Escoja una opción: ");
			System.out.println("[1] Auto");
			System.out.println("[2] Motocicleta");
			System.out.println("[3] Bicicleta");
			opcion = scanner.nextInt();
			switch (opcion){
				case 1 -> {
					Auto auto = new Auto();
					 seleccion = auto;
					 break;
				}
				case 2 -> {
					Motocicleta moto = new Motocicleta();
					seleccion = moto;
					break;
				}
				case 3 -> {
					Bicicleta bicicleta = new Bicicleta();
					seleccion = bicicleta;
					break;
				}
				default -> System.out.println("Intente con una opción valida: ");
			}
		}while (seleccion == null);
		return seleccion;
	}

}