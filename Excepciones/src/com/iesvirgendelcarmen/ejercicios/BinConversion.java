package com.iesvirgendelcarmen.ejercicios;

public class BinConversion {
	
	private String value;
	
	public BinConversion(String value) throws BinaryException { // Constructor
		if (checkBinary(value)) {
			this.value = value;
		} else {
			throw new BinaryException("Non valid binary number");
		}
	}

	public String getValue() {
		return value;
	}

	public boolean checkBinary(String value) { // Verifica que el valor introducido es binario
		return value.matches("[01]+");
	}

	public int getBinaryToDecimal() {	// Convierte binario a decimal
		StringBuilder sbinary = new StringBuilder(value);
		String sbReverse = sbinary.reverse().toString();
		int sum = 0;
				
		for (int i=0; i < sbReverse.length(); i++) {
			if(sbReverse.charAt(i)=='1')
				sum+=Math.pow(2, i);
		}
		
		return sum;
	}

	@Override
	public String toString() {
		return "BinConversion [value=" + value + ", getBinaryToDecimal()=" + getBinaryToDecimal() + "]";
	}
	
	
}
