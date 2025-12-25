package curriculum.c;

import java.util.Random;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		Player player = new Player(scanner);
		CPU cpu = new CPU(random);
		
		Janken janken = new Janken(player, cpu);
		
		janken.startGame();
		
		scanner.close();
		

	}

}
