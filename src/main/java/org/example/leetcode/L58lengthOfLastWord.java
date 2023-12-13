package org.example.leetcode;

public class L58lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        int len = s1.length;
        return s1[len - 1].length();
    }
}
