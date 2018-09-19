
public class Combinations {

    public static void main(String[] args) {

        // Create an alphabet to work with
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
        // Find all possible combinations of this alphabet in the string size of 3
        StringExcersise.possibleStrings(3, alphabet, "");
        StringExcersise.possibleStrings(4, alphabet, "");
        StringExcersise.possibleStrings(5, alphabet, "");
        StringExcersise.possibleStrings(6, alphabet, "");
        StringExcersise.possibleStrings(7, alphabet, "");
        StringExcersise.possibleStrings(8, alphabet, "");
        StringExcersise.possibleStrings(9, alphabet, "");
        StringExcersise.possibleStrings(10, alphabet, "");
    }

}

class StringExcersise {

    public static void possibleStrings(int maxLength, char[] alphabet, String curr) {

        // If the current string has reached it's maximum length
        if (curr.length() == maxLength) {
            System.out.println(curr);

            // Else add each letter from the alphabet to new strings and process these new strings again
        } else {
            for (int i = 0; i < alphabet.length; i++) {
                String oldCurr = curr;
                curr += alphabet[i];
                possibleStrings(maxLength, alphabet, curr);
                curr = oldCurr;
            }
        }
    }
}
