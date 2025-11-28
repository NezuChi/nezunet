package curriculum_B;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Q1 
		// int 型変数 score に 75 を代入
		int score = 75;
		
		// score が 60 以上なら "合格です！" と表示
		if (score >= 60) {
			System.out.println("合格です！");
		}
		
		
		// Q2 
		// int 型変数 age に 25 を代入
		int age = 25;
		
		// age が 20 以上 30 以下なら "適正年齢です" と表示
		if (age >= 20 && age <= 30 ) {
			System.out.println("適正年齢です");
		 
		// それ以外場合 "対象外です" と表示
		} else {
			System.out.println("対象外です");
		}
		
		
		// Q3
		// int 型変数 age に 18 を代入
		age = 18;
		
		// age が 20 以上なら "成人です" と表示
		if (age >= 20 ) {
			System.out.println("成人です");
			
		// age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
		} else if ( age >= 13 && age <= 19 ) {
			System.out.println("ティーンエイジャーです");
			
		// age が 12 以下なら "子供です" と表示
		} else if ( age <= 12 ) {
			System.out.println("子供です");
		}
		
		
		// Q4
		// int 型変数 x, y, z に 30, 15, 50 を代入
		int x = 30;
		int y = 15;
		int z = 50;
		
		// 一番大きい数値を判定して表示
		// xが一番大きい場合
		if ( x > y && x > z ) {
			System.out.println(x);
			
		// yが一番大きい場合
		} else if ( y > x && y > z ) {
			System.out.println(y);
			
		// zが一番大きい場合
		} else {
			System.out.println(z);
		}
		
		
		Scanner scanner = new Scanner(System.in);
		// Q5
		// int 型変数 num を用意 コンソール入力でいずれか値を代入し
		int num = scanner.nextInt();
		
		// num 値が 0 より大きけれ "正の数です" と表示
		if ( num > 0 ) {
			System.out.println("正の数です");
			
		// num 値が 0 なら "0 です" と表示
		} else if ( num == 0 ) {
			System.out.println("0 です");
			
		// num 値が 0 より小さけれ "負の数です" と表示
		} else if ( num < 0 ) {
			System.out.println("負の数です");
		}
		
		
		// Q6
		// int 型変数 value を用意 コンソール入力でいずれか値を代入し
		int value = scanner.nextInt();
		
		// value が 偶数 なら "偶数です" と表示
		if ( value % 2 == 0 ) {
			System.out.println("偶数です");
			
		// value が 奇数 なら "奇数です" と表示
		} else {
			System.out.println("奇数です");
		}
		
		
		// Q7
		// int 型変数 score にコンソール入力で 0 から 100 いずれか数値を代入し
		score = scanner.nextInt();
				
		// 90 以上なら "優"
		if ( score >= 90 ) {
			System.out.println("優");
			
		// 70 以上なら "良"
		} else if ( score >= 70 ) {
			System.out.println("良");
			
		// 50 以上なら "可"
		} else if ( score >= 50 ) {
			System.out.println("可");
			
		// 50 未満なら "不可" を表示
		} else {
			System.out.println("不可");
		}
		
		
		// Q8
		// コンソール入力が null また空文字（""）ときに「入力が無効です」と表示する処理を作成してください
		
		scanner.nextLine();
		String line = scanner.nextLine();
		
		if ( line == null || line.isEmpty()) {
			System.out.println("「入力が無効です」");
		}
		
		
		// Q9
		// int 型変数 day を用意（コンソール入力で1～7 いずれか数値を代入）
		int day = scanner.nextInt();
		
		// day 値に応じて曜日を表示
		switch (day) {
		
		// 1 → "月曜日"
		case 1:
			System.out.println("月曜日");
			break;
			
		// 2 → "火曜日"
		case 2:
			System.out.println("火曜日");
			break;
			
		// 3 → "水曜日"
		case 3:
			System.out.println("水曜日");
			break;
			
		// 4 → "木曜日"
		case 4:
			System.out.println("木曜日");
			break;
			
		// 5 → "金曜日"
		case 5:
			System.out.println("金曜日");
			break;
			
		// 6 → "土曜日"
		case 6:
			System.out.println("土曜日");
			break;
			
		// 7 → "日曜日"
		case 7:
			System.out.println("日曜日");
			break;
				
		// それ以外値なら "無効な入力です" と表示
		default:
			System.out.println("無効な入力です");
		}
		
		
		// Q10
		// int 型変数 month を用意（コンソール入力で1～12 いずれか数値を代入）
		int month = scanner.nextInt();
		
		// month 値に応じて季節を表示
		switch (month) {
		
		// 12, 1, 2 → "冬"
		case 12: case 1: case 2:
			System.out.println("冬");
			break;
			
		// 3, 4, 5 → "春"
		case 3: case 4: case 5:
			System.out.println("春");
			break;
			
		// 6, 7, 8 → "夏"
		case 6: case 7: case 8:
			System.out.println("夏");
			break;
		
		// 9, 10, 11 → "秋"
		case 9: case 10: case 11:
			System.out.println("秋");
			break;
			
		// それ以外値なら "無効な月です" と表示
		default:
			System.out.println("無効な月です");
		}
		
		
		scanner.close();
		
	}
		

}
