package com.xll.strings;

import org.junit.Test;

/**
 *  给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 */
public class LongestPalindrome {

    @Test
    public void test() {
        String s = "babad";
        String s1 = longestPalindrome(s);
        System.out.println(s1);
    }

    public String longestPalindrome(String s) {
        if (null == s || s.length() == 0 ||s.length() == 1) {
            return s;
        }

        String  target = s.substring(0,1);
        int l = s.length();
        for(int i = 0; i < l - 1; i++) {
            int t = 0;
            for (int j = l - 1 - i; j < l; j++,t++) {
                if (judge(s, t, j)) {
                    return s.substring(t, j + 1);
                }
            }
        }
        return target;
    }

    // 判断回文
    public boolean judge(String str, int start, int end) {
        if (start > end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        } else {
            return judge(str, start + 1, end - 1);
        }
    }
}
