package ebebekSalaryCalculator;

public class Main {

	public static void main(String[] args) {
		EmployeeManager employeeManager = new EmployeeManager(new Employee("Dilek Özgün", 2000, 45, 2005));
		System.out.println(employeeManager.toString());
	}

}
