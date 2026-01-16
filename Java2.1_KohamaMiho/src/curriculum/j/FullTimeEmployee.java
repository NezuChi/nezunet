package curriculum.j;

public class FullTimeEmployee extends Employee {
	
	public static final int HOURLY_RATE = 1250;
	
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		int overTimeHours = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overTimeHours;
		int regularWage = regularHours * HOURLY_RATE;
		int overTimeWage = (int)(overTimeHours * HOURLY_RATE * 1.25);
		
		return regularWage + overTimeWage;
	}

}
