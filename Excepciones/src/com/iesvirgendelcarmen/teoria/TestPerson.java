package com.iesvirgendelcarmen.teoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) throws DniException {
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type: Name, LastName");
		String firstName = in.nextLine();
		String lastName = in.nextLine();
		
		if (!firstName.toLowerCase().matches("[a-zñáéíóúü\\s]+") || 
				!lastName.toLowerCase().matches("[a-zñáéíóúü\\s]+")) {
			System.out.println("Invalid Name");
			System.exit(1);
		}

		System.out.println("Type: Birth date: dd/mm/aaaa");
		String date= in.nextLine();
		String dayRegex = "(0[1-9]|[1-9]|[1-2][0-9]|3[0-1])";
		String monthRegex = "([01-9]|[1-9]|[10-2])";
		String yearRegex = "([0-9]{1,4})";
		if(date.matches(dayRegex+"/"+monthRegex+"/"+yearRegex)) {
			System.out.println("Invalid date");
		} else {
			System.out.println("Success");
		}

		/*LocalDate birthDate = LocalDate.parse(date);
		
		
		System.out.println("Type: DNI");
		String dni = in.nextLine();
		
		Person p1 = new Person(lastName, firstName, birthDate, dni);
		
		System.out.println(p1);*/

	}

}
