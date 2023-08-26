package com.codility.CyclicRotation;

public class CyclicRotation {
    
    public static int[] solution(int[] A, int K) {
        // We will perform this 'switch to the right' K times, so we create a for loop
        for (int i = 0; i<K; i++) {
            // Now - we perform each individual 'switch to the right', for this we'll loop over the array length (so we change each elements' position), and the key variable that we'll use is 'previous', its role will be to store the value of the previous element position (before it was overwritten)
            int previous = 0;
            for (int j = 0; j<A.length; j++) {
                // The first element of the array is overwritten by the last element of the array
                if (j == 0) {
                    previous = A[j];
                    A[j] = A[A.length-1];
                } else {
                    // Every other element is overwritten by the previous one.
                    int temp = A[j];
                    A[j] = previous;
                    previous = temp;
                }
            }
        }
        return A;
    }
}

