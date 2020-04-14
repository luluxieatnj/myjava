package com.xll.collectionanmap;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("2");
        list.add("2");


        for (String s : list) {
            if ("1".equals(s)) {
                list.remove(s);
            }
        }

//        Iterator<String> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            if ("2".equals(iterator.next())){
//                iterator.remove();
//            }
//        }

        System.out.println(list);

    }
}
