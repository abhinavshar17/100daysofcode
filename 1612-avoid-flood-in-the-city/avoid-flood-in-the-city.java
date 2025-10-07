import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];                   // Output array
        Map<Integer, Integer> lastRain = new HashMap<>(); // lake → last rain day
        TreeSet<Integer> dryDays = new TreeSet<>();       // indices of dry days

        for (int i = 0; i < n; i++) {             // Loop har day ke liye
            if (rains[i] > 0) {                   // Rain day
                int lake = rains[i];
                ans[i] = -1;                       // raining day → -1

                if (lastRain.containsKey(lake)) {  // Lake already full?
                    Integer dryDay = dryDays.higher(lastRain.get(lake)); // Next dry day after last rain
                    if (dryDay == null) return new int[0]; // No dry day → flood unavoidable
                    ans[dryDay] = lake;           // Dry lake on that day
                    dryDays.remove(dryDay);       // Remove that dry day from calendar
                }

                lastRain.put(lake, i);             // Update last rain day of this lake
            } else {                               // Dry day
                dryDays.add(i);                     // Store dry day index
                ans[i] = 1;                         // Temporary, will update if needed
            }
        }

        return ans;                                // Return final answer
    }
}
