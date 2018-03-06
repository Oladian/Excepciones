package com.iesvirgendelcarmen.ejercicios;

import java.util.Scanner;

public class TestBinHex {
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce Binary number");
		String inBin = sc.next();
	
		try {
			BinConversion bin1 = new BinConversion(inBin);
			System.out.printf("Decimal value of %s is %d%n",bin1.getValue(),
					bin1.getBinaryToDecimal());

		} catch (BinaryException e) {
			System.out.println(e);
		}
		
		System.out.println("Introduce Hex number");
		String inHex = sc.next();
		
		try {
			HexConversion hex1 = new HexConversion(inHex);
			System.out.printf("Decimal value of %s is %d%n"
					+ "With another method: %d%n",hex1.getValue(),
					hex1.getDecimalFromHex(),hex1.getDecimal());
		} catch (HexadecimalException e) {
			System.out.println(e);
		}

	}
}
