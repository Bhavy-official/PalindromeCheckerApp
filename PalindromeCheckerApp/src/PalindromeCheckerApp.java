public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "A man a plan a canal Panama";
        String normalized = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = isPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a Palindrome (case & spaces ignored).");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}