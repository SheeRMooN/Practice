package ru.Voronuyk.com.CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB {
            /*
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
If both keys are present, append their 2 string values together and store the result under the key "ab".

mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
     */

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("a","Hi" );
        map.put("b","There" );
        mapAB(map);
        System.out.println(map);

        map.put("a","Hi" );
        mapAB(map);
        System.out.println(map);

        map.put("b","There" );
        mapAB(map);
        System.out.println(map);

    }
    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.get("a") != null && map.get("b") !=null){
            map.put("ab", map.get("a")+ map.get("b"));
        }

        return map;
    }
}
