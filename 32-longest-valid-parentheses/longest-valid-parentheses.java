class Solution {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0, max = 0;

        // Left to Right scan
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                left++;
            else
                right++;

            if (left == right)
                max = Math.max(max, left * 2);
            else if (right > left)
                left = right = 0;
        }

        left = right = 0;

        // Right to Left scan
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(')
                left++;
            else
                right++;

            if (left == right)
                max = Math.max(max, left * 2);
            else if (left > right)
                left = right = 0;
        }

        return max;
    }
}
