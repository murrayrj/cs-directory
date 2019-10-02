/**
 * An instance contains static methods for assignment A2
 */
public class CS2110Assignment2 {

    /* NOTE: You will have to rely on methods that are declared in class String.
     * Visit docs.oracle.com/javase/7/docs/api/java/lang/String.html, scroll
     * down to the Method Summary, and peruse the available methods.
     * Oft-used ones are charAt, length(), trim, substring, indexOf, isEmpty,
     * lastIndexOf, startsWith, endsWith, split.
     *
     * In all these methods, you can assume that String parameters are not null. */

    /**
     * Strings s and s1 are not null. Return true iff s contains exactly one occurrence
     * of s2.
     * <p>
     * Examples: For s = "ab" and s2 = "bb", return false
     * For s = "abbb" and s2 = "bb", return true.
     * For s = "abbbb" and s2 = "bb", return false.
     */
    public static boolean containsOne(String s, String s2) {
        /** Do not use a loop or recursion. Instead, look through the
         * methods of class String and see how you can tell that the first
         * and last occurrences of s2 in s are the same. Be sure you handle
         * correctly the case that s2 does not occur in s. */
        return false;
    }

    /**
     * String s consists of a first name followed by a last name. The two names are
     * separated by 1 or more blanks. There may be blank characters at the
     * beginning of s and at the end of s.
     * <p>
     * Examples: For s = "    David Gries"  return "Gries, David"
     * For s = "Doug       James " return "James, Doug"
     */
    public static String fixName(String s) {
        /* As you know, String is a class. An object of class String is immutable
         * --you cannot change the sequence of chars that it contains.
         *
         * Do NOT use a loop or recursion. Use only if-statements,
         * assignments, and return statements.
         *
         * Finally, this method can be written using an oft-used pattern:
         *   1. Break the string into its parts
         *   2. Build the result from the parts. */

        return null;
    }

    /**
     * String s contains a person's first name, last name, and possibly a middle name
     * between them. There may be any number of blanks at the beginning and end
     * of s, but between each pair of names there is exactly one blank.
     * <p>
     * Return a String containing the person's initials.
     * <p>
     * Examples: For s = "    David Joseph Gries" return "DJG".
     * For s = "Doug James", return "DJ";
     */
    public static String getInitials(String s) {
        // Do not use a loop or recursion.

        return null;
    }

    /**
     * Return a string that is s but with all lowercase vowels (a, e, i, o, u)
     * replaced by asterisks *.
     * <p>
     * Examples: For s = "Minecraft" return "M*n*cr*ft".
     * For s = "Alan Turing" return "Al*n T*r*ng".
     */
    public static String replaceVowels(String s) {
        // This can be done with five statements. No loop is required.
        // Look for a suitable String function that replaces things.

        return null;
    }

    /**
     * Return a string that is s but with all lowercase and uppercase
     * vowels (a, e, i, o, u, A, E, I, O, U) replaced by asterisks *.
     * <p>
     * Examples: For s = "Minecraft" return "M*n*cr*ft".
     * For s = "Alan Turing" return "*l*n T*r*ng".
     */
    public static String replaceAllVowels(String s) {
        // Writing a long list of 10 statements is not so good. Instead, write
        // a loop that sequences through the characters in the following String
        // vowels, replacing each one in s.

        // A for-loop to loop through a range b..c of integers can look like this:
        //    for (int i= b; i <= c ; i= i+1) {
        //        ...
        //    }

        return null;
    }

    /**
     * String s is written in a form that looks something like this: "b3c1b5x2a0".
     * For this s, we want to return the decompressed string "bbbcbbbbbxx".
     * More formally, s is in "compressed form", which means that it consists
     * of a sequence of characters that are NOT digits 0..9 with each character
     * followed by a digit; the digit indicates how many times that character
     * should appear. Return the uncompressed version of s.
     */
    public static String decompress(String s) {
        // To produce the integer that is in String s1 use function
        // Integer.parseInt(s1). Remember that a character c is not a String,
        // and to change c into a String you may have to catenate it with the
        // empty String.
        // This function will probably need a loop within a loop

        return null;
    }
}