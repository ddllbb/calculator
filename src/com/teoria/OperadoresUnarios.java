package com.teoria;

public class OperadoresUnarios {

	public static void main(String[] args) {

		int i = 5;

		System.out.println("Numero:" + i);

		i = -i;

		System.out.println("Numero Negativo:" + i);

		i = -i;

		System.out.println("Numero Positivo:" + i);

		boolean marca = true;

		System.out.println("Marca:" + marca);

		marca = !marca;

		System.out.println("Marca:" + marca);

		// ++i, i++
		System.out.println("Inicial i:" + i);

		int j = ++i; // j=6 i=6 Equivale a: i=i+1; int j= i;

		System.out.println("j:" + j);
		System.out.println("i:" + i);

		int k = i++; // k=6 i=7 int k=i; i=i+1;
		System.out.println("k:" + k);
		System.out.println("i:" + i);

		// --i, i--
		j = --i;// j=6 i=6

		System.out.println("j:" + j);
		System.out.println("i:" + i);

		k = i--; // k=6 i=5
		
		System.out.println("k:" + k);
		System.out.println("i:" + i);
		

	}

}
