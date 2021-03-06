package ba.bitcamp.task2;

/**
 * Class
 * 
 * @author Kristina Pupavac
 *
 */
public class Firm {
	private String name;
	private Employee director;
	private Employee[] employees;

	/**
	 * Defult constructor
	 * 
	 * @param name
	 *            - Name
	 * @param director
	 *            - Director
	 * @param employees
	 *            - Employees
	 */
	public Firm(String name, Employee director, Employee[] employees) {
		this.name = name;
		this.director = director;
		this.employees = employees;
	}

	/**
	 * Gets number of employees
	 * 
	 * @return - number of employees
	 */
	public int getNumberOfEmployees() {
		return employees.length;
	}

	/**
	 * Gets all employes salary
	 * @return - All employees salary
	 */
	public int getAllEmployeesSalary() {
		int counter = 0;
		for (int i = 0; i < employees.length; i++) {
			counter = counter + employees[i].getSalary();
		}
		return counter;
	}

	/**
	 * Gets number of female employees
	 * 
	 * @return - Number of female employees
	 */
	public int getFemale() {
		int counter = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSex().equals("female")) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Set bonus Salary to all employees
	 * @param bonus - Bonus salary
	 */
	public void setBonus(int bonus) {
		for (int i = 0; i < employees.length; i++) {
			employees[i].setSalary(employees[i].getSalary() + bonus);
		}
	}

	/**
	 * Returns string
	 * 
	 * @return
	 */
	public String toStrig() {
		String output = "Firm name: " + name + " Director name: " + director.getName()
				+ " Number of employees: " + employees.length;
		return output;
	}

}
