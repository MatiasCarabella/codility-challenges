package com.codility.FrogJmp;

public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        int daichu = (Y-X)/D;
        if ((Y-X)%D > 0) {
            daichu++;
        }
        return daichu;
    }
}
