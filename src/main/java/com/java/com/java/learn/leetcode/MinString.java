package com.java.com.java.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-12-02 4:11 PM
 */
public class  MinString {

    private static final String S = "ADOBECODEBANC";

    private static final String T = "ABC";

    public static void main(String[] args) {
        List<String> allString = new ArrayList<>();
        List<String> Tlist = new ArrayList<>();
        for (int i = 0; i < T.length(); i++) {
            Tlist.add(String.valueOf(T.charAt(i)));
        }
        String newStr = null;
        for (int i = 0; i < S.length() - 1; i++) {
            for (int j = S.length() ; j > i; j--) {
                if (j > i){
                    newStr = S.substring(i,j);
                    if (newStr.contains(Tlist.get(0))
                            && newStr.contains(Tlist.get(1))
                            && newStr.contains(Tlist.get(2))){
                        allString.add(newStr);
                    }
                }
            }
        }

        for (String s : allString){
            System.out.println(s);
        }

    }
}
