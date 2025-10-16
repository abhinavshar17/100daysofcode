import java.util.*;

class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] freq = new int[value];
        for (int n : nums) {
            int r = ((n % value) + value) % value; // handle negative
            freq[r]++;
        }

        int i = 0;
        while (true) {
            int r = i % value; //konsa box use kro gyee
            if (freq[r] == 0)
             return i; //agar box is empty hai vohi return krdo 
            freq[r]--;  // ek coin use kar lo0
            i++;
        }
    }
}