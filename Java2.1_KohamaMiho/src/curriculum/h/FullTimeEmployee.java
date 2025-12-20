package curriculum.h;

public class FullTimeEmployee extends Employee {
	
	private static final int HOURLY_RATE = 1200;
	
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int regularHours = Math.min(hoursWorked, 8);
		int overtimeHours = Math.max(0, hoursWorked - 8);
		
		int regularWage = regularHours * HOURLY_RATE;
		int overtimeWage = (int)(overtimeHours * HOURLY_RATE * 1.25);
		
		return regularWage + overtimeWage;
	}

}
