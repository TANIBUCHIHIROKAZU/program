package JavaPractice.src.FileReadWritePractice;

import java.io.FileReader;

public class Main {
  public static void main(String[] args) throws Exception {
    FileReader reader = new FileReader("data.txt");
    int input = reader.read();
    while (input != -1) {
      System.out.println((char) input);
      input = reader.read();
    }
  }
}
