package ru.Voronuyk.com.CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB3 {
    /*
Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.

mapAB4({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB4({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB4({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
     */

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("a","aaa" );
        map.put("c","cake" );
        mapAB3(map);
        System.out.println(map);

        map.put("b","bbb" );
        map.put("c","cake" );
        map.remove("a");
        mapAB3(map);
        System.out.println(map);

        map.put("a","aaa" );
        map.put("b","bbb" );
        map.put("c","cake" );
        mapAB3(map);
        System.out.println(map);

    }
    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.get("a") != null && map.get("b") !=null ){
            return map;
        }else if (map.get("a") != null){
            map.put("b",map.get("a") );
        }else if (map.get("b") != null){
            map.put("a", map.get("b"));
        }
        return map;
    }
}
