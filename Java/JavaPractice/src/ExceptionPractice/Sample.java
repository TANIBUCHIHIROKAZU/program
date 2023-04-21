package JavaPractice.src.ExceptionPractice;

public class Sample {

  private int age;

  public void setAge(int age) {
    if (age < 0) {
      throw new IllegalArgumentException("年齢は正の数を指定すべきです。指定値=" + age);
    }

    this.age = age; // 問題ないなら、フィールドに値をセット
  }

  public int getAge() {

    return this.age;
  }

}
