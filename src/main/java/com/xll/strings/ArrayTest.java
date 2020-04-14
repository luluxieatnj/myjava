package com.xll.strings;

import org.junit.Test;

import java.util.*;

public class ArrayTest {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    @Test
    public void test01() {


    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        int size = size(head);
        if (size == 0 || k > size) {
            return null;
        }
        while (size-- - k > 0) {
            head = head.next;
        }
        return head;
    }

    public int size(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
