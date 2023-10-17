public class StringAssignment1 {
    public static void main(String[] args) {
        String originalString = "Welcome to Java World";

        char charAt5 = originalString.charAt(4);
        System.out.println("Character at 5th position: " + charAt5);

        boolean isEqualToWelcome = originalString.toLowerCase().startsWith("welcome");
        System.out.println("Is equal to 'Welcome' (case-insensitive): " + isEqualToWelcome);

        String concatenatedString = originalString + " - Let us learn";
        System.out.println("Concatenated String: " + concatenatedString);

        int indexOfA = originalString.indexOf('a');
        System.out.println("Position of the first 'a': " + indexOfA);

        String replacedString = originalString.replace('a', 'e');
        System.out.println("String after replacing 'a' with 'e': " + replacedString);

        String substringFrom4To10 = originalString.substring(3, 10);
        System.out.println("Substring between 4th and 10th positions: " + substringFrom4To10);

        String lowercaseString = originalString.toLowerCase();
        System.out.println("Lowercase String: " + lowercaseString);
    }
}
