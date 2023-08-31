package com.codility.ConsecutiveNumbers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ConsecutiveNumbersTest {
    @Test
    public void Tests() {

        Assertions.assertEquals(ConsecutiveNumbers.solution(new int[] {1, 1, 2, 7, 9, 11, 13}), true);

        Assertions.assertEquals(ConsecutiveNumbers.solution(new int[] {1, 3, 5, 7, 9, 11, 13}), false); 

        Assertions.assertEquals(ConsecutiveNumbers.solution(new int[] {5, 10, 14, 28, 35, 35, 21, 7, 28}), false);
        
    }
}