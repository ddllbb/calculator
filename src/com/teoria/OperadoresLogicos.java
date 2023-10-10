package com.teoria;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int i=10;
		int j=7;
		boolean resultado1 = (i==j);
		boolean resultado2 = (i >=j);
		boolean resultado = resultado1 | resultado2;
		resultado = resultado1 || resultado2; //operador cortocircuito
		resultado = resultado1 & resultado2;
		resultado = resultado1 && resultado2;//operador cortocircuito
		resultado = resultado1 ^ resultado2;
		 
		
	}

}
