package org.prog.collections;

import java.util.HashSet;
import java.util.Set;

public class SetsDemo {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
//        stringSet.add("string1");
//        stringSet.add("string1");
//        stringSet.add("string2");
//        stringSet.add("string2");
//        stringSet.add("string3");
//        stringSet.add("string3");

        String s1 = "string1";
        String s2 = "string1";

        stringSet.add(s1);
        stringSet.add(s2);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(stringSet.size());
    }
}
