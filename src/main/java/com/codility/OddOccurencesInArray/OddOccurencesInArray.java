package com.codility.OddOccurencesInArray;

import java.util.HashSet;

public class OddOccurencesInArray {

    public static int solution(int[] A) {       
        // Creating an empty List
        HashSet<Integer> List = new HashSet<Integer>();
        for (int i = 0; i<A.length; i++) {
        /**
         * We want to store elements that appear an ODD amount of times, until we eventually end up with only one, according to the problem's assumptions. 
         * For this, we'll use a HashSet: Adding elements to the HashSet when we find them, and removing them if we find another occurence of them in the array. 
         * Therefore, at the end of the execution the only element that will remain in the HashSet will be the one that appears an ODD amount of times.
         */ 
            if (!List.contains(A[i])) {
                List.add(A[i]);
            } else {
                List.remove(A[i]);
            }
        }
        return List.iterator().next();
    }
}

    