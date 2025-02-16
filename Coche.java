class Coche extends Vehiculo {
	private int numeroPuertas;

	public Coche(String marca, String modelo, int velocidadMaxima, int anioFabricacion, int numeroPuertas) {
		super(marca, modelo, velocidadMaxima, anioFabricacion);
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	// METODO QUE DEVUELVE UN TRUE O FALSE 

	public boolean cumpleSeguridad() {
		return numeroPuertas >= 4;
	}

	@Override
	public String toString() {
		return "Coche: " + marca + " " + modelo + " - " + velocidadMaxima + " km/h - " + numeroPuertas + " puertas";
	}
}
