package org.example.leetcode;

public class L169MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int n = nums.length/2;
        for (int i = 0; i <nums.length ; i++) {
            int count = 1;
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[j] == nums[i]){
                    count++;
                    if (count>n){
                        return nums[i];
                    }
                }
            }
        }
        return 0;
    }

    //最优解 投票法
    public int majorityElement2(int[] nums) {
        int count = 1;
        int num =nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == num){
                count++;
            }else{
                count--;
                if (count==0){
                    num=nums[i];
                    count=1;
                }
            }
        }
        return num;
    }


}
