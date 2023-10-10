package com.teoria;

public class OperadoresVarios {

	public static void main(String[] args) {
		
		System.out.println("------------ Operador ternario -----------------");
		
		int i=5;
		String mensaje;
		String mensaje2;
		
		if(i>5) {
			mensaje="Es mayor que cinco";
		}else {
			mensaje ="Es igual o menor que cinco";
		}
		System.out.println(mensaje);
		
		
		mensaje2 = i>5?"Es mayor que cinco":"Es igual o menor que cinco";
		
		System.out.println(mensaje2);
		
		System.out.println("-------------- Operadores bit a bit ----------------------");
		
		System.out.println("------bit a bit, utilizando valores 5 y 2-------");
		
		int j=i&2;
		System.out.println("AND j:"+j);
		
		j=i|2;
		System.out.println("OR j:"+j);
		
		j=i^2;
		System.out.println("XOR j:"+j);
		
		j=~i;
		System.out.println("NOT j:"+j);
		
		System.out.println("------bit a bit, utilizando valores 5 y 3-------");
	
		
		j=i&3;
		System.out.println("AND j:"+j);
		
		j=i|3;
		System.out.println("OR j:"+j);
		
		j=i^3;
		System.out.println("XOR j:"+j);
		
		System.out.println("-------------- Operadores shift ----------------------");
		
		System.out.println("------ utilizando valores 5 y 2-------");
		
		int k=i<<2; //k=i*4
		System.out.println("Shift a la izquierda dos posiciones valor 5:"+ k);
		
		k=i>>2; //k=i/4
		System.out.println("Shift a la derecha dos posiciones valor 5:"+ k);
		
		//Sentencias equivalentes:
		//int l = i*8;
		//int l = i<<3;
		
		//Sentencias equivalentes:
		//int l = i/8;
		//int l = i>>3;
		
		
		

	}

}
