package com.xll.collectionanmap;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        map.forEach((k, v) -> {

        });

    }
}
