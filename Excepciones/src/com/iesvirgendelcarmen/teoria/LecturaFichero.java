package com.iesvirgendelcarmen.teoria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LecturaFichero {

	public static void main(String[] args) {
		FileInputStream in=null;

		try {
			in = new FileInputStream(
					"C:\\Users\\matinal\\Desktop\\Excepciones.txt");
			System.out.println("Existe el fichero");
			int byteLeido;
			while((byteLeido=in.read())!=-1) {
				System.out.printf("%c",(char)byteLeido);
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de lectura");
			//e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Tratamiento en JAVA 7 y posterior
		// Cierre automático del string
		
		try (FileInputStream in1 = new FileInputStream(
				"C:\\Users\\matinal\\Desktop\\Excepciones.txt");) {
			System.out.println("Existe el fichero");
			int byteLeido;
			while((byteLeido=in1.read())!=-1) {
				System.out.printf("%c",(char)byteLeido);
			}

		} catch (IOException e) { // En producción quito catch
			System.out.println("No existe el fichero");
			//e.printStackTrace();
		} 
	}
}
