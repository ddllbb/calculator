package com.teoria;

public class OperadorInstaceof {

	//Se utiliza asociado a Herencia de Clases. Ejemplo la gestión de Excepciones
	public static void main(String[] args) {
		Integer numero =5;
		String cadena="Mi cadena";
		Casa casa = new Casa();
		
		if(numero instanceof Integer) System.out.println("Es un numero");
		
		if(cadena instanceof String) System.out.println("Es una cadena");
		
		if(casa instanceof Casa) System.out.println("Es una casa");
		
		
		
		
	}

}
