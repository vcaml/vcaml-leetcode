package org.example.leetcode;

import java.util.Arrays;

/**
 * 合并两个有序数组nums1 ，nums2, 合并入nums1中
 * */
public class L88MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
         if(n>0) {
             for (int i = 0; i < n; i++) {
               nums1[m] = nums2[i];
               m++;
             }
             Arrays.sort(nums1);
         }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        if(n>0) {
        int num = m + n -1;
        int n1pot = m - 1;
        int n2pot = n - 1;

        for (int i = 0; i < m+n; i++) {
            if(n1pot>=0&&n2pot>=0) {
                if (nums1[n1pot] >= nums2[n2pot]) {
                    nums1[num] = nums1[n1pot];
                    num--;
                    n1pot--;
                } else {
                    nums1[num] = nums2[n2pot];
                    num--;
                    n2pot--;
                }
            }
        }

        if(n2pot>=0){
            int len=n2pot;
            for (int i = 0; i <= len; i++) {
                nums1[num] = nums2[n2pot];
                n2pot--;
                num--;

            }
        }
    }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,6,8,0,0,0};
        int m = 3;
        int[] nums2 = {2,2,3};
        int n = 3;
        merge2(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
