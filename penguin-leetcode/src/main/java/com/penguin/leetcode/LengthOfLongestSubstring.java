package com.penguin.leetcode;

import com.penguin.leetcode.datastructure.ListNode;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    /**
     * 问题3：
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * 示例1
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     *
     * 示例2
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     *
     * 示例3
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     *
     * 示例4
     * 输入: s = ""
     * 输出: 0
     *
     * 解题思路：
     * 1.将字符串分隔为数组
     * 2.遍历数据进行子串拼接工作，逐个将子串加入hashmap
     * 新加入时，判断数组元素是否已存在，若存在，则结束循环
     * 将当前子串长度与已保存的最大长度子串进行比较，若长度更大，则覆盖
     * 优化思路
     * 如果数据剩余长度小于当前最大长度，则结束循环
     */
    public int lengthOfLongestSubstring(String s) {
        //1.获取字符串的字符数组
        char[] c = s.toCharArray();
        int maxLength = 0;
        String maxStr = "";
        //2.循环获取
        for(int i = 0 ;i < c.length ; i ++){
            StringBuffer outStr = new StringBuffer();
            //3.获取当前子串的头值
            outStr.append(c[i]);
            //4.子串后续值
            for(int j = i + 1 ; j < c.length ; j ++){
                //5.判断当前字符是否存在于子串，若存在，则结束本次内外层循环
                if(outStr.toString().contains(String.valueOf(c[j]))){
                    maxStr = outStr.toString().length() > maxLength ? outStr.toString() : maxStr;
                    maxLength = outStr.toString().length() > maxLength ? outStr.toString().length() : maxLength;
                    break;
                }
                outStr.append(c[j]);
            }
        }
        //System.out.println("maxStr:"+maxStr+"  "+"maxLength:"+ maxLength);
        return maxLength;
    }
}
