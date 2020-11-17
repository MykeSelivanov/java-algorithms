package tasks;

import utils.CustomStack;

import java.util.Scanner;

public class ReverseStringWithStack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(reverseString(str));

    }

    public static String reverseString(String strToReverse) {

        CustomStack <Character> charStack = new CustomStack<>();
        String result = "";
        for (int i = 0; i < strToReverse.length(); i++){
            charStack.push(strToReverse.charAt(i));
        }
        for (int i = 0; i < strToReverse.length(); i ++) {
            result += charStack.pop();
        }
        return result;
    }

}
