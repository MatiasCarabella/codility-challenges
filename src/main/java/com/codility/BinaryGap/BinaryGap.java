package com.codility.BinaryGap;

public class BinaryGap {

    public static int solution(int N) {
        // First, we convert our Integer number into a binary string using the Integer class method
        String binaryN = Integer.toBinaryString(N);
        // System.out.println(binaryN);

        // We initialize 'maxGap', a variable which will hold the length of the biggest gap
        int maxGap = 0;
        // 'currentGap' will hold the length of the gap we're currently in
        int currentGap = 0;
        
        // We iterate through the binary string
        for (int i = 0; i < binaryN.length(); i++) {
            // We check for 1s, if we find a '1' it means we need to stop counting and check whether or not our currentGap is greater that our maxGap. After that, we reset our currentGap so we get ready for the next sequence of 0s
            if (binaryN.charAt(i) == '1') {
                maxGap = currentGap > maxGap ? currentGap : maxGap;
                currentGap = 0;
            } else {
                // Otherwise, we increment our currentGap variable
                currentGap++;
            }
        }
        return maxGap;
    }
    
}
