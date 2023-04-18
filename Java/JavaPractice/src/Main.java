package JavaPractice.src;

import java.util.*;
import JavaPractice.src.Test;

public class Main {
	public static void main(String[] args) {
		System.out.println("開始！");

		try {

			Test a = new Test();

			a.setAge(-128);

			int age = a.getAge();

			if (10 < age) {
				// 試験的に例外を発生させる
				throw new UnsupportedException("サポートしていないです");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println("ここ通ったよ!");
		}

	}
}