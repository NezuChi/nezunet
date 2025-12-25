package curriculum.d;

import java.io.IOException;
import java.util.Scanner;

public class Question7 {
	
	private static final String DAEMON_STATUS_FILE = "curriculum/d/daemon_status.txt";
	private static final String BATTLE_LOG_FILE = "battle_log.txt";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String playerName = Player.inputPName(sc);
			
			Player player = new Player(playerName);
			System.out.println(player.getName() + " が現れた");
			
			Daemon daemon = Daemon.loadDaemonFromFile(DAEMON_STATUS_FILE);
			System.out.println(daemon.getName() + " が現れた");
			
			Battle battle = new Battle(player, daemon, BATTLE_LOG_FILE);
			battle.start();
		} catch (IOException e) {
			System.out.println("エラー");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("エラー");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("エラー");
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
