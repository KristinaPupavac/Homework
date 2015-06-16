package ba.bitcamp.task2;

/**
 * Class describes employees of one firm
 * 
 * @author Kristina Pupavac
 *
 */
public class Employee {
	private String name;
	private String sex;
	private int salary;

	/**
	 * Default constructor
	 * 
	 * @param name
	 *            - Name
	 * @param sex
	 *            - Sex
	 * @param salary
	 *            - Month salary
	 */
	public Employee(String name, String sex, int salary) {
		this.name = name;
		this.sex = sex;
		this.salary = salary;
	}

	/**
	 * Gets name
	 * 
	 * @return - Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets sex
	 * 
	 * @return - Sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * Gets salary
	 * 
	 * @return - Month salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * Sets monthly salary
	 * 
	 * @param salary
	 *            - Month salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
