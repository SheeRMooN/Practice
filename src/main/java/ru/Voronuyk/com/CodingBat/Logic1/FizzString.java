package ru.Voronuyk.com.CodingBat.Logic1;

public class FizzString {
    /*
Given a string str, if the string starts with "f" return "Fizz".
If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
 In all other cases, return the string unchanged. (See also: FizzBuzz Code)


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
     */
    public static void main(String[] args) {
        fizzString("fig");
        fizzString("dib");
        fizzString("fib");
    }
    public static String fizzString(String str) {
        String res;
        if (str.substring(0,1 ).equals("f") & str.substring(str.length()-1,str.length() ).equals("b")){
            res = "FizzBuzz";
        }else if (str.substring(0,1 ).equals("f")){
            res = "Fizz";
        }else if (str.substring(str.length()-1,str.length() ).equals("b")){
            res = "Buzz";
        }else {
            res = str;
        }
        System.out.println(res);
        return res;
    }
}
