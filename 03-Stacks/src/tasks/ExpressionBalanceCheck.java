package tasks;

import utils.CustomStack;

import java.util.Scanner;

// TODO Check if the expressions are balanced with the opening and closing delimiters

public class ExpressionBalanceCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String expression = sc.next();

        System.out.println(expressionBalance(expression));

    }

    public static boolean expressionBalance(String expression){

        CustomStack <Character> expressionStack = new CustomStack<>();

        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i) == '(' || expression.charAt(i) == '[' || expression.charAt(i) == '{' ||
                    expression.charAt(i) == ')' || expression.charAt(i) == ']' || expression.charAt(i) == '}') {
                char match;
                switch (expression.charAt(i)) {
                    case '(':
                    case '{':
                    case '[':
                        expressionStack.push(expression.charAt(i));
                        break;
                    case ')':
                        if (expressionStack.isEmpty()) return false;
                        match = expressionStack.pop();
                        if (match == '{' || match == '[') return false;
                        break;
                    case ']':
                        if (expressionStack.isEmpty()) return false;
                        match = expressionStack.pop();
                        if (match == '{' || match == '(') return false;
                        break;
                    case '}':
                        if (expressionStack.isEmpty()) return false;
                        match = expressionStack.pop();
                        if (match == '(' || match == '[') return false;
                        break;
                }
            }
        }
        return (expressionStack.isEmpty());
    }
}
