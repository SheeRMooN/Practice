package ru.Voronuyk.com.CodingBat.Logic1;

public class TeaParty {
    /*
We are having a party with amounts of tea and candy.
Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
 A party is good (1) if both tea and candy are at least 5. However,
  if either tea or candy is at least double the amount of the other one, the party is great (2).
   However, in all cases, if either tea or candy is less than 5, the party is always bad (0).


teaParty(6, 8) → 1
teaParty(3, 8) → 0
teaParty(20, 6) → 2
     */
    public static void main(String[] args) {
        teaParty(6, 8);
        teaParty(3, 8);
        teaParty(20, 6);
    }
    public static int teaParty(int tea, int candy) {
        int res;
        if (tea<5 | candy<5){
            res = 0;
        }else if(tea>=candy*2 | tea*2<=candy){
            res = 2;
        }else {
            res = 1 ;
        }
        System.out.println(res);
        return res;
    }
}
