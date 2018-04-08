public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s == null) {
            return true;
        }

        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (!isValid(s.charAt(start)) && start != s.length() - 1) {
                start++;
            }

            while (!isValid(s.charAt(end)) && end != 0 ) {
                end--;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)) && (start != s.length() - 1 && end != 0)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    private boolean isValid(Character c) {
        if (Character.isLetter(c) || Character.isDigit(c)) {
            return true;
        }
        return false;
    }
}
