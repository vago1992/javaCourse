package paquete;

public class ClaseMain {
	static double sumarIva(double precio) {
		return (precio+precio*0.21);
	}
	

	public static void main(String[] args) {
		
		int num = 5;
		long num2=1000;
		double num3 = 10.25D;
		boolean bul= true;
		String palabra= "Hola mundo";
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(bul);
		System.out.println(palabra);
		
		double precioIva=sumarIva(150.10);
		
		System.out.println(precioIva);
		
		String[] nombres= {"Hola ","Mundo ","Como ","va ","?"};
		String nombreConca="";
		
		for (String nombre : nombres) {
			nombreConca+=nombre;
		}
		
		System.out.println(nombreConca);
		

	}

}
