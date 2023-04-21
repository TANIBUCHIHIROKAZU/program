package JavaPractice.src.ExceptionPractice;

public class UnsupportedException extends Exception {
  // エラーメッセージを受け取るコンストラクタ
  public UnsupportedException(String msg) {
    super(msg);
  }
}
