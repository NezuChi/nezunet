package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1 各型の変数を宣言し、初期値を設定してください。
		// 変数byteNumの初期値を設定
		byte byteNum = 0;
		
		// 変数shortNumの初期値を設定
		short shortNum = 0;
		
		// 変数intNumの初期値を設定
		int intNum = 0;
		
		// 変数longNumの初期値を設定
		long longNum = 0L;
		
		// 変数floatNumの初期値を設定
		float floatNum = 0.0f;
		
		// 変数doubleNumの初期値を設定
		double doubleNum = 0.0d;
		
		// 変数letterの初期値を設定
		char letter = '\u0000';
		
		// 変数lettersの初期値を設定
		String letters = null;
		
		// 変数isBooleanの初期値を設定
		boolean isBoolean = false;
		
		
		// Q2 Q1で宣言した各型の変数に指定された値を代入してください
		// 変数byteNumに10を代入
		byteNum = 10;
		
		// 変数shortNumに100を代入
		shortNum = 100;
		
		// 変数intNumに1000を代入
		intNum = 1000;
		
		// 変数longNumに10000を代入
		longNum = 10000;
		
		// 変数floatNumに9.5fを代入
		floatNum = 9.5f;
		
		// 変数doubleNumに10.5を代入
		doubleNum = 10.5;
		
		// 変数letterに"a"を代入
		letter = 'a';
		
		// 変数lettersに"ハロー"を代入
		letters = "ハロー";
		
		// 変数isBooleanにtrueを代入
		isBoolean = true;
		
		
		// Q3 Q2の値を代入した変数を用いて出力をしてください
		// 出力：11110　出力条件：変数を用いて右記を出力
		// shortNumに11110を代入
		shortNum = 11110;
		
		// shortNumを出力
		System.out.println(shortNum);
		
		
		// 出力：20　出力条件：変数を用いて右記を出力
		// byteNumに20を代入
		byteNum = 20;
		
		// byteNumを出力
		System.out.println(byteNum);
		
		
		// 出力：a ハロー true　出力条件：変数を用いて右記を出力(間に半角スペース入れる)
		// 半角スペースを入れてa ハロー trueを出力
		System.out.println(letter + " " + letters + " " + isBoolean);
		
		
		// 出力：11130　出力条件：数字を全て足して右記を出力
		// shotNumとbyteNumを足して出力
		System.out.println(shortNum + byteNum);
		
		
		// 出力：1E+10　出力条件：小数点以外の数字を全てかけて右記を出力
		// 少数以外を乗算して出力
		System.out.println(byteNum * shortNum * intNum * longNum);
		
		
		// 出力：0.105　出力条件：10.5 割る100をして右記を出力
		// 10.5/100を出力
		System.out.println(doubleNum / 100);
		
		// 出力：-90　出力条件：10 引く100をして右記を出力
		// byteNumに10を代入
		byteNum = 10;
		
		// 10-100を出力
		System.out.println(byteNum - 100);
		
		/* Q4
		 * name という String型の変数 を宣言し
		 * その変数に "山田太郎" という値を代入してください。
		 * name変数を使用してコンソールに こんにちは、山田太郎さん! と出力してください。
		 */
		// naneを宣言し"山田太郎"を代入
		String name = "山田太郎";
		
		// こんにちは、山田太郎さん！ と出力
		System.out.println("こんにちは、" + name + "さん！");
		
		
		/* Q5
		 * age という int型の変数 を宣言し
		 * その変数に 25 を代入してください。
		 * age変数を使用してコンソールに 年齢: 25歳 という出力してください。
		 */
		// ageに25を代入
		int age = 25;
		
		// 年齢: 25歳 と出力
		System.out.println("年齢:" + age + "歳");
		
		
		/* Q6
		 * num1 という int型の変数 を宣言し、10 を代入
		 * num2 という int型の変数 を宣言し、5 を代入
		 * num1 と num2 を足した結果を sum という変数に代入し、コンソールに出力してください。
		 */
		// num1に10を代入
		int num1 = 10;
		
		// num2に5を代入
		int num2 = 5;
		
		// num1とnum2を足してsumに代入
		int sum = num1 + num2;
		
		// sumを出力
		System.out.println(sum);
		
		
		/* Q7
		 * score という int型の変数 を宣言し、80 を代入
		 * score に 20 を加えて、更新する
		 * 最終スコア: 100 をscoreを使用してコンソールに出力してください。
		 */
		// scoreに80を代入
		int score = 80;
		
		// scoreに20を加えて更新
		score = score + 20;
		
		// 最終スコア: 100を出力
		System.out.println("最終スコア: " + score);
		
		
		/* Q8
		 * price という double型の変数 を宣言し、99.99 を代入
		 * price を int型 に変換し、整数価格: 99 とコンソールに出力してください。
		 */
		// priceに99.99を代入
		double price = 99.99;
		
		// priceをint型に変換
		int price1 = (int) price;
		
		// 整数価格: 99を出力
		System.out.println("整数価格: " + price1);
		
		
		/* Q9
		 * String 型の変数 numStr に "123" を代入
		 * numStr を int 型に変換し、
		 * 変換後の値: の後ろにnumStr + 10 した結果をコンソールに出力してください。
		 */
		// numStrに"123"を代入
		String numStr = "123";
		
		// numStrをint型に変換
		int numStr1 = Integer.parseInt(numStr);
		
		// 変換後の値: にnumStr + 10の結果を出力
		System.out.println("変換後の値: " + (numStr1 + 10));
		
		
		/* Q10
		 * int 型の変数 num に 50 を代入
		 * num を String 型に変換し、"得点: 50点" の形で出力
		 */
		// numに50を代入
		int num = 50;
		
		// numをString型に変換
		String strNum = String.valueOf(num);
		
		// 得点: 50点を出力
		System.out.println("得点: " + strNum + "点");
		
		
		/* Q11
		 * 次の条件を満たすプログラムを条件演算子を使用して作成してください。
		 * int 型の変数 a に 10 を代入
		 * int 型の変数 b に 20 を代入
		 * a が b より小さいかどうかを boolean 変数 result に代入
		 * result の値を出力
		 */
		// aに10を代入
		int a = 10;
		
		// bに20を代入
		int b = 20;
		
		// aがbより小さいかをresultに代入
		boolean result = a < b;
		
		// resultを出力
		System.out.println(result);
		
		
		/* Q12
		 * 条件演算子（三項演算子）を使用してください。
		 * int 型の変数 x に 15 を代入 
		 * x が 10 以上なら "OK"、そうでなければ "NG" を出力 
		 */
		// xに15を代入
		int x = 15;
		
		// xが10以上ならOK、そうでなければNG
		String s = (x >= 10) ? "OK" : "NG";
		
		// 結果を出力
		System.out.println(s);
		
		/* Q13
		 * String text = "私はJavaが好きです。Javaは楽しい!";という
		 * 文章の中にある 「Java」 を 「Python」 に置き換えて出力させてください。
		 */
		// textを定義
		String text = "私はJavaが好きです。Javaは楽しい!";
		
		// "Java"を"Python"に置き換え
		String text2 = text.replace("Java", "Python");
		
		// 置き換えたテキストを出力
		System.out.println(text2);

	}

}
