package com.codility.ConsecutiveNumbers;

import java.util.HashSet;

public class ConsecutiveNumbers {

    public static boolean solution(int[] A) {       
        // First, we add all elements of the List into a HashSet
        HashSet<Integer> List = new HashSet<Integer>();
        for (int i = 0; i<A.length; i++) {
            List.add(A[i]);
        }

        // Then, we go over our newly created checking whether or not consecutive numbers are present:
        for (int i = 0; i<A.length; i++) {
            if (List.contains(A[i] - 1)  || List.contains(A[i] + 1)) {
                return true;
            }
        }
        return false;
    }
}

    