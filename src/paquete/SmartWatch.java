package paquete;

public class SmartWatch extends SmartDevice {
	
	int megaPixeles;

	public SmartWatch() {

	}

	public SmartWatch(String marca, String tipo, String color, int gigasMemoria, int megaPixeles) {
		super(marca, tipo, color, gigasMemoria);
		
		this.megaPixeles=megaPixeles;
	}

	@Override
	public String toString() {
		return "SmartWatch [megaPixeles=" + megaPixeles + ", marca=" + marca + ", tipo=" + tipo + ", color=" + color
				+ ", gigasMemoria=" + gigasMemoria + "]";
	}
	
	
	

}
