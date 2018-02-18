package by.htp.classes.runner;

import java.util.Date;

public class Author {

	String name;
	String surname;
	Date birthDate;
	
	public Author() {
		
	}
	
	public Author(String name, String surname, Date date) {
		this.name = name;
		this.surname = surname;
		this.birthDate = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
