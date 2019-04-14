package ru.Voronuyk.com.CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {
                            /*
Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.

mapAB4({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB4({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB4({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
     */

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("a","aaa" );
        map.put("b","aaa" );
        map.put("c","cake" );
        mapAB2(map);
        System.out.println(map);

        map.put("a","aaa" );
        map.put("b","aaa" );
        mapAB2(map);
        System.out.println(map);

        map.put("a","aaa" );
        map.put("b","aaa" );
        map.put("c","aaa" );
        mapAB2(map);
        System.out.println(map);

    }
    public static Map<String, String> mapAB2(Map<String, String> map) {
        if ((map.get("a") != null && map.get("b") != null) && map.get("a").equals(map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}
