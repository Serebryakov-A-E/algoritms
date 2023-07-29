package AlgorithmicpProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses main = new ValidParentheses();
        System.out.println(main.isValid("([)]"));
    }
    private final Map<Character, Character> map = new HashMap<>();
    {
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (map.get(stack.peek()) == s.charAt(i)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */