package com.iesvirgendelcarmen.ejercicios;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double sideA, double sideB, double sideC) throws IlegalTriangleException {
		if (checkTriangle(sideA, sideB, sideC)) {
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
		} else {
			throw new IlegalTriangleException("Error");
		}
	}
	
	private static boolean checkTriangle(double sideA, double sideB, double sideC) {
		return !(sideA>sideB+sideC || sideB>sideA+sideC || sideC>sideA+sideB);
	}
	
	private static boolean checkTriangle2(double sideA, double sideB, double sideC) {
		return 	sideA<=(sideB+sideC) && 
				sideB<=(sideA+sideC) && 
				sideC<=(sideA+sideB);
	}

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}

	@Override
	public String toString() {
		return "Triangle [getSideA()=" + getSideA() + ", getSideB()=" + getSideB() + ", getSideC()=" + getSideC() + "]";
	}
	
	
}