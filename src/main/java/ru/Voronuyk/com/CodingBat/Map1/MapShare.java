package ru.Voronuyk.com.CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapShare {
        /*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
In all cases remove the key "c", leaving the rest of the map unchanged.

mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("a","aaa" );
        map.put("b","bbb" );
        map.put("c","ccc" );
        mapShare(map);
        System.out.println(map);

        map.put("c","ccc" );
        map.put("b","xyz" );
        mapShare(map);
        System.out.println(map);

        map.put("a","aaa" );
        map.put("d","hi" );
        map.put("c","meh" );
        mapShare(map);
        System.out.println(map);

    }
    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.get("a") != null){
            map.put("b", map.get("a"));
        }
        if (map.get("c") != null){
            map.remove("c");
        }

        return map;
    }
}
