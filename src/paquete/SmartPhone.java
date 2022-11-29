package paquete;

public class SmartPhone extends SmartDevice {
	
	String sistemaOperativo;
	
	public SmartPhone() {
		
	}

	public SmartPhone(String marca, String tipo, String color, int gigasMemoria, String sistemaOperativo) {
		super(marca, tipo, color, gigasMemoria);
		
		this.sistemaOperativo=sistemaOperativo;
	
	}

	@Override
	public String toString() {
		return "SmartPhone [sistemaOperativo=" + sistemaOperativo + ", marca=" + marca + ", tipo=" + tipo + ", color="
				+ color + ", gigasMemoria=" + gigasMemoria + "]";
	}
	
	

}
