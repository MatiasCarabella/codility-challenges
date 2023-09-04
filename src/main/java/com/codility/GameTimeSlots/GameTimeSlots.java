package com.codility.GameTimeSlots;

public class GameTimeSlots {

    public static int solution(String startTime, String endTime) {
        int ROUND_DURATION = 15;
        int[] ROUND_START_TIMES = {0, 15, 30, 45};

        int startHours = Integer.parseInt(startTime.substring(0, 2));
        int startMinutes = Integer.parseInt(startTime.substring(startTime.length() - 2));

        int endHours = Integer.parseInt(endTime.substring(0, 2));
        int endMinutes = Integer.parseInt(endTime.substring(endTime.length() - 2));

        System.out.println(startHours + " " + startMinutes + " | " + endHours + " " + endMinutes);

        int hourDiff = endHours - startHours;
        int playableRounds = 0;
        if (hourDiff > 0) {
            /**
             *  If the hour difference 'N' is greater than 0, it means that we have at least 'N-1'
             *  full hours of rounds (with 4 rounds per hour).
             */
            playableRounds = (hourDiff-1)*60/ROUND_DURATION;
            /**
             * Then, we need to take into consideration the startMinutes, to know how many
             * rounds can be played in the starting hour.
             * Similarly, we use the endMinutes to know how many rounds can be played in the final hour.
             */
            for (int roundStartTime : ROUND_START_TIMES) {
                if (startMinutes <= roundStartTime) {
                    playableRounds++;
                }
                if (endMinutes >= roundStartTime + ROUND_DURATION) {
                    playableRounds++;
                }
            }
            System.out.println(playableRounds);
        } else if (hourDiff < 0) {
            /**
             * If the hour difference 'N' is negative / smaller than 0, it means that we're crossing 
             * onto the next day, so we calculate the hours from start to 24, and from 0 to end.
             */
            playableRounds = (((24-startHours) + endHours)-1)*60/ROUND_DURATION;
            for (int roundStartTime : ROUND_START_TIMES) {
                if (startMinutes <= roundStartTime) {
                    playableRounds++;
                }
                if (endMinutes >= roundStartTime + ROUND_DURATION) {
                    playableRounds++;
                }
            }
        } else {
            // Finally, if the hour difference IS 0. Then we only need to take into consideration
            // the start and end minutes.
            for (int roundStartTime : ROUND_START_TIMES) {
                if (startMinutes <= roundStartTime && endMinutes >= roundStartTime + ROUND_DURATION) {
                    playableRounds++;
                }
            }
        }

        return playableRounds;
    }
}
