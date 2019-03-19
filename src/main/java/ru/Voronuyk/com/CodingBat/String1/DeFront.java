package ru.Voronuyk.com.CodingBat.String1;

public class DeFront {
   /* Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the
    second char if it is 'b'. The string may be any length. Harder than it looks.


    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay"
    */

    public String deFront(String str) {
        int length = str.length();

        if (length == 0) {
            return "";

        } else if (length == 1) {
            if (str.equals("a")) {
                return "a";
            } else
                return "";

        } else if (length == 2) {
            if (str.substring(0, 1).equals("a")) {
                if (str.substring(1, 2).equals("b"))
                    return "a" + "b" + str.substring(2, length);
                return "a" ;
            } else if (str.substring(1, 2).equals("b"))
                return "b";
            return "";

        } else {
            if (str.substring(0, 1).equals("a")) {
                if (str.substring(1, 2).equals("b"))
                    return "a" + "b" + str.substring(2, length);
                return "a" + str.substring(2, length);
            } else if (str.substring(1, 2).equals("b")) {
                return "b" + str.substring(2, length);
            }else
                return str.substring(2,length );
        }
    }
}
