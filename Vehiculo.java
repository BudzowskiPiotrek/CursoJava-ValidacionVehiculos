abstract class Vehiculo {
	protected String marca;
	protected String modelo;
	protected int velocidadMaxima;
	protected int anioFabricacion;

	public Vehiculo(String marca, String modelo, int velocidadMaxima, int anioFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
		this.anioFabricacion = anioFabricacion;
	}

	// METODO PARA COMPARAR VELOCIDADES QUE DEVUELVE CONTENIDO DE TEXTO CON RESPUESTA
	// SE DECLARA COMO STATIC PORQUE NO DEPENDE DE UNA INSTANCIA ESPECIFICA DE VEHICULO.  
	// SOLO USA LOS OBJETOS V1 Y V2 QUE RECIBE COMO PARAMETROS, EN MAIN SE LE INTANCIA CON
	// VEHICULO.COMPARARVELOCIDADES, CON CON NOMBRE OBJETO CREADO

	public static String compararVelocidades(Vehiculo v1, Vehiculo v2) {
		String contenido = null;
		if (v1.velocidadMaxima > v2.velocidadMaxima) {
			contenido = v1.marca + " " + v1.modelo + " es mas rapido.";
		} else if (v1.velocidadMaxima < v2.velocidadMaxima) {
			contenido = v2.marca + " " + v2.modelo + " es mas rapido.";
		} else {
			contenido = "Los dos vehiculos tienen la misma velocidad maxima.";
		}
		return contenido;
	}
}
