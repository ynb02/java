package lab01;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        String str = "({[]})";
        System.out.println(isCorrect(str));
    }

    static boolean isCorrect(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char last = stack.pop();
                if ((c == ')' && last != '(')
                        || (c == '}' && last != '{')
                        || (c == ']' && last != '[')) return false;
            }
        }
        return stack.isEmpty();
    }
}