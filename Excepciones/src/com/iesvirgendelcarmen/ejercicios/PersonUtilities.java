package com.iesvirgendelcarmen.ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PersonUtilities {
	
	public static final String DNILetters = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static void main(String[] args) {
		
		//System.out.println(isValidDNI(readToken()));
		LocalDate localD = LocalDate.of(2017, 02, 24);
		System.out.println(isValidBirthDate(localD));
		
	}
	
	public static String readToken() {
		System.out.println("Introduce tu TOKEN");
		Scanner sc = new Scanner(System.in);
		String token = sc.next();
		sc.close();
		
		return token;
	}
		
	public static boolean isValidDNI(String dni) {
		String regex = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]?$";
		System.out.printf("TOKEN %s es valido? ", dni);
		if (!dni.trim().toUpperCase().matches(regex)) {
			return false;
		}
		
		char dniLetter = dni.toUpperCase().charAt(dni.length()-1);
		//String stringNumber = dni.substring(0, dni.length()-1);
		int dniNumber = Integer.parseInt(dni.substring(0, dni.length()-1))%23;
		return dniLetter==DNILetters.charAt(dniNumber);
	}
	
	public static boolean isValidBirthDate(LocalDate localDate) {
		Period period = Period.between(localDate, LocalDate.now());
		int dateResult = period.getYears() + period.getMonths() + period.getDays();
		//return period.getDays()>=0 && period.getYears()>=0 && period.getMonths()>=0;
		return dateResult >= 0;
	}
}
