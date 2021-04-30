package com.penguin.leetcode;

public class FindMedianSortedArrays {
    /**
     * 问题：给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
     * 答案
     *示例 1：
     *
     * 输入：nums1 = [1,3], nums2 = [2]
     * 输出：2.00000
     * 解释：合并数组 = [1,2,3] ，中位数 2
     * 示例 2：
     *
     * 输入：nums1 = [1,2], nums2 = [3,4]
     * 输出：2.50000
     * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
     * 示例 3：
     *
     * 输入：nums1 = [0,0], nums2 = [0,0]
     * 输出：0.00000
     * 示例 4：
     *
     * 输入：nums1 = [], nums2 = [1]
     * 输出：1.00000
     * 示例 5：
     *
     * 输入：nums1 = [2], nums2 = []
     * 输出：2.00000
     *
     * 思路
     * 1.首先将有序数组合并，得到合并数组
     * 2.再根据合并数组的长度，取下标Array[n/2]元素的值或下标(Array[n/2]+Array[n/2-1])/2
     * 进阶
     * 1.先计算长度
     * 2.直接在数组排序合并过程中，获取指定位置的元素
     *
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //1.获取数组长度
        int l1 = nums1.length;
        int l2 = nums2.length;
        //2.考虑其中一个数组长度为0的情况
        if(l1 == 0 && l2 != 0){
            return l2 % 2 == 0 ? nums2[l2/2 - 1] : nums2[l2 / 2];
        }
        if(l1 != 0 && l2 == 0){
            return l1 % 2 == 0 ? nums2[l1/2 - 1] : nums2[l1 / 2];
        }
        if(l1 == 0 && l2 == 0){
            return 0;
        }
        //
        /**
         * 如合计4个元素[0,1,2,3]，需要排序后的 1,2即可，数组长度为3
         * 如合计3个元素[0,1,2],需要排序后的1即可，数组长度为2
         *
         * 3.创建新数组，无须将所有元素排序后放入数组
         * int[] resNums = new int[ ( l1 + l2 )/2 + 1];
         *
         * 4.将nums复制到结果数组   arraycopy是Native方法
         * System.arraycopy(nums1,0,resNums,0,l1 -1 );
         *
         * 进阶：
         * 不用创建新数组，只需要找到指定下标的元素即可，定义一个变量记录下标和值即可，无需开辟更多空间
         */
        /**
         * 3.记录目标下标，排到目标下标时，即可返回期望值
         * 如合计4个元素[0,1,2,3]，需要排序后的 1,2即可，目标下标为 1 ， 2 目标值为 （1+2）/2
         * 如合计3个元素[0,1,2],需要排序后的1即可，目标下标为 1 ，目标值为1
         */
        if( (l1 + l2) % 2 == 0 ){
            int targetIndexSmall =  (l1 + l2) / 2 - 1;
            int targetIndexBig =  (l1 + l2) / 2 ;
            int targetValueSmall = nums2[0] > nums1[0] ? nums1[0] : nums2[0];
            int targetValueBig = nums2[0] < nums1[0] ? nums1[0] : nums2[0];
            int index = 0 ;
            //4.要考虑其中一个数组遍历完的情况 ×
            for(int i = 1; i <  l1 ; i ++){
                index ++ ;
                for(int j = 1; j < l2 ; j++){
                    //比较nums2[j]<nums2[j+1]、nums1[i]的大小
                    //针对六种情况作出处理
                    /**
                     * 1. a0 < a1 < b0 < b1
                     * 2. b0 < b1 < a0 < a1
                     * 3. a0 < a1
                     * 4. a0 < a1 < b0 < b1
                     * 5. a0 < a1 < b0 < b1
                     * 6. a0 < a1 < b0 < b1
                     */


                    index ++;
                }

            }

        }else{

        }

        return 0;

    }
}
