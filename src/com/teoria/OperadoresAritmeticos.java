package com.teoria;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int i = 10;
		int j = 7;

		double resultado = i + j;
		System.out.println("Suma:" + resultado);

		resultado = i - j;
		System.out.println("Resta:" + resultado);

		resultado = (double) i * j;
		System.out.println("Multiplicacion:" + resultado);

		resultado = (double) i / j;
		System.out.println("Division:" + resultado);

		resultado = i % j;
		System.out.println("Resto:" + resultado);
		
		//------------------------------------------------
		float x =4.4f;
		float y =1.20f;
		
		float resultado2;
		resultado2 = (long)( x / y);
		System.out.println("Division:" + resultado2);

		//resultado2 = x % y;
		System.out.println("Resto:" + resultado2);
		
		
		

		

	}

}
