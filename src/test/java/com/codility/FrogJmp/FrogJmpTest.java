package com.codility.FrogJmp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FrogJmpTest {
    @Test
    public void Tests() {

        Assertions.assertEquals(FrogJmp.solution(10, 85, 30), 3);

        Assertions.assertEquals(FrogJmp.solution(1, 10000, 1), 9999); 

        Assertions.assertEquals(FrogJmp.solution(20, 90, 10), 7);
        
    }
}



