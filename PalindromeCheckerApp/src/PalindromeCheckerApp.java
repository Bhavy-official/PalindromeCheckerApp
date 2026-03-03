public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        boolean isPalindrome = isPalindromeRecursive(word, 0, word.length() - 1);
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }

    public static boolean isPalindromeRecursive(String word, int start, int end) {
        if (start >= end) return true;
        if (word.charAt(start) != word.charAt(end)) return false;
        return isPalindromeRecursive(word, start + 1, end - 1);
    }
}