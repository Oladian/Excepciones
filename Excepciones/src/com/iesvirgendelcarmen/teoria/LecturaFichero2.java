package com.iesvirgendelcarmen.teoria;

import java.io.FileInputStream;
import java.io.IOException;

public class LecturaFichero2 {

	public static void main(String[] args) {
		try {
			mostrarContenidoFichero("C:\\Users\\msatinal\\Desktop\\Excepciones.txt");
		} catch (IOException e) {
			System.out.println("Fallo");
			//e.printStackTrace();
		}
	}
	
	public static void mostrarContenidoFichero(String rutaFichero) throws IOException {
		FileInputStream in = new FileInputStream(rutaFichero);
		int byteLeido;
		
		while((byteLeido=in.read())!=-1) {
			System.out.printf("%c",(char)byteLeido);
		}
		
		in.close();
	
	}
}