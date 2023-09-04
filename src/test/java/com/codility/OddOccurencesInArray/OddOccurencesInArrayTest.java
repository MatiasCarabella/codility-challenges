package com.codility.OddOccurencesInArray;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OddOccurencesInArrayTest {

    @Test
    public void Tests() {
        Assertions.assertEquals(OddOccurencesInArray.solution(new int[] {1, 2, 3, 2, 3, 4, 4}), 1);
        Assertions.assertEquals(OddOccurencesInArray.solution(new int[] {5, 10, 15, 20, 15, 10, 5}), 20); 
        Assertions.assertEquals(OddOccurencesInArray.solution(new int[] {7, 21, 14, 28, 35, 35, 21, 7, 28}), 14);
    }
}