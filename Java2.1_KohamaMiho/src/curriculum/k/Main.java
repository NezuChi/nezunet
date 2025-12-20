package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("田中 太郎", 160));
		employees.add(new ContractEmployee("鈴木 花子", 150));
		employees.add(new FullTimeEmployee("佐藤 次郎", 170));
		
		SalaryReporter reporter = new SalaryReporter();
		
		for (Employee emp : employees) {
			reporter.printSalaryReport(emp);
		}
	
	}

}
