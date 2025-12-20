package curriculum.k;

public abstract class Employee implements ReceivesSalary {
	
	protected String name;
	protected int hours;
	
	protected Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public abstract int calculateSalary();
	

}
