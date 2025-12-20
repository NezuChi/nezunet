package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Billable> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee("E001", "田中 太郎"));
		employees.add(new ContractEmployee("C001", "鈴木 花子"));
		employees.add(new FullTimeEmployee("E002", "佐藤 次郎"));
		employees.add(new ContractEmployee("C002", "高橋 健太"));
		
		for (Billable employee : employees) {
			System.out.println(employee.costForDay(9) + " 円");
		}

	}

}
