package org.example.leetcode;

import java.util.Arrays;

public class L14longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // 将字符串数组按照字母顺序排序
        Arrays.sort(strs);

        // 取第一个字符串和最后一个字符串（经过排序后的第一个和最后一个）进行比较
        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];

        // 比较两个字符串的每个字符
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < firstStr.length(); i++) {
            if (i < lastStr.length() && firstStr.charAt(i) == lastStr.charAt(i)) {
                commonPrefix.append(firstStr.charAt(i));
            } else {
                break;
            }
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        // 示例
        String[] strs1 = {"dog"," flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs1)); // 输出："fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs2)); // 输出：""
    }
}
