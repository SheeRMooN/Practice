package ru.Voronuyk.com.CodingBat.Warmup1;

public class MonkeyTrouble {
    /*
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
    */
    public static void main(String[] args) {
        monkeyTrouble( true,true );
        monkeyTrouble( false,false );
        monkeyTrouble( true,false );
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        boolean res;
        if (aSmile == false & bSmile == false){
            res = true;
        }else {
            res = (aSmile & bSmile);
        }
        System.out.println(res);
        return res;
    }
}
