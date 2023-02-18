public class Main {
	public static void main(String[] args) {
		System.out.println("開始！");

		// 召喚！
		Pikachu p = new Pikachu();
		// まずは自己紹介をしよう
		p.name = "わたし";
		p.hp = 100;

		System.out.println("わたしは" + p.name + "です。あなたを倒す！");

		// 召喚
		Kabigon k = new Kabigon();

		// 自己紹介
		k.name = "友人a";
		k.hp = 100;

		System.out.println("わたしは" + k.name + "です。あなたを倒す！");

		p.attack(k);
		k.sleep();
	}
}