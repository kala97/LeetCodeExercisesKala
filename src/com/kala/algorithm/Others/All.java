package com.kala.algorithm.Others;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class All {
//    @Test
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int f[][] = new int[6][];
//        for (int i = 0; i < matrix[0].length; i++) {
//            if (matrix[0][i]>=target){
//                for (int i1 = 0; i1 < matrix.length; i1++) {
//                    if (matrix.length == 1) {
//                        if (matrix[i][i1]==target){
//                            return true;
//                        }
//                    }else {
//                        if (matrix[i-1][i1]==target){
//                            return true;
//                        }
//                    }
//                }
//            }
//        }
//
//        return false;
//    }

    @Test
    public void Test(){
        ArrayList<String> arr = new ArrayList<>();

        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set.size());
    }

}
