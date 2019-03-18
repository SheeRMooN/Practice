package ru.Voronuyk.com.CodingBat.String1;

public class WithoutX {
    /*
    Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
     and otherwise return the string unchanged.


    withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi"
    */
    public String withoutX(String str) {

        if (str.length() == 0){
            return "";

        }else if (str.length() == 1){
            if (str.equals("x")){
                return "";
            }else {
                return str;
            }

        }else {
            if (str.substring(0,1 ).equals("x")){
                if (str.substring(str.length()-1,str.length() ).equals("x")){
                    return str.substring(1,str.length()-1 );
                }else {
                    return str.substring(1,str.length() );
                }
            }else if (str.substring(str.length()-1,str.length()).equals("x")){
                return str.substring(0,str.length()-1 );
            }else {
                return str;
            }
        }

    }
}
