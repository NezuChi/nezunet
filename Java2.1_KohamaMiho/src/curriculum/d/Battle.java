package curriculum.d;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Battle {
	
	private Character player;
	private Character daemon;
	private PrintWriter logWriter;
	private Random ram = new Random();
	
	public Battle(Character player, Character daemon, String logFilePath) throws IOException {
		this.player = player;
		this.daemon = daemon;
		this.logWriter = new PrintWriter(new FileWriter(logFilePath, false));
	}
	
	public void start() {
		log("開始");
		log(player.getName() + " (HP: " + player.getHp() + ", AT: " + player.getAt() + ", SP: " + player.getSp() + ")");
		log(daemon.getName() + " (HP: " + daemon.getHp() + ", AT: " + daemon.getAt() + ", SP: " + daemon.getSp() + ")");
		
		Character firstAtr = determineFirstAtr();
		Character secondAtr = (firstAtr == player) ? daemon : player;
		
		log(firstAtr.getName() + " が先攻");
		
		int turn = 1;
		
		while (player.isAlive() && daemon.isAlive()) {
			log("ターン　" + turn);
			
			// At＝Attack、Atr＝Attacker　長いため表記を省略
			perfomeAt(firstAtr, secondAtr);
			
			if (!secondAtr.isAlive()) {
				break;
			}
			
			perfomeAt(secondAtr, firstAtr);
			
			if (!firstAtr.isAlive()) {
				break;
			}
			
			logStatus();
			turn++;
		}
		
		log("終了");
		
		if (player.isAlive()) {
			log(player.getName() + "は " + daemon.getName() + "を倒した");
		} else {
			log(daemon.getName() + "は " + player.getName() + "を倒した");
		}
	
		log("END");
		logWriter.close();
	}
	
	private Character determineFirstAtr() {
		if (player.getSp() > daemon.getSp()) {
			return player;
		} else if (daemon.getSp() > player.getSp()) {
			return daemon;
		} else {
			if (ram.nextBoolean()) {
				return player;
			} else {
				return daemon;
			}
		}
	}
	
	private void perfomeAt(Character atr, Character dfr) {
		int damage = atr.at();
		dfr.takeDamage(damage);
		
		log(atr.getName() + " の攻撃で" + dfr.getName() + " に " + damage + " のダメージ");
		log(dfr.getName() + " の残りHP: " + dfr.getHp());
	}
	
	private void logStatus() {
		log(player.getName() + " HP:" + player.getHp());
		log(daemon.getName() + " HP:" + daemon.getHp());
	}
	
	private void log(String masse) {
		System.out.println(masse);
		logWriter.println(masse);
	}

}
