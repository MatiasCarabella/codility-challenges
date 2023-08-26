package com.codility.BinaryGap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BinaryGapTest {
    
    @Test
    public void Tests() {

        // INT: 1041 - BIN: 10000010001 - BINARY GAP: 5
        Assertions.assertEquals(BinaryGap.solution(1041), 5); 

        // INT: 15 - BIN: 1111 - BINARY GAP: 0
        Assertions.assertEquals(BinaryGap.solution(15), 0); 

        // INT: 32 - BIN: 100000 - BINARY GAP: 0
        Assertions.assertEquals(BinaryGap.solution(32), 0); 

        // INT: 66561 - BIN: 10000010000000001 - BINARY GAP: 2
        Assertions.assertEquals(BinaryGap.solution(66561), 9); 

        // INT: 6291457 - BIN: 11000000000000000000001 - BINARY GAP: 
        Assertions.assertEquals(BinaryGap.solution(6291457), 20);
    }
}
