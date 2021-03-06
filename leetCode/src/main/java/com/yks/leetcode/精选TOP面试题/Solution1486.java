package com.yks.leetcode.精选TOP面试题;

/**
 * @Description: 1486. 数组异或操作
 * @Author: Yu ki-r
 * @CreateDate: 2020/11/19 20:22
 */
public class Solution1486 {

    /**
     * 给你两个整数，n 和 start 。
     *
     * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
     *
     * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
     *
     */


    /**
     * 示例：
     * 输入：n = 5, start = 0
     * 输出：8
     * num[i] = start + 2*i
     * num[0] = 0
     * num[1] = 2
     * ...
     * num[4] = 8
     * 解释：数组 nums 为 [0, 2, 4, 6, 8]，其中 (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8 。
     *      "^" 为按位异或 XOR 运算符。
     */


    public int xorOperation(int n, int start) {
        int res= 0;
        int[] num= new int[n];
        for (int i = 0;i<n;i++){
            num[i] = start +2*i;
            res = res^num[i];
        }
        return res;

    }
}
