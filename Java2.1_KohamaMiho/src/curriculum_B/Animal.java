package curriculum_B;

public class Animal {
	
	// Q5
	/*
	 * 次の2つのクラスを作成し、下記がコンソールに出力されるように作成してください
	 * ※thisとsetterとgetterとフィールドを使ってください
	 * 動物名：ライオン
	 * 体長：2.1m
	 * 速度：80km/h
	 * Animal .java (別のクラス)
	 * 動物名、体長、速度の変数を持ち各変数のgetterとsetterを作成
	 * Main.java
	 * 変数の中身を設定し、出力の処理を行う
	 */
	private String name;
	private double bodyLength;
	private int speed;
	
	public Animal(String name, double bodyLength, int speed) {
		this.name = name;
		this.bodyLength = bodyLength;
		this.speed = speed;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBodyLength() {
		return this.bodyLength;
	}
	
	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
