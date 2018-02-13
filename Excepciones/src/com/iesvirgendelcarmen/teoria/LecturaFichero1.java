package com.iesvirgendelcarmen.teoria;

import java.io.FileInputStream;
import java.io.IOException;


public class LecturaFichero1 {
	public static void main(String[] args) {
		mostrarContenidoFichero("C:\\Users\\matinal\\Desktop\\Excepciones.txt");
	}
	
	public static void mostrarContenidoFichero(String rutaFichero) {
		try (FileInputStream in = new FileInputStream(
				rutaFichero)) {
			System.out.println("Existe el fichero");
			int byteLeido;
			while((byteLeido=in.read())!=-1) {
				System.out.printf("%c",(char)byteLeido);
			}

		} catch (IOException e) { // En producción quito catch
			System.out.println("No existe el fichero");
			//e.printStackTrace();
		} 

	}
}
