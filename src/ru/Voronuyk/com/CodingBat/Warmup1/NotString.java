package ru.Voronuyk.com.CodingBat.Warmup1;

public class NotString {
    /*Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"
     */
    public static void main(String[] args) {
        notString("candy");
        notString("x");
        notString("not bad");
    }

    public static String notString(String str) {
        String res = "";
        if ((str.length() > 2) && str.substring(0, 3).equals("not")) {
            res = str;
        } else {
            res = "not " + str;
        }
        System.out.println(res);
        return res;
    }
}
