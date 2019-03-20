package ru.Voronuyk.com.CodingBat.Warmup1;

public class StringE {
    /*
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
     */
    public static void main(String[] args) {
        stringE("Hello");
        stringE("Heelle");
        stringE("Heelele");
    }
    public static boolean stringE(String str) {
        boolean res = false;
        int value = 0;
        for (int i=0 ; i<str.length() ; i++){
            if (str.length()>i & str.substring(i,i+1 ).equals("e")){
                value +=1;
            }
        }
        res = (value>0 & value<=3) ? true : false ;
        System.out.println(res+" "+value);
        return res;
    }
}
