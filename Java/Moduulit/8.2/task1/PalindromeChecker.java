public class PalindromeChecker {
    
    public boolean isPalindrome(String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();

        if (str.equals(null)) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
