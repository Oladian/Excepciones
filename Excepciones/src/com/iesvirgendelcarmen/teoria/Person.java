package com.iesvirgendelcarmen.teoria;

import java.time.LocalDate;

public class Person {
	
	// Atributos
	private String lastName;
	private String firstName;
	private LocalDate birthDate=null;
	private String dni;
	
	
	// Constructor con excepción si DNI inválido
	public Person(String lastName, String firstName, LocalDate birthDate, String dni) throws DniException {
		if (PersonUtilities.isValidDNI(dni)) {
			this.lastName = lastName;
			this.firstName = firstName;
			this.birthDate = birthDate;
			this.dni = dni;
		} else {
			throw new DniException("DNI no valido");
		}
	}

	
	
	// Getters y setters
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return lastName + ", " + firstName + ". DNI: " + dni;
	}
	
	
}
