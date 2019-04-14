package ru.Voronuyk.com.CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class Topping1 {
                /*
Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry".
 In all cases, set the key "bread" to have the value "butter".

topping2({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping2({}) → {"bread": "butter"}
topping2({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
     */

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("a","Hi" );
        map.put("b","There" );
        topping1(map);
        System.out.println(map);

        map.put("a","Hi" );
        topping1(map);
        System.out.println(map);

        map.put("b","There" );
        topping1(map);
        System.out.println(map);

    }
    public static Map<String, String> topping1(Map<String, String> map) {
        if (map.get("ice cream") != null ){
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");

        return map;
    }
}
