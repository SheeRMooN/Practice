package ru.Voronuyk.Test.Some.Collection;

import java.util.*;


public class Test_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> Alist = new ArrayList<String>();
        Alist.add("adasdwq");
        Alist.add("sadaq");
        Alist.add("fewas");
        Alist.add("dsad");
        Alist.add("klu");
        Alist.add("jljkljkl");
        Alist.add("iuoui");
        Alist.add("iopio");
        Alist.add("p[o[");
        Alist.add("l';'l");
        Alist.add("ljkjklj");
        Alist.add("adammsdwq");
        Alist.add("m.");
        Alist.add("nmmhh");
        Alist.add("vxcvxv");
        Alist.add("czxcz");
        Alist.add("xZXZ");
        Alist.add("dasdas");
        Alist.add("eqweqw");
        Alist.add("reter");

        System.out.println(Alist);
        System.out.println("size = "+Alist.size());

        Alist.remove(0);

        System.out.println(Alist);
        System.out.println("size = "+Alist.size());

        Alist.remove("iopio");
        System.out.println(Alist);
        System.out.println("size = "+Alist.size());

        String[] str = new String[Alist.size()];

        str=Alist.toArray(str);
        System.out.println(Arrays.toString(str));
        System.out.println("lenght = "+ str.length);
    }
}
