package com.codility.GridPathfinder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GridPathfinderTest {
    @Test
    public void Tests() {
        Assertions.assertEquals(
            GridPathfinder.solution("CXV", new String[]{"..C", ".X.", "V.."}), 
            4);
        Assertions.assertEquals(
        GridPathfinder.solution("ABCD", new String[]{"A...", ".B..", "..C.", "...D"}), 
        6);         
    }
}
