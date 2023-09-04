package com.codility.GameTimeSlots;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GameTimeSlotsTest {

    @Test
    public void Tests() {
        Assertions.assertEquals(GameTimeSlots.solution("22:00","23:45"), 7);
        Assertions.assertEquals(GameTimeSlots.solution("23:00","02:15"), 13);
        Assertions.assertEquals(GameTimeSlots.solution("12:00","12:29"), 1);   
        Assertions.assertEquals(GameTimeSlots.solution("16:00","16:45"), 3);           
    }
}
