package curriculum_B;

public class Question5 {

	// Q1
	// 次の条件を満たす メソッド helloWorld を作成してください。
	/* 
	 * 引数なし
	 * 戻り値なし
	 * "Hello, World!" を表示
	 * 実行例
	 * Hello, World!
	 */
	public void helloWorld() {
		System.out.println("Hello, World!");
	}
	
	
	// Q2
	/*
	 * 次の条件を満たす メソッド doubleValue を作成してください。
	 * 引数：整数 (int num)
	 * 戻り値：整数（引数の2倍の値）
	 * 戻り値をもとに実行例のように表示
	 * 実行例
	 * 10 を 2 倍すると 20 です。
	 */
	public int doubleValue(int num) {
		return num * 2;
	}
	
	
	// Q3
	/*
	 * 次の条件を満たす メソッド isEven を作成してください。
	 * 引数：整数 (int num)
	 * 戻り値：true（偶数なら）、false（奇数なら）
	 * num1に7,num2に10を設定し以下の実行例になるように表示
	 * 実行例
	 * 10 は偶数です。
	 * 7 は奇数です。
	 */
	public boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
