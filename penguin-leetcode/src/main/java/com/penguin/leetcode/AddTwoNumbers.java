package com.penguin.leetcode;

import com.penguin.leetcode.datastructure.ListNode;

import java.util.HashMap;

public class AddTwoNumbers {
    /**
     * 问题2：
     * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 答案示例：
     * 输入：l1 = [2,4,3], l2 = [5,6,4]
     * 输出：[7,0,8]
     * 解释：342 + 465 = 807.
     * <p>
     * 输入：l1 = [0], l2 = [0]
     * 输出：[0]
     * <p>
     * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * 输出：[8,9,9,9,0,0,0,1]
     * <p>
     * 解题思路：
     * 1.l1、l2的长度无法确定，无论谁在外层循环，都需要考虑外层循环长度小于内层循环的问题，因此不再以l1、l2的长度循环
     * 2.相同位置结果相加大于10，需进一位
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //1.创建链表链表头、尾节点并参加运算
        ListNode headNode = null;
        ListNode tailNode = null;
        //2.判断链表是否已经遍历完毕
        boolean circle1 = true;
        boolean circle2 = true;
        //3.定义进位值，默认不进位
        boolean decade = false;
        while (circle1 || circle2) {
            //4.定义计算结果
            int currentSum = 0;
            //5.链表1未循环完毕，添加链表1当前位置的值
            if(l1 !=null){
                currentSum += l1.val;
                //判断当前节点是否存在后继节点
                circle1 = !(l1.next == null);
                //计算完毕，节点后移
                l1 = l1.next;

            }
            //6.链表2未循环完毕，添加链表2当前位置的值
            if(l2 != null){
                currentSum += l2.val;
                //判断当前节点是否存在后继节点
                circle2 = !(l2.next == null);
                //计算完毕，节点后移
                l2 = l2.next;
            }
            //7.添加进位值
            if(decade){
                currentSum +=1;
            }
            //8.根据计算结果，判断是否继续进位
            decade = currentSum >= 10 ;
            //9.设置结果链表的值
            if(headNode == null){
                //如果链表没有初始化，进行头尾节点的初始化
                headNode = tailNode = new ListNode(currentSum%10,null);
            }else{
                //如果链表已经初始化
                ListNode currentNode = new ListNode(currentSum%10,null);
                //修改尾结点的next指针
                tailNode.next = currentNode;
                //修改尾结点的指针
                tailNode = currentNode;
            }
        }
        //9.如果链表循环完毕,但是仍然存在进位的情况
        if (decade) {
            //如果链表已经初始化
            ListNode currentNode = new ListNode(1,null);
            //修改尾结点的next指针
            tailNode.next = currentNode;
            //修改尾结点的指针
            tailNode = currentNode;
        }
        return headNode;
    }
}
