package curriculum_B;

public class Main {
	
	public static void main (String[] args) {
		
		Question5 question5 = new Question5();
		
		// Q1 実行
		question5.helloWorld();
		
		
		// Q2 実行
		int q2Num1 = 10;
		int q2Num2 = question5.doubleValue(q2Num1);
		System.out.println(q2Num1 + " を 2 倍すると " + q2Num2 + " です。");
		
		
		// Q3 実行
		int q3Num1 = 10;
		int q3Num2 = 7;
		
		if (question5.isEven(q3Num1)) {
			System.out.println(q3Num1 + " は偶数です。");
		} else {
			System.out.println(q3Num1 + " は奇数です。");
		}
		
		if (question5.isEven(q3Num2)) {
			System.out.println(q3Num2 + " は偶数です。");
		} else {
			System.out.println(q3Num2 + " は奇数です。");
		}
		
		
		// Q4 実行
		Greeting greeting = new Greeting();
		
		greeting.sayHello();
		
		
		// Q5 実行
		Animal animal = new Animal("ライオン", 2.1, 80);
		
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getBodyLength());
		System.out.println("速度：" + animal.getSpeed());
		
	}

}
