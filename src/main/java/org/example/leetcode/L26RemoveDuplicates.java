package org.example.leetcode;

/**
 * 删除有序数组中的重复项
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2,_]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 *
 * 笨办法： 用hashmap 往里面一个个装 有重复的就不装 然后覆盖数组的前n个值
 *
 * 优解： 两个指针 i ++遍历  k从0开始 用 num【k】不等于num【i】判断 每找到一个不一样的 先k++ 然后   nums[k]=nums[i] 替换 一个循环就搞定
 * */
public class L26RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int k=0;

        for (int i = 0; i < len; i++){
         if(nums[k]!=nums[i]){
             k++;
             nums[k]=nums[i];
         }
        }

     return k;
    }

    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {1,2};
        int res = removeDuplicates(nums);
        System.out.println("res=:"+res);

        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }

    }

}
