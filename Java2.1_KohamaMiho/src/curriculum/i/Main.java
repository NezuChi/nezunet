package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee("E001", "佐藤太郎"));
		employees.add(new FullTimeEmployee("E002", "佐藤次郎"));
		
		employees.add(new ContractEmployee("E003", "田中花子"));
		employees.add(new ContractEmployee("E004", "山田花子"));
		
		int houesWorked = 9;
		
		for (Employee employee : employees) {
			int dailyWage = employee.calculateDailyWage(houesWorked);
			
			System.out.println("給与: " + dailyWage + " 円");
		}

	}

}
