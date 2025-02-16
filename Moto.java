class Moto extends Vehiculo {
	private int cilindrada;
	
	public Moto(String marca, String modelo, int velocidadMaxima, int anioFabricacion, int cilindrada) {
		super(marca, modelo, velocidadMaxima, anioFabricacion);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	// METODO QUE DEVUELVE UN TRUE O FALSE 

	public boolean puedeAutopista() {
		return cilindrada >= 150;
	}

	@Override
	public String toString() {
		return "Moto: " + marca + " " + modelo + " - " + velocidadMaxima + " velocidad en km/h - " + cilindrada + "- cilindrada.";
	}
}
