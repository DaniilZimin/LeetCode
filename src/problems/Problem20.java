package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem20 {

    public static void main(String[] args) {

        String s = "((((((((({}(){{(())}}[])))))))))";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();

        int index = -1;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
                index++;
            }

            if (stack.isEmpty() && (c == ')' || c == '}' || c == ']')) {
                return false;
            }

            if (c == ')') {
                if (stack.get(index) == '(') {
                    stack.remove(index);
                    index--;
                } else return false;
            }

            if (c == ']') {
                if (stack.get(index) == '[') {
                    stack.remove(index);
                    index--;
                } else return false;
            }

            if (c == '}') {
                if (stack.get(index) == '{') {
                    stack.remove(index);
                    index--;
                } else return false;
            }
        }
        return stack.isEmpty();
    }
}
