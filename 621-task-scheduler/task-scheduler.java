import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks) freq[c - 'A']++;

        Arrays.sort(freq);
        int maxFreq = freq[25];
        int holes = (maxFreq - 1) * n; 

        for (int i = 24; i >= 0 && holes > 0; i--) {
            holes -= Math.min(freq[i], maxFreq - 1);
        }

        holes = Math.max(0, holes); // no negative holes
        return tasks.length + holes;
    }
}