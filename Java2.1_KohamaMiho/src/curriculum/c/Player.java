package curriculum.c;

import java.util.Scanner;

public class Player {
	
	private Scanner scanner;
	
	public Player(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getHand() {
        while (true) {
            System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
            int playerInput = scanner.nextInt(); 

            if (playerInput >= 0 && playerInput <= 2) {
                return playerInput;
            } else {
                System.out.println("0, 1, 2 を入力。");
            }
        }
    }
    
    public String getHandName(int hand) {
        return switch (hand) {
            case 0 -> "グー";
            case 1 -> "チョキ";
            case 2 -> "パー";
            default -> "不明な手";
        };
    }

}
