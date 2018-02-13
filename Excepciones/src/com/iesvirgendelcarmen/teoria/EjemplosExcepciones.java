package com.iesvirgendelcarmen.teoria;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class EjemplosExcepciones {
	public static void main(String[] arg){
		int numerador= 10;
		int denominador = 0;
		//int division = numerador/denominador;
		//System.out.println(division);
		
		
		Scanner in = new Scanner(System.in);
		String valorBoolean = in.next();
		/*
		 * Excepciones no declarativas
		 */
		if (!valorBoolean.toUpperCase().matches("TRUE|FALSE")) {
			System.out.println("Valor incorrecto");
		}
	
		in.close();
		
		int [] coleccionEnteros = new int[10];
		for (int i = 0; i <= 10; i++) {
			if(i<coleccionEnteros.length) {
				coleccionEnteros[i]=i;
				System.out.println("posicion "+i+": "+coleccionEnteros[i]);
			}
		}
		
		/*
		 * Excepción declarativa
		 */
		
		try {
			FileReader fileReader = new FileReader("fichero.txt");
		} catch (FileNotFoundException fileReader) {
			// TODO: handle exception
			System.out.println("No encuentro el fichero");
		} finally {
			System.out.println("Dentro del bloque finally");
		}
		
		/*
		 * Excepción no declarativa, pero sí manejada
		 */
		
		try {
			System.out.println(coleccionEnteros[10]);;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posición no existente");
			System.out.println(e);
		}
	}
}
