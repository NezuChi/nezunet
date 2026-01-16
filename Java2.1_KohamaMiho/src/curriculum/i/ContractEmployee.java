package curriculum.i;

public class ContractEmployee extends Employee {
	
	public static final int HOURLY_RATE = 1000;
	
	public ContractEmployee(String id, String name) {
		super(id, name);
	}
	
		@Override
		public int calculateDailyWage(int hoursWorked) {
		
		return hoursWorked * HOURLY_RATE;
	}
}
