package tasks;

import java.util.HashSet;

public class FindFirstRepeatingCharacter {

    public static void main(String[] args) throws Exception {
        String str = "find first repeated char";

        System.out.println(firstRepeatingChar(str));
    }

    public static char firstRepeatingChar(String str) throws Exception {
        char [] chars = str.toCharArray();
        HashSet <Character> charSet = new HashSet<>();

        for (char ch: chars) {
            if (!charSet.add(ch)) {
                return ch;
            }
        }
        throw new Exception("All characters are unique!");
    }

}
