package ru.Voronuyk.Test.Some.Collection;

import java.util.*;

public class Test_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<String>();
        llist.add("adasdwq");
        llist.add("sadaq");
        llist.add("fewas");
        llist.add("dsad");
        llist.add("klu");
        llist.add("jljkljkl");
        llist.add("iuoui");
        llist.add("iopio");
        llist.add("p[o[");
        llist.add("l';'l");
        llist.add("ljkjklj");
        llist.add("adammsdwq");
        llist.add("m.");
        llist.add("nmmhh");
        llist.add("vxcvxv");
        llist.add("czxcz");
        llist.add("xZXZ");
        llist.add("dasdas");
        llist.add("eqweqw");
        llist.add("reter");

        llist.addFirst("First");
        llist.addLast("Last");

        System.out.print(llist);
        System.out.println("size = "+llist.size());

        llist.remove(1);
        System.out.print(llist);
        System.out.println("size = "+llist.size());

        llist.remove("iopio");
        System.out.print(llist);
        System.out.println("size = "+llist.size());
        System.out.println();

        String val = llist.get(1);
        System.out.println(val);
        System.out.println();
        llist.set(1,"zoom" );
        System.out.println(llist.getFirst());
        System.out.println();

        String[] str = new String[llist.size()];

        str=llist.toArray(str);
        System.out.print(Arrays.toString(str));
        System.out.println("lenght = "+ str.length);
        System.out.println();
    }
}
