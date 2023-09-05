package com.codility.GridPathfinder;

import java.util.ArrayList;
import java.util.List;

public class GridPathfinder {
    public static void main(String[] args) {
        System.out.println("Expected: 4 | Actual: " + solution("CXV", new String[]{"..C", ".X.", "V.."}));
    }
    public static int solution(String string, String[] grid) {
        char[] charArray = string.toCharArray();
        ArrayList<ArrayList<Integer>> startingPositions = new ArrayList<ArrayList<Integer>>();
        boolean found = false;
        int i = 0;
        for (String row : grid) {
            if ( row.indexOf(charArray[0]) != -1 ) {
                ArrayList<Integer> startPosition = new  ArrayList<Integer>();
                startPosition.add(i);
                startPosition.add(row.indexOf(charArray[0]));
                startingPositions.add(startPosition);
                found = true;
            }
            i++;
        }
        if (!found) {
            return -1;
        }
        int shortestDistance = -1;
        for (ArrayList<Integer> startPosition : startingPositions) {
            int distance = findShortestPath(charArray, grid, startPosition.get(0), startPosition.get(1));
            if (shortestDistance == -1 || distance < shortestDistance) {
                shortestDistance = distance;
            }
        }
        return shortestDistance;
    }

    private static int findShortestPath(char[] charArray, String[] grid, int startingRow, int startingColumn) {
        int currentRow = startingRow;
        int currentColumn = startingColumn;
        int movements = 0, closestDistance = 0, closestRow = 0, closestColumn = 0;
        for (int i = 1; i < charArray.length; i++) {
            boolean found = false;
            int j = 0;
            for (String row : grid) {
                if ( row.indexOf(charArray[i]) != -1 ) {
                    int distance = Math.abs(i - currentRow) + Math.abs(row.indexOf(charArray[i]) - currentColumn);
                    if (!found || distance < closestDistance) {
                        closestDistance = distance;
                        closestRow = j;
                        closestColumn = row.indexOf(charArray[i]);
                        System.out.println("(" + closestRow + ":" + closestColumn + ")");
                    }
                    found = true;
                }
                j++;
            }
            if (found) {
                System.out.println(closestDistance);
                movements += closestDistance;
                currentRow = closestRow;
                currentColumn = closestColumn;
            } else {
                movements = -1;
                break;
            }
        }
        return movements;
    }
}
