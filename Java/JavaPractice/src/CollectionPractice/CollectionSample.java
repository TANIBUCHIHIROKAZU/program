package JavaPractice.src.CollectionPractice;

import java.util.HashMap;

public class CollectionSample {

  public void mapCollection() {
    HashMap<String, String> map = new HashMap<String, String>();

    map.put("first name", "太郎");
    map.put(CollectionInterface.USERID, "W00001");
    map.put(CollectionInterface.NICKNAME, "tanibuchi");
    map.put(CollectionInterface.JYUSHO, "三重県");

    System.out.println(map.entrySet());
    System.out.println(map.values());
    System.out.println(map.keySet());
    System.out.println(map.get(CollectionInterface.USERID));

  }

}
