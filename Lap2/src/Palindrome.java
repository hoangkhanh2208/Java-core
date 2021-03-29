public class Palindrome {
    public static void main(String[] args) {
        
        String exampleString = "abba";
        int startIndex = 0;
        int endIndex = exampleString.length() - 1;
        boolean isPalindrome = true;
        while (startIndex < endIndex) {
            if (exampleString.charAt(startIndex) != exampleString.charAt(endIndex)) {
                isPalindrome = false;
                break;
            }
            startIndex++;
            endIndex--;
        }
        
        if (isPalindrome) {
            System.out.println(exampleString + " is a palindrome");
        } else {
            System.out.println(exampleString + " is not a palindrome");
        }
    }
}
