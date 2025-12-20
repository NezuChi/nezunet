package curriculum.h;

public class Main {

	public static void main(String[] args) {
		
		FullTimeEmployee fullTimer = new FullTimeEmployee("E001", "佐藤太郎");
		PartTimeEmployee partTimer = new PartTimeEmployee("E002", "田中花子");
		
		int hours = 9;
		
		int fullTimeWage = fullTimer.calculateDailyWage(hours);
		System.out.println("正社員の給料: " + fullTimeWage + " 円");
		
		int partTimeWage = partTimer.calculateDailyWage(hours);
		System.out.println("パート社員の給料: " + partTimeWage + " 円");

	}

}
