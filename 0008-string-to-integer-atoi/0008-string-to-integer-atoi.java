public class Solution {
    public int myAtoi(String s) {
        // Constants for 32-bit signed integer limits
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;

        int i = 0, sum = 0;
        int minus = 0;
        boolean numStarted = false;
        int n = s.length();

        // 1. Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Handle optional sign
        if (i < n) {
            char c = s.charAt(i);
            if (c == '-') {
                minus = 1;
                i++;
            } else if (c == '+') {
                i++;
            }
        }

        // 3. Parse digits
        while (i < n) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                break;
            }
            numStarted = true;
            int digit = c - '0';

            // Correct overflow check before adding the digit
            if (sum > (INT_MAX - digit) / 10) {
                return (minus == 1) ? INT_MIN : INT_MAX;
            }

            sum = sum * 10 + digit;
            i++;
        }

        // 4. If no digits were read, return 0
        if (!numStarted) {
            return 0;
        }

        // 5. Apply sign and return the result
        return (minus == 1) ? -sum : sum;
    }
}
