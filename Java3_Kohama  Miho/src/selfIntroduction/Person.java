package selfIntroduction;

class Person{
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	
	private static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}
	
	double bmi() {
		return this.weight / (this.height * this.height);
	}
	
	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年齢は" + this.age+ "です");
		System.out.printf("BMIは%.2f\nです", this.bmi());
	}
	
	public static int getCount() {
		return Person.count;
	}
}
