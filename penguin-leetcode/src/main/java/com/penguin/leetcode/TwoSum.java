package com.penguin.leetcode;

import com.penguin.leetcode.datastructure.ListNode;

import java.util.HashMap;

public class TwoSum {
    /**
     * 问题1：给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     * 答案示例：
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     * <p>
     * 解题思路：
     * 1.一重for循环遍历数组
     * 2.遍历过的数组加入到一个hashmap，数组值为key，数组下标为value
     * 3.一重遍历查找hashmap中是否存在目标值，若存在直接返回当前数组下标和hashmap的value
     */
    public int[] twoSum(int[] nums, int target) {
        //步骤1：定义结果数组
        int[] requireIndex = new int[2];
        //步骤2：定义线性的hashmap
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        //步骤3：遍历数组，并将遍历过的数据放入hashmap
        for (int numsIndex = 0; numsIndex < nums.length; numsIndex++) {
            //步骤4：获取当前值
            int current = nums[numsIndex];
            //步骤5：计算需求值，并查找hashmap中是否存在需求值，存在则查找成功，直接返回
            int require = target - current;
            if (numsMap.containsKey(require)) {
                return new int[]{numsIndex, numsMap.get(require)};
            }
            //步骤6：并将当前值存入hashmap
            numsMap.put(current, numsIndex);
        }
        return requireIndex;

    }


}
