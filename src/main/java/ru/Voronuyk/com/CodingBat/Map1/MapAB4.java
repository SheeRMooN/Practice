package ru.Voronuyk.com.CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB4 {
        /*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value.
 If the values exist and have the same length, change them both to the empty string in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
     */

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");
        mapAB4(map);
        System.out.println(map);

        map.put("a", "aa");
        map.put("b", "bbb");
        map.put("c", "cake");
        mapAB4(map);
        System.out.println(map);

        map.put("a", "aa");
        map.put("b", "bbb");
        map.remove("c");
        mapAB4(map);
        System.out.println(map);

    }

    public static Map<String, String> mapAB4(Map<String, String> map) {

        if (map.get("a") == null | map.get("b") == null) {
            return map;
        } else if (map.get("a").length() == map.get("b").length()) {
            map.put("a", "");
            map.put("b", "");
        } else if (map.get("a").length() > map.get("b").length()) {
            map.put("c", map.get("a"));
        } else if (map.get("a").length() < map.get("b").length()) {
            map.put("c", map.get("b"));
        }
        return map;
    }
}

