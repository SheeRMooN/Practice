package ru.Voronuyk.com.CodingBat.String1;

public class WithoutX2 {
    /*Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
     and otherwise return the string unchanged. This is a little harder than it looks.


    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
    */

    public String withoutX2(String str) {
        if (str.length() == 0 ){
            return "";

        }else if (str.length() == 1 ){
            if (str.equals("x")){
                return "";
            }else {
                return str;
            }
        }else if (str.length() > 1){
            if (str.substring(0,1 ).equals("x")){
                if (str.substring(1,2 ).equals("x")){
                    return str.substring(2,str.length() );
                }else {
                    return str.substring(1,str.length() );
                }
            }else {
                if (str.substring(1,2 ).equals("x")){
                    return str.substring(0,1 )+str.substring(2,str.length() );
                }else {
                    return str;
                }
            }
        }

        return "";
    }
}
