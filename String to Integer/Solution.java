class Solution {
    public int myAtoi(String s) {
        int i = 0, length = s.length(), sign = 1, result = 0;

        // Handle the empty string or string with only spaces
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // Ignore leading whitespaces
        while (i < length && s.charAt(i) == ' ') {
            i++;
        }

        // If the string only contains spaces
        if (i == length) {
            return 0;
        }

        // Check for sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '+') ? 1 : -1;
            i++;
        }

        // Process digits
        while (i < length && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Handle overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
