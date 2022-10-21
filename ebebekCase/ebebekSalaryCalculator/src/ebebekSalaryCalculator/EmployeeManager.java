package ebebekSalaryCalculator;

public class EmployeeManager {
	private Employee _employee;

	public EmployeeManager(Employee employee) {
		_employee = employee;
	}

	public double tax() {
		double vergi = 0;
		if (_employee.getSalary() >= 1000) {
			vergi = (_employee.getSalary() * 3) / 100;
			return vergi;
		} else {
			return vergi;
		}

	}

	public double bonus() {
		double bonusMoney = 0;
		if (_employee.getWorkHours() > 40) {
			bonusMoney = (int) ((_employee.getWorkHours() - 40) * 30);
			return bonusMoney;

		} else {
			return bonusMoney;
		}
	}

	public double raiseSalary() {
		int currentYear = 2021;
		double raise = 0;
		int workYear = currentYear - _employee.getHireYear();
		if (workYear > 19) {
			raise = _employee.getSalary() * 15 / 100;
			return raise;
		} else if (workYear > 9 && workYear < 20) {
			raise = _employee.getSalary() * 10 / 100;
			return raise;
		} else {
			raise = _employee.getSalary() * 5 / 100;
			return raise;
		}

	}

	public String toString() {
		return "Adı : " + _employee.getName() + "\nMaaşı : " + _employee.getSalary() + "\nÇalışma Saati : "
				+ _employee.getWorkHours() + "\nBaşlangıç Yılı : " + _employee.getHireYear() + "\nVergi : " + tax()
				+ "\nBonus: " + bonus() + "\nMaaş artışı: " + raiseSalary()
				+ "\nVergi ve Bonus ile birlikte toplam maaş : "
				+ (_employee.getSalary() + bonus() + raiseSalary() - tax());
	}

}
