package curriculum.k;

public class SalaryReporter {
	
	public void printSalaryReport(ReceivesSalary employee) {
		if (employee instanceof Employee) {
			System.out.println(((Employee)employee).getName() + " の給与は " + employee.calculateSalary() + " 円");
		} else {
			System.out.println("給与は " + employee.calculateSalary() + " 円");
		}
	}

}
