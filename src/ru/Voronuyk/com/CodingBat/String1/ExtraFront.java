package ru.Voronuyk.com.CodingBat.String1;

public class ExtraFront {

  /*  Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.
*/

    public String extraFront(String str) {
        String result ="";

        if(str.length() < 2){
            if(str.length() < 1){
                return   "";

            }
            result = str.substring(0, 1);

        }else {
            result = str.substring(0, 2);
        }


        return result+result+result;
    }

}
