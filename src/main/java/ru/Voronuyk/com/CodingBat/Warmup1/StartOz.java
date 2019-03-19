package ru.Voronuyk.com.CodingBat.Warmup1;

public class StartOz {
    /*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
     */
    public static void main(String[] args) {
        startOz("ozymandias");
        startOz("bzoo");
        startOz("oxx");
    }
    public static String startOz(String str) {
        String res;
        if (str.length()>=1 && str.substring(0,1 ).equals("o")){
            if (str.length()>=2 && str.substring(1, 2).equals("z") ){
                res = "oz";
            }else {
                res = "o";
            }
        }else   if (str.length()>=2 && str.substring(1, 2).equals("z")){
            res = "z";
        }else
            res = "";
        System.out.println(res);
        return res;
    }
}
