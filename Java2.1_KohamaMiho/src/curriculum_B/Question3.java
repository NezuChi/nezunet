package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Q1
		// for 文を使って 1 から 10 までの数字を 1 つずつ表示
		for (int num1 = 1; num1 <= 10; num1++) {
			System.out.println(num1);
		}
		
		
		// Q2
		// for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示
		for (int num2 = 2; num2 <= 20; num2 += 2) {
			System.out.println(num2);
		}
		
		
		// Q3
		// for 文を使って 10 から 1 まで カウントダウンして表示
		for (int num3 = 10; num3 >= 1; num3--) {
			System.out.println(num3);
		}
		
		
		// Q4
		// for 文を使って 1 から 100 までの合計 を表示
		int sum = 0;
		for (int num4 = 1; num4 <= 100; num4++) {
			sum += num4;
		}
		System.out.println(sum);
		
		
		/* Q5
		 * for 文を使って 以下のような三角形を出力
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for (int st = 0; st < 5; st++) {
			for (int st1 = 0; st1 <= st; st1++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// Q6
		// while 文を使って 1 から 10 まで を 1 つずつ表示 
		int num6 = 1;
		while (num6 <= 10) {
			System.out.println(num6);
			num6++;
		}
		
		
		// Q7
		// while 文を使って 2 から 20 までの偶数 を 1 つずつ表示
		int num7 = 2;
		while (num7 <= 20) {
			System.out.println(num7);
			num7 += 2;
		}
		
		
		// Q8
		// while 文を使って 10 から 1 まで のカウントダウンを表示
		int num8 = 10;
		while (num8 >= 1) {
			System.out.println(num8);
			num8--;
		}
		
		
		// Q9
		// while 文を使って 1 から 100 までの合計 を表示
		sum = 0;
		int num9 = 1;
		while (num9 <= 100) {
			sum += num9;
			num9++;
		}
		System.out.println(sum);
		
		
		// Q10
		// ユーザーから数値をコンソール入力してもらう
		Scanner scanner = new Scanner(System.in);
		int num10 = scanner.nextInt();
		
		// 入力が 0 になるまで 何度でも入力を受け付ける
		while (num10 != 0) {
			num10 = scanner.nextInt();
		}
		
		// 0が入力されたら「終了しました」と表示
		System.out.println("「終了しました」");
		scanner.nextLine();
		
		
		// Q11
		// for文を使用して下記の通りに出力してください
		for (int s = 1; s <= 9; s++) {
			for (int n = 1; n <= 9; n++) {
				int num11 = s * n;
				System.out.print(String.format("%02d", s) + " * " + String.format("%02d", n) + " = " + String.format("%02d", num11));
				if (n < 9) {
					System.out.print(" || ");
				}
			}
			System.out.println();
		}
		
		
		/* Q12
		 * 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		 * ・拡張for文・Switch文・条件演算子を使用すること ※普通のif文は使用不可
		 * ・Switch文内でテレビとディスプレイは続けて書き、条件演算子で各項目を出力される値を変更してください
		 * ・テレビとディスプレイは同じ商品扱いとし、二つの合計値は常に11になるようにしてください。
		 * ・例：テレビと受け取った場合、→「テレビの残り台数は〇台です」※〇はランダムで出た数字 ディスプレイは（11-〇）の値
		 * ・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
		 * ・入力された値は「、 」区切りで指定してください
		 * ・そのほかの値が入力された場下記を出力されるようにしてください
		 * 『受け取った値』は指定の商品ではありません
		 * ・残り台数は0〜11までのランダムな値が出力されるようにしてください
		 */
		// ランダムな値を出す
		Random random = new Random();
		
		// テレビとディスプレイの在庫を連動させるための変数
		// コンソールで初めてテレビかディスプレイを入力したときに設定
		int tvSt = -1;
		
		// 補助メッセージ
		System.out.println("商品名を「、」区切で入力。例: パソコン、テレビ、冷蔵庫");
		System.out.println("終了するには 'おわる' と入力。");
		
		// 繰り返し入力を受け付ける
		while (true) {
			
			// 入力欄
			System.out.print("> ");
			
			// コンソールの一行入力を受け取る
			String sh12 = scanner.nextLine();
			
			// "おわる"で終了
			if (sh12.equalsIgnoreCase("おわる")) {
				System.out.println("終了");
				break;
			}
			
			//「、」で分割
			String[] shs = sh12.split("、");
			
			// 改行
			System.out.println();
			
			// 分割された商品ごとに処理
			for (String sh : shs) {
				
				// 前後の空白を削除
				sh = sh.trim();
				
				// 空の文字列ができた場合はスキップ
				if (sh.isEmpty()) {
					continue; 
				}
				
				// 商品の数
				int st;
				
				// 出力メッセージ
				String mm;
				
				// 商品ごとの処理
				switch (sh) {
				case "パソコン": case "冷蔵庫": case "扇風機": case "洗濯機": case "加湿器":
					st = random.nextInt(12);
					mm = sh + "の残り台数は" + st + "台です";
					break;
				
				// テレビとディスプレイの処理
				case "テレビ": case "ディスプレイ":
					
					// 条件演算子（三項演算子）
					tvSt = (tvSt == -1) ? random.nextInt(12) : tvSt;
					st = (sh.equals("テレビ")) ? tvSt : 11 - tvSt;
					mm = sh + "の残り台数は" + st + "台です";
					break;
				
				// その他の商品の処理
				default:
					mm = "『" + sh + "』は指定の商品ではありません";
					break;
				}
				
				// メッセージの出力
				System.out.println(mm);
			}
			
			// 改行
			System.out.println();
		}
		
		scanner.close();
    }
	
	

}
