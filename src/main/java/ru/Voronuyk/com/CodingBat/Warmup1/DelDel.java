package ru.Voronuyk.com.CodingBat.Warmup1;

public class DelDel {
    /*Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
    Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
     */
    public static void main(String[] args) {
        delDel("adelbc") ;
        delDel("adelHello");
        delDel("adedbc") ;
    }
    public static String delDel(String str) {
        String res = "";
        if (str.length()>3 && str.substring(1,4 ).equals("del")){
            res = str.substring(0,1) + str.substring(4, str.length());
        }else {
            res = str;
        }
        System.out.println(res);
        return res;
    }
}
