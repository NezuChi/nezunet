package curriculum.d;

import java.util.Random;
import java.util.Scanner;

public class Player extends Character {
	
	public Player(String name) {
		super(name,
			  new Random().nextInt(50) + 100,
			  new Random().nextInt(10) + 15,
			  new Random().nextInt(5) + 5);
		System.out.println(name + "'sステータス → HP:" + hp + " AT:" + at + " SP: " + sp);
	}
	
	public static String inputPName(Scanner sc) {
		System.out.print("プレイヤー名を入力 → ");
		return sc.nextLine();
	}

}
