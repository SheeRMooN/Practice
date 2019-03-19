package ru.Voronuyk.com.CodingBat.Warmup1;

public class SleepIn {
    /*
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
    */
    public static void main(String[] args) {
        sleepIn( false,false );
        sleepIn( true,false );
        sleepIn( false,true );

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean res;
        if (weekday == true & vacation == false) {
            res = false;
        } else
            res = true;
        System.out.println(res);
        return res;
    }
}


