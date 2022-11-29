package paquete;

public abstract class SmartDevice {
	
	String marca;
	String tipo;
	String color;
	int gigasMemoria;
	
	public SmartDevice() {
		
	}
	
	public SmartDevice(String marca, String tipo, String color, int gigasMemoria) {
		this.marca = marca;
		this.tipo = tipo;
		this.color = color;
		this.gigasMemoria = gigasMemoria;
	}

	@Override
	public String toString() {
		return "SmartDevice [marca=" + marca + ", tipo=" + tipo + ", color=" + color + ", gigasMemoria=" + gigasMemoria
				+ "]";
	}
	
	
	

}
