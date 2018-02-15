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

	public boolean checkHexadecimal(String value) {
		return value.matches("[0123456789ABCDEF]+");
	}

	public int getStringToHex(){
		int decimal = Integer.parseInt(value, 16);
		return decimal;
	}

	@Override
	public String toString() {
		return "HexConversion [getValue()=" + getValue() + ", getStringToHex()=" + getStringToHex() + "]";
	}
	
	
}
