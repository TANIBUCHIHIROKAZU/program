package JavaPractice.src.ExceptionPractice2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws Exception {

    try (FileWriter fw = new FileWriter("data.txt");) {
      fw.write("hello!");
    } catch (IOException e) {
      System.out.println("何らかの例外が発生しました。");
    }

    FileWriter fw = null;

    try {
      File file = new File("Java\\JavaPractice\\src\\ExceptionPractice2\\data.txt");
      fw = new FileWriter(file);
      fw.write("hello!テスト");
    } catch (Exception e) {
      System.out.println("何らかのエラー");
    } finally {
      try {
        if (fw != null)
          fw.close();
      } catch (Exception e) {

      }

    }

  }
}
