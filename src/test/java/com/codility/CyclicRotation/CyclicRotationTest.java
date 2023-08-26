package com.codility.CyclicRotation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CyclicRotationTest {
    
    @Test
    public void Tests() {

        Assertions.assertArrayEquals(CyclicRotation.solution(new int[] {1, 2, 3, 4}, 1), new int[] {4, 1, 2, 3});

        Assertions.assertArrayEquals(CyclicRotation.solution(new int[] {5, 10, 15, 20}, 0), new int[] {5, 10, 15, 20}); 

        Assertions.assertArrayEquals(CyclicRotation.solution(new int[] {7, 21, 14, 28, 35}, 5), new int[] {7, 21, 14, 28, 35});
        
    }
}