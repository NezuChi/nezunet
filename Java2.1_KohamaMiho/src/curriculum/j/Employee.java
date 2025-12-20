package curriculum.j;

public abstract class Employee implements Billable {
	
	protected String id;
	protected String name;
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// 以下今回は出力なし
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
