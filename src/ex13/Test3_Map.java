package ex13;

import java.util.HashMap;
import java.util.Map;

public class Test3_Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        System.out.println(map.get("lee"));

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }

        map.remove(3);
        map.put("choe", "password");
        System.out.println(map);

    }
}
