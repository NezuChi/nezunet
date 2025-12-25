package curriculum.d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Daemon extends Character{
	
	public Daemon(String name, int hp, int at, int sp) {
		super(name, hp, at, sp);
		System.out.println(name + "'sステータス → HP: " + hp + "AT: " + at + "SP: " + sp);
	}
	
	public static Daemon loadDaemonFromFile(String resourcePath) throws IOException {
		try (InputStream is = Daemon.class.getClassLoader().getResourceAsStream(resourcePath);
			 BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
			
			if (is == null) {
				throw new IOException("リソースなし: " + resourcePath + "\nファイル不明");
			}
			
			String nameLine = reader.readLine();
			String hpLine = reader.readLine();
			String atLine = reader.readLine();
			String spLine = reader.readLine();
			
			if (nameLine == null || nameLine.trim().isEmpty() ||
				hpLine == null || hpLine.trim().isEmpty() ||
				atLine == null || atLine.trim().isEmpty() ||
				spLine == null || spLine.trim().isEmpty()) {
				throw new IOException("形式が不完全または無効。全4行が必要。");
			}
			
			String name = nameLine.trim();
			int hp = Integer.parseInt(hpLine.trim());
			int at = Integer.parseInt(atLine.trim());
			int sp = Integer.parseInt(spLine.trim());
			
			return new Daemon(name, hp, at, sp);
			
		} catch (NumberFormatException e) {
			throw new IOException("ステータス値非数値: " + e.getMessage(), e);
		}
	}
}
