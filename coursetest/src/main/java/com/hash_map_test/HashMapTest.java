package com.hash_map_test;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMaTest = new HashMap<String, Integer>();
        hashMaTest.put("micro", 1234566);
        hashMaTest.put("micro2", 1234567);
        hashMaTest.put("micro3", 1234568);
        hashMaTest.put("micro4", 1234569);
        hashMaTest.put("micro5", 12345610);
        hashMaTest.put("micro6", 12345611);
        hashMaTest.put("micro6", 1111111111);

        System.out.println(hashMaTest.get("micro6"));
//        System.out.println(hashMaTest.get("micro3"));
//        System.out.println(hashMaTest.get("micro4"));
//        System.out.println(hashMaTest.get("micro5"));
//        System.out.println(hashMaTest.get("micro2345"));
    }
}
