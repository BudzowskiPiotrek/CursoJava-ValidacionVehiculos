import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// EN EL MAIN CREO SOLO DOS VEHICULOS UNO PARA MOTO OTRO PARA COCHE,
		// AL VOVLER A CREAR EL OBJETO EN EL MENU SE SOBRESCRIBE EL ANTERIOR

		Vehiculo vehiculo1 = null, vehiculo2 = null;
		Scanner sn = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			System.out.println("\nMenu Principal");
			System.out.println("1. Crear Coche");
			System.out.println("2. Crear Moto");
			System.out.println("3. Validar Normas de Seguridad (Coche)");
			System.out.println("4. Validar si la Moto puede circular en autopista");
			System.out.println("5. Comparar velocidades");
			System.out.println("6. Salir");
			int opcion = sn.nextInt();
			sn.nextLine();

			switch (opcion) {
			case 1:
				System.out.print("Marca: ");
				String marcaCoche = sn.nextLine();
				System.out.print("Modelo: ");
				String modeloCoche = sn.nextLine();
				System.out.print("Velocidad Maxima: ");
				int velocidadCoche = sn.nextInt();
				System.out.print("Año de Fabricacion: ");
				int anioCoche = sn.nextInt();
				System.out.print("Numero de Puertas: ");
				int puertas = sn.nextInt();

				vehiculo1 = new Coche(marcaCoche, modeloCoche, velocidadCoche, anioCoche, puertas);
				System.out.println("Coche creado exitosamente.");
				break;

			case 2:
				System.out.print("Marca: ");
				String marcaMoto = sn.nextLine();
				System.out.print("Modelo: ");
				String modeloMoto = sn.nextLine();
				System.out.print("Velocidad Maxima: ");
				int velocidadMoto = sn.nextInt();
				System.out.print("Año de Fabricacion: ");
				int anioMoto = sn.nextInt();
				System.out.print("Cilindrada: ");
				int cilindrada = sn.nextInt();

				vehiculo2 = new Moto(marcaMoto, modeloMoto, velocidadMoto, anioMoto, cilindrada);
				System.out.println("Moto creada exitosamente.");
				break;

			case 3: // INSTANCEOF LO UTILIZO AQUI SOLO PARA PRACTICAR, YA QUE SEGUN ESTRUCTURA ES
					// IMPOSIBLE QUE SEA DE OTRO TIPO
				if (vehiculo1 instanceof Coche) {
					Coche coche = (Coche) vehiculo1;
					if (coche.cumpleSeguridad()) {
						System.out.println("El coche cumple con las normas de seguridad.");
					} else {
						System.out.println("El coche NO cumple con las normas de seguridad.");
					}
				} else {
					System.err.println("Primero debe crear un coche.");
				}
				break;

			case 4: // INSTANCEOF LO UTILIZO AQUI SOLO PARA PRACTICAR, YA QUE SEGUN ESTRUCTURA ES
					// IMPOSIBLE QUE SEA DE OTRO TIPO
				if (vehiculo2 instanceof Moto) {
					Moto moto = (Moto) vehiculo2;
					if (moto.puedeAutopista()) {
						System.out.println("La moto PUEDE circular en autopistas.");
					} else {
						System.out.println("La moto NO puede circular en autopistas.");
					}
				} else {
					System.err.println("Primero debe crear una moto.");
				}
				break;

			case 5:
				if (vehiculo1 != null && vehiculo2 != null) {
					System.out.println(Vehiculo.compararVelocidades(vehiculo1, vehiculo2));
		
				} else {
					System.err.println("Debe crear ambos vehiculos antes de compararlos.");
				}
				break;

			case 6:
				System.out.println("Apagando...");
				flag = false;
			default:
				System.err.println("Error, intente nuevamente.");
			}
		}
	}
}
