package com.penguin.leetcode;

import com.penguin.leetcode.datastructure.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void arrayCopyTest(){
        int[] i1 = new int[]{1,2,3,4,5,6,7};
        int[] i2 = new int[10];
        System.arraycopy(i1,0,i2,0,5);
        for(int i = 0; i < i2.length ;i ++){
            System.out.println(i2[i]);
        }

    }
    @Test
    public void lengthOfLongestSubstring(){
        LengthOfLongestSubstring s = new LengthOfLongestSubstring();
//        String s1 = "abcabcbb";  //3
//        String s2 = "bbbbb"; //1
 //       String s3 = "pwwkew";//3
        String s4 = "";//0

//        System.out.println(s.lengthOfLongestSubstring(s1) == 3);
//        System.out.println(s.lengthOfLongestSubstring(s2) == 1);
 //       System.out.println(s.lengthOfLongestSubstring(s3) == 3);
        System.out.println(s.lengthOfLongestSubstring(s4) == 0);


    }
    @Test
    public void strToCharTest(){

        String s = "abcdefaa";

        System.out.println( s.contains("a"));

        s = "我是个好人";
        char[] c = s.toCharArray();
        for(int i = 0; i< c.length ;i ++){
            System.out.println(c[i]);
        }
    }

    @Test
    public void SolutionTest() {
        TwoSum s = new TwoSum();
        int[] nums = new int[]{3, 2, 4};
        int[] targerIndex = s.twoSum(nums, 6);
        //System.out.println(targerIndex[0] + "," + targerIndex[1]);
    }

    @Test
    public void addTwoNumbers() {
        AddTwoNumbers s = new AddTwoNumbers();
//        int[] i1 = new int[]{0};
//        int[] i2 = new int[]{0};
//        int[] i1 = new int[]{2,4,3};
//        int[] i2 = new int[]{5,6,4};
        int[] i1 = new int[]{9,9,9,9,9,9,9};
        int[] i2 = new int[]{9,9,9,9};

        ListNode l1 = new ListNode(i1[0], null);
        ListNode tail1 = l1;
        for (int i = 1; i < i1.length; i++) {
            ListNode current = new ListNode();
            current.val = i1[i];
            tail1.next = current;
            tail1 = current;
        }
//        while (l1 != null) {
//            System.out.println(l1.val);
//            l1 = l1.next;
//        }

        ListNode l2 = new ListNode(i2[0], null);
        ListNode tail2 = l2;
        for (int i = 1; i < i2.length; i++) {
            ListNode current = new ListNode();
            current.val = i2[i];
            tail2.next = current;
            tail2 = current;
        }
//        while (l2 != null) {
//            System.out.println(l2.val);
//            l2 = l2.next;
//        }

        ListNode res = s.addTwoNumbers(l1,l2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
        System.out.println(res);

    }
}
