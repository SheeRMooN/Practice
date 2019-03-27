package ru.Voronuyk.com.CodingBat.Recursion;

public class BunnyEarsNon {
    /*
We have a number of bunnies and each bunny has two big floppy ears.
 We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).


bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
     */
    public static void main(String[] args) {
        bunnyEars(0);
        bunnyEars(1);
        bunnyEars(2);
    }
    public static int bunnyEars(int bunnies) {
        int res ;
        res = bunnies + bunnies;
        System.out.println(res);
        return res;
    }
}
