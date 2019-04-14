package ru.Voronuyk.com.CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class Topping2 {
                    /*
Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value,
set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".

topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
     */

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("ice cream","cherry" );
        topping2(map);
        System.out.println(map);

        map.put("spinach","dirt" );
        map.put("ice cream","cherry" );
        topping2(map);
        System.out.println(map);

        map.put("yogurt","salt" );
        topping2(map);
        System.out.println(map);

    }
    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.get("ice cream") != null ){
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.get("spinach") != null ){
            map.put("spinach", "nuts");
        }

        return map;
    }
}
