package ru.Voronuyk.com.CodingBat.Logic1;

public class WithoutDoubles {
    /*
Return the sum of two 6-sided dice rolls, each in the range 1..6.
However, if noDoubles is true, if the two dice show the same value,
 increment one die to the next value, wrapping around to 1 if its value was 6.


withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6
     */
    public static void main(String[] args) {
        withoutDoubles(2, 3, true);
        withoutDoubles(3, 3, true);
        withoutDoubles(3, 3, false);
    }
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int res;
        if (noDoubles & die1==die2){
            if (die1 >=6) {
                res = 7;
            }else res = die1+die2+1 ;
        }else res = die1+die2;
        System.out.println(res);
        return res;
    }
}
