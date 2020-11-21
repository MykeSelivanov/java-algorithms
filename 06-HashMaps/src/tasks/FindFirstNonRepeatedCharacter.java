package tasks;

import java.util.HashMap;

public class FindFirstNonRepeatedCharacter {

    public static void main(String[] args) throws Exception {
        String str = "check this string for the first unique char";

        System.out.println(findFirstNonRepeatedChar(str));

    }

    public static char findFirstNonRepeatedChar(String str) throws Exception {
        var chars = str.toCharArray();
        HashMap <Character, Integer> charMap = new HashMap<>();

        for (var ch: chars) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch,charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        for (var ch: chars) {
            if (charMap.get(ch) == 1) return ch;
        }

        throw new Exception("There is no unique characters in this String!");
    }

}
