package curriculum_B;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Q1
		// int 型の配列 を作成し、1, 2, 3, 4, 5 を格納する
		int[] nums = {1, 2, 3, 4, 5}; 
		
		// 配列の全要素を 順番に表示
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
		// Q2
		// int 型の配列 {10, 20, 30, 40, 50} を用意する
		int[] nums2 = {10, 20, 30, 40, 50};
		
		// 配列の要素を 逆順 に表示
		for (int i = nums2.length - 1; i >= 0; i--) {
			System.out.println(nums2[i]);
		}
		
		
		// Q3
		// int 型の配列 {3, 5, 7, 9, 11} を用意する
		int[] nums3 = {3, 5, 7, 9, 11};
		
		// 配列の全要素の 合計値 を計算し、表示
		int sum = 0;
		for (int i = 0; i < nums3.length; i++) {
			sum = sum + nums3[i];
		}
		System.out.println(sum);
		
		
		// Q4
		// int 型の配列 {12, 7, 9, 21, 5, 18} を用意する
		int[] nums4 = {12, 7, 9, 21, 5, 18};
		
		// 配列の 最大値と最小値 を求めて表示
		int minN = nums4[0];
		int maxN = nums4[0];
		
		for (int i = 1; i < nums4.length; i++) {
			if (nums4[i] < minN) {
				minN = nums4[i];
			}
			if (nums4[i] > maxN) {
				maxN = nums4[i];
			}
		}
		System.out.println(minN);
		System.out.println(maxN);
		
		
		// Q5
		// int 型の配列 {1, 2, 3, 4, 5} を用意する
		int[] nums5 = {1, 2, 3, 4, 5};
		
		// 配列のすべての要素を 2 倍 し、結果を表示
		for (int num5 : nums5) {
			int muNum = num5 * 2;
			System.out.println(muNum);
		}
		
		
		// Q6
		// int 型の配列 {4, 7, 10, 15, 20} を用意する
		int[] nums6 = {4, 7, 10, 15, 20};
		
		// ユーザーがコンソール入力した数が 配列に含まれているか を判定し、結果を表示
		Scanner scanner = new Scanner(System.in);
		int ipNum = scanner.nextInt();
		scanner.close();
		
		boolean fd = false;
		for (int num6 : nums6) {
			if (num6 == ipNum) {
				fd = true;
				break;
			}
		}
		
		// 結果：（”入力した値”は配列に含まれています／含まれていません）
		if (fd) {
			System.out.println("結果： " + ipNum + "は配列に含まれています");
		} else {
			System.out.println("結果： " + ipNum + "は配列に含まれていません");
		}
		
		
		// Q7
		// 2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意する
		int[][] array = {
			{1, 2},
			{3, 4},
			{5, 6}
		};
		
		// 配列の すべての要素を表示
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// Q8
		// 2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意する
		array = new int[][] {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
			};
		
		// 配列の すべての要素の合計値を表示
		sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println(sum);
		
		
		// Q9
		// 2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意する
		array = new int[][] {
			{12, 15, 8},
			{6, 19, 25},
			{30, 2, 10}
		};
		
		// 配列内の 最大値と最小値 を求めて表示
		minN = array[0][0];
		maxN = array[0][0];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < minN) {
					minN = array[i][j];
				}
				if (array[i][j] > maxN) {
					maxN = array[i][j];
				}
			}
		}
		System.out.println(minN);
		System.out.println(maxN);
		
		
		// Q10
		// 3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意する
		int[][][] array2 = {
			{
				{1, 2}, {3, 4}
			},
			{
				{5, 6}, {7, 8}
			}
		};
		
		// 配列内のすべての要素を 表示
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				for (int k = 0; k < array2[i][j].length; k++) {
					System.out.print(array2[i][j][k] + " ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
