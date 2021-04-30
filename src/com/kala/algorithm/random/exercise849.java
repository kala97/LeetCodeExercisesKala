package com.kala.algorithm.random;

/**
 * 849. 到最近的人的最大距离
 */

public class exercise849 {
    public int maxDistToClosest(int[] seats) {
        int singlecount = 0;
        int singlemax = 0;
        int doublemax = 0;
        int doublecount = 0;
        for (int seat : seats) {
            if (seat == 0) {
                doublecount++;
                doublemax = Math.max(doublecount, doublemax);
            } else {
                doublecount = 0;
            }
        }
        for (int seat : seats) {
            if (seat == 1) {
                break;
            } else {
                singlecount++;
            }
        }
        singlemax = Math.max(singlecount, singlemax);
        singlecount = 0;
        for (int i = seats.length - 1; i > 0; i--) {
            if (seats[i] == 1) {
                break;
            } else {
                singlecount++;
            }
        }
        singlemax = Math.max(singlecount, singlemax);
        return Math.max((doublemax + 1) / 2, singlemax);
    }
}
