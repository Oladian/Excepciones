package com.iesvirgendelcarmen.ejercicios;

public class HexConversion {
	private String value;
	
	public HexConversion(String value) throws HexadecimalException {
		if(checkHexadecimal(value)) {
			this.value = value;
		} else {
			throw new HexadecimalException("Non HEX number");
		}
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private static boolean checkHexadecimal(String value) {
		return value.toUpperCase().matches("[0123456789ABCDEF]+");
	}

	public int getDecimalFromHex(){
		int decimal = Integer.parseInt(value, 16);
		return decimal;
	}
	
	public int getDecimal() {
		StringBuilder sbinary = new StringBuilder(value);
		String sbReverse = sbinary.reverse().toString();
		int decimal = 0;
		
		for (int i = 0; i < sbReverse.length(); i++) {
			char digit = sbReverse.charAt(i);
			switch (digit) {
			case 'a':
				decimal+=Math.pow(16, i)*10;
				break;
			case 'b':
				decimal+=Math.pow(16, i)*11;
				break;
			case 'c':
				decimal+=Math.pow(16, i)*12;
				break;
			case 'd':
				decimal+=Math.pow(16, i)*13;
				break;
			case 'e':
				decimal+=Math.pow(16, i)*14;
				break;
			case 'f':
				decimal+=Math.pow(16, i)*15;
				break;
				
			default:
				decimal+=Math.pow(16, i)*(digit-48);
				break;
			}
		}
		
		return decimal;
		
		
	}
	

	@Override
	public String toString() {
		return "HexConversion [getValue()=" + getValue() + ", getStringToHex()=" + getDecimalFromHex() + "]";
	}
	
	
}
