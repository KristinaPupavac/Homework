package ba.bitcamp.kristina.school;

/*
 * Napisati metodu koja prima, kao parametar, jednu skolu. Metoda vraca ime razreda koje ima
 * najvise ucenika.
 * Metoda: String getNameOfClassWithTheMostStudents(School s)
 * 
 * Napisati metodu koja prima, kao parametar, niz skola. Metoda vraca skolu koja ima najmladjeg
 * direktora.
 * Metoda: School getSchoolWithYoungestDirector(School[] schools)
 * 
 * Napisati metodu koja prima, kao parametre, dvije skole. Metoda vraca ime skole koja ima vise 
 * ucenika.
 * Metoda: String getNameOfSchoolWithMoreStudents(School s1, School s2)
 */
public class Main {
	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Director d1 = new Director("Mujo M. ", 1962);
		Director d2 = new Director("Maja M. ", 1975);

		Classroom c1 = new Classroom("Ia", 17);
		Classroom c2 = new Classroom("IIa", 20);
		Classroom c3 = new Classroom("IIIa", 27);

		Classroom c4 = new Classroom("Ib", 21);
		Classroom c5 = new Classroom("IIb", 28);
		Classroom c6 = new Classroom("IIIb", 22);
		Classroom c7 = new Classroom("IVb", 20);

		Classroom[] clas1 = new Classroom[] { c4, c5, c6, c7 };
		Classroom[] clas2 = new Classroom[] { c1, c2, c3 };

		School s1 = new School("Gimnazija", d1, clas1);
		School s2 = new School("Elektro", d2, clas2);

		School[] school1 = new School[] { s1, s2 };

		// printing
		System.out.println("Class with the most students is: "
				+ getNameOfClassWithTheMostStudents(s1));

		System.out.println("Schoool with the yungest director is: "
				+ getSchoolWithYoungestDirector(school1));

		System.out.println("School with more student is: " + getNameOfSchoolWithMoreStudents(s1, s2));

	}

	/**
	 * Method receives one school, as a parameter.The method returns the name of
	 * the class that has the most students.
	 * 
	 * @param s
	 *            - school
	 * @return mostStudentsClass
	 */
	public static String getNameOfClassWithTheMostStudents(School s) {
		Classroom mostStudentsClass = s.classroom[0];
		for (int i = 0; i < s.classroom.length; i++) {
			if (mostStudentsClass.numberOfStudents < s.classroom[i].numberOfStudents) {
				mostStudentsClass.numberOfStudents = s.classroom[i].numberOfStudents;
				mostStudentsClass.name = s.classroom[i].name;
			}
		}
		return mostStudentsClass + "";
	}
	/**
	 * Method receives a array of schools, as a parameter. The method returns a school that has 
	 * the youngest director.
	 * @param schools - array of schools
	 * @return YoungestDirector - name of school with youngest director
	 */
	public static School getSchoolWithYoungestDirector(School[] schools) {
		School YoungestDirector = schools[0];
		for (int i = 0; i < schools.length; i++) {
			if (YoungestDirector.director.yearOfBirth < schools[i].director.yearOfBirth) {
				YoungestDirector.director.yearOfBirth = schools[i].director.yearOfBirth;
				YoungestDirector.director.name = schools[i].director.name;
			}
		}
		return YoungestDirector;
	}
	/**
	 * Method receives, the two schools, as parameters.The method returns the name of the school,
	 * which has more students.
	 * @param s1 - school
	 * @param s2 - school
	 * @return schoolName - school with more students
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2) {
		int numberOfStudentsSchool1 = 0;
		int numberOfStudentsSchool2 = 0;
		for (int i = 0; i < s1.classroom.length; i++) {
			numberOfStudentsSchool1 += s1.classroom[i].numberOfStudents;
		}
		for (int j = 0; j < s2.classroom.length; j++) {
				numberOfStudentsSchool2 += s2.classroom[j].numberOfStudents;
		}
		if (numberOfStudentsSchool1  > numberOfStudentsSchool2) {
			return s1.schoolName ;
		} else {
			return s2.schoolName;
		}
		
	}

}
