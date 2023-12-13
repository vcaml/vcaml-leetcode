package org.example.leetcode;

public class L80RemoveDuplicates2 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int k = 2; // 从第三个元素开始判断
        for (int i = 2; i < nums.length; i++) {
            // 如果当前元素不等于前两个元素，则可以保留
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums ={0,0,0,1,1,1,1,2,3,3,3,4};
        int[] expectedNums = {1,2};
        int res = removeDuplicates(nums);
        System.out.println("res=:"+res);

        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }

    }

}
