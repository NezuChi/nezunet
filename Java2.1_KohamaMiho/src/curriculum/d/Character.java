package curriculum.d;

import java.util.Random;

public class Character {
	
	protected String name;
	protected int hp;
	protected int at;
	protected int sp;
	
	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getAt() {
		return at;
	}
	
	public int getSp() {
		return sp;
	}
	
	public void takeDamage(int damage) {
		this.hp -= damage;
		if (this.hp < 0) {
			this.hp = 0;
		}
	}
	
	public boolean isAlive() {
		return this.hp > 0;
	}
	
	public int at() {
		Random ram = new Random();
		int minDam = Math.max(1, (int) (this.at * 0.8));
		int maxDam = (int) (this.at * 1.2);
		
		return ram.nextInt(maxDam - minDam + 1) + minDam;
	}

}
