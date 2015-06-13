package ba.bitcamp.kristina.school;

import java.util.Arrays;

/*
 * Napisati klasu koja predstavlja jednu skolu. Atributi su sljedeci:
 * Ime skole
 * Direktor (objekat koji ima atribute ime i godiste)
 * Niz razreda (svaki razred ima ime i broj ucenika)
 */
public class School {
	String schoolName;
	Director director; 
	Classroom[] classroom;
	
	//constructor
	public School(String schoolName, Director director, Classroom[] classroom) {
		super();
		this.schoolName = schoolName;
		this.director = director;
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", director=" + director
				+ ", classroom=" + Arrays.toString(classroom) + "]";
	}
	
}
