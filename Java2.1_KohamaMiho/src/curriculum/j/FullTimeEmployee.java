package curriculum.j;

public class FullTimeEmployee extends Employee {
	
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1250;
		int overTimeHours = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overTimeHours;
		int rerularWage = regularHours * hourlyRate;
		int overTimeWage = (int)(overTimeHours * hourlyRate * 1.25);
		
		return rerularWage + overTimeWage;
	}

}
