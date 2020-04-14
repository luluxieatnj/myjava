package com.xll.strings;

import org.junit.Test;

import java.io.IOException;
import java.util.*;


public class ArrayTest2 {

    @Test
    public void eightQueue() {

    }

    public int countCharacters(String[] words, String chars) {
        int l = 0;
        Map<Character, Integer> charMap = getMap(chars);
        for(String str : words) {
            Map<Character, Integer> map = getMap(str);
            if(check(map, charMap)) {
                l += str.length();
            }
        }
        return l;
    }

    public Map<Character, Integer> getMap(String chars) {
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);
            Integer count = charMap.get(c);
            count = count == null ? 1 : count+1;
            charMap.put(c, count);
        }
        return charMap;
    }

    public boolean check(Map<Character, Integer> s, Map<Character, Integer> l) {
        // 检查l是否包含s
        for(Map.Entry<Character, Integer> e : s.entrySet()) {
            Integer value = e.getValue();
            Integer li = l.get(e.getKey());
            if(li == null || li < value) {
                return false;
            }
        }
        return true;
    }

    public int minAreaRect(int[][] points) {
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        for(int[] a : points) {

        }

        return 0;
    }

    @Test
    public void test02() throws IOException {

    }

    public int c(int[] a) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                count += a[i];
                return count;
            }
            if (i == a.length - 2) {
                count += Math.max(a[i], a[i + 1]);
                return count;
            }

            if(a[i + 1] >= a[i] + a[i + 2]) {
                count += a[i + 1];
                i += 2;
            } else {
                count += (a[i] + a[i + 2]);
                i += 3;
            }
        }
        return count;
    }

//            1 <= nums.length <= 10^4
//            1 <= nums[i] <= 10^5
    public int sumFourDivisors(int[] nums) {

        return 0;
    }

    public int cal(int n) {
        int sqrt = (int) Math.sqrt(n);
        int count = 0;
        int t = 0;
        for(int i = 2; i <= sqrt; i++) {
            if(n%i == 0) {
                count++;
                if (count == 2) {
                    return 0;
                } else {
                    t = i;
                }
            }
        }
        if(t == 0 || t * t == n) {
            return 0;
        }
        return t + 1 + n + n/t;
    }

    @Test
    public void test03() {
        int i = lastRemaining(5, 3);
        int i2 = lastRemaining(10, 17);
        System.out.println(i);
        System.out.println(i2);
    }

    public int lastRemaining(int n, int m) {
        if (m == 1) return n - 1;
        Node head = new Node(0);
        Node cur = head;
        for (int i = 1; i < n; i++) {
            Node node = new Node(i);
            cur.next = node;
            cur = cur.next;
        }
        cur.next = head;
        while (n-- > 1) {
            head = head.remove(m);
        }
        return head.val;
    }

    class Node{
        int val;
        Node next;
        public Node(int data) {
            val = data;
        }
        public Node remove(int m) {
            Node par = this;
            int count = 1;
            while (count < m - 1) {
                par = par.next;
                ++count;
            }
            par.next = par.next.next;
            return par.next;
        }
    }




    public int[] sortArray(int[] nums) {
        return nums;
    }

    // 快排
    public void quickSort(int[] nums, int start, int end) {



    }

}
