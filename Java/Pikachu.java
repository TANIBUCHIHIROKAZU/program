public class Pikachu {

  String name; // 名前
  int leveL; // レベル
  int hp; // 体力
  int trouble; // 状態異常
  boolean canAttack; // 攻撃が可能か？

  // たいあたり
  public void attack() {
    System.out.println("aa");
  }

  // 眠る
  public void sleep() {
    this.hp += 10;
    System.out.println(this.name + "は" + this.hp + "になった");
  }

}
