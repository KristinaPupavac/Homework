package ba.bitcamp.kristina.school;

public class Classroom {
	
	String name;
	int numberOfStudents;
	
	//constructor
	public Classroom(String name, int numberOfStudents) {
		super();
		this.name = name;
		this.numberOfStudents = numberOfStudents;
	}

	@Override
	public String toString() {
		return "Classroom [name=" + name + ", numberOfStudents="
				+ numberOfStudents + "]";
	}
	
	
}
