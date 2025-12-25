package curriculum.c;

import java.util.Random;

public class CPU {
	
	private Random random;
	
	public CPU(Random random) {
		this.random = random;
	}
	
	public int getHand() {
		return random.nextInt(3);
	}
	
	public String getHandName(int hand) {
		return switch (hand) {
			case 0 -> "グー";
			case 1 -> "チョキ";
			case 2 -> "パー";
			default -> "不明";
		};
	}
}
