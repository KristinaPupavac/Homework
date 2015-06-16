package ba.bitcamp.task2;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Female1", "female", 300);
		Employee e2 = new Employee("Female2", "female", 300);
		Employee e3 = new Employee("Female3", "female", 300);
		Employee e4 = new Employee("Female4", "female", 300);
		Employee e5 = new Employee("Man1", "man", 300);

		System.out.println("Employee name is: " + e1.getName());
		System.out.println("Employee sex is: " + e5.getSex());
		System.out.println("Employee month salary is: " + e3.getSalary());
		e4.setSalary(100);

		Employee[] employees = new Employee[] { e1, e2, e3, e4, e5 };

		Firm f = new Firm("Firm", e2, employees);
		
		System.out.println("Number of employees: " + f.getNumberOfEmployees());
		System.out.println("All employees salary is: " + f.getAllEmployeesSalary());
		System.out.println("Number of female employees in firm: " + f.getFemale());
		f.setBonus(100);
		System.out.println(f.toStrig());

	}

}
