// Leetcode 9 - PalindromNumber
// Tags: Easy, Math
// Determine whether an integer is a palindrome. Do this without extra space.
// params: int number
// return: boolean true || false
// basically have two different pointers, one at the beginning and another at the end.
// iterate through the given number and return false if the number (pointed by the first pointer) does not equal the number (pointed by the second one);
// time complexity
// T(n) = O(1) + O(1) + ... n times ... + O(1)
// T(n) = n * O(1) = O(n)
// Challenge check if the a single list is a palindrome (will explained in next practice)

import java.io.*;
class Test {

    private static boolean isPalindrom(int num) {
        if (num < 0 || (num != 0 && num % 10 == 0)) return false;
        for (int i = 0, j = String.valueOf(Math.abs((long) num)).length() - i - 1; i < j; i++, j--) {
            if (String.valueOf(Math.abs((long) num)).charAt(i) != String.valueOf(Math.abs((long) num)).charAt(j)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        int testNumber = 12321;
        if (isPalindrom(testNumber)) {
            System.out.println(testNumber + " is a palindrom number.");
        } else {
            System.out.println(testNumber + " is not a palindrom number.");
        }
    }
}
