package com.iesvirgendelcarmen.ejercicios;

public class TestTriangle {
	public static void main(String[] args) throws IlegalTriangleException{
	
		try {
			Triangle tr1 = new Triangle(1, 2, 3);
			System.out.println(tr1);
		} catch (IlegalTriangleException e) {
			System.out.println(e);;
		} 
		
		
		
		
		//System.out.println(validTriangle(tr1));
/*		
		try {
			validTriangle(tr1);
			System.out.println("Creado");
		} catch (Exception e){
			throw new IlegalTriangleException("Lados incorrectos");
		} 
		
		
	}
	
	public static boolean validTriangle(Triangle triangle) {
		return triangle.getSumAB()||triangle.getSumAC()||triangle.getSumBC();
	}
	
*/
	}
}