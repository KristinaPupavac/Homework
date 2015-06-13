package ba.bitcamp.kristina.school;

public class Director {
	
	String name;
	int yearOfBirth;
	
	//constructor
	public Director(String name, int yearOfBirth) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	@Override
	public String toString() {
		return "Director [name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
	}
}
