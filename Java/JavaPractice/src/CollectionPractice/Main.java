package JavaPractice.src.CollectionPractice;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Main test = new Main();

    test.arrayList_test();

    CollectionSample collectionMap = new CollectionSample();

    collectionMap.mapCollection();

  }

  public void arrayList_test() {

    ArrayList<String> months = new ArrayList<String>();

    months.add("January");
    months.add("February");
    months.add("March");

    System.out.println("要素数" + months.size());

    for (int i = 0; i < months.size(); ++i) {
      System.out.println(months.get(i));

    }

    months.remove(2);
    System.out.println("要素数" + months.size());

    for (int i = 0; i < months.size(); ++i) {
      System.out.println(months.get(i));

    }

  }

}
