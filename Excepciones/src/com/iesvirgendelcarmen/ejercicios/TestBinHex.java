package com.iesvirgendelcarmen.ejercicios;

public class TestBinHex {
	
	public static void main(String[] args) { 
		
		try {
			BinConversion bin1 = new BinConversion("110");
			System.out.printf("Decimal value of %s is %d%n",bin1.getValue(),
					bin1.getBinaryToDecimal());

		} catch (BinaryException e) {
			System.out.println(e);
		}
		
		try {
			HexConversion hex1 = new HexConversion("10293AEF");
			System.out.printf("Decimal value of %s is %d%n",hex1.getValue(),
					hex1.getStringToHex());
		} catch (HexadecimalException e) {
			System.out.println(e);
		}
	}
}
