package org.example.leetcode;
/**
 * 找到数组中与val不相同的值，然后统计出数量返回n ，然后数组要改变 前n个值必须为不相同的那些元素 后面len-n个值无所谓 不会判定
 * 比如数组为【1，2，2，4，5，6】 val=2 那么不等于2的值有4个 返回4，且数组中要把不等于2的值放到最前面（不需要排序） 【1，4，5，6，*，*】 后面两个值没有要求是什么都行
 * */
public class L27RemoveEle {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums ={3,2,2,3};
        int val =3;
        int i = removeElement(nums, val);
        System.out.println(i);

        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }
    }
}
