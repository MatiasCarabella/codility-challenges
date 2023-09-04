package com.codility.GridPathfinder;

public class GridPathfinder {
    public static void main(String[] args) {
        System.out.println("Expected: 4 | Actual: " + solution("CXV", new String[]{"..C", ".X.", "V.."}));
    }
    public static int solution(String string, String[] grid) {
        char[] charArray = string.toCharArray();
        int movements = 0;
        int currentRow = 0;
        int currentColumn = 0;
        int i = 0;
        for (char character : charArray) {
            boolean found = false;
            for (String row : grid) {
                if ( row.indexOf(character) != -1 ) {
                    if ( i == 0 ) {
                        currentRow = i;
                        currentColumn = row.indexOf(character);
                        System.out.println("(" + currentRow + ":" + currentColumn + ")");
                    } else {
                        movements += (Math.abs(i - currentRow) + Math.abs(row.indexOf(character) - currentColumn));
                        currentRow = i;
                        currentColumn = row.indexOf(character);
                    }
                    found = true;
                }
            }
            if (!found) {
                movements = -1;
                break;
            }
            i++;
        }
        return movements;
    }
}
