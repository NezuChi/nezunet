package curriculum.c;

public class Janken {
	
	private Player player;
	private CPU cpu;
	
	public Janken(Player player, CPU cpu) {
		this.player = player;
		this.cpu = cpu;
	}
	
	public void startGame() {
		while (true) {
			int playerHand = player.getHand();
			int cpuHand = cpu.getHand();
			
			System.out.println("あなたの手: " + player.getHandName(playerHand));
			System.out.println("CPUの手: " + cpu.getHandName(cpuHand));
			
			String result = getResult(playerHand, cpuHand);
			System.out.println(result);
			
			if (result.equals("あなたの勝ち！")) {
				break;
			}
		}
	}
	
	private String getResult(int pHand, int cHand) {
		if (pHand == cHand) {
			return "あいこでしょ！";
		} else if (
				(pHand == 0 && cHand == 1) ||
				(pHand == 1 && cHand == 2) ||
				(pHand == 2 && cHand == 0)
			) {
			return "あなたの勝ち！";
		} else {
			return "CPUの勝ち！";
		}
	}

}
