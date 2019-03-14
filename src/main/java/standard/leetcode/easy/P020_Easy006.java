package standard.leetcode.easy;

import java.util.Stack;

/**
 * @author:xwh
 * @date 2019/3/14 9:47
 */
//括号匹配 栈
public class P020_Easy006 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        } else if (("").equals(s)) {
            return true;
        } else {
            Stack<Character> stack = new Stack();
            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                if (temp == '(') {
                    stack.push(temp);
                } else if (temp == ')') {
                    if (stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                } else if (temp == '{') {
                    stack.push(temp);
                } else if (temp == '}') {
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                } else if (temp == '[') {
                    stack.push(temp);
                } else if (temp == ']') {
                    if (stack.empty() || stack.pop() != '[') {
                        return false;
                    }

                }
            }
            if (stack.empty()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String string = "){";
//        String string = "{[(()]}";
//        String string = "{[())]}";
//        String string = "{[(()]}";
//        String string = "()[]{}";//true


        System.out.println(new P020_Easy006().isValid(string));

//        for (int i = 0; i < s.length() / 2; i++) {
//            char front = s.charAt(i);
//            char later = s.charAt(s.length() - i - 1);
//            if (front == '{' && later != '}') {
//                return false;
//            } else if (front == '(' && later != ')') {
//                return false;
//            } else if (front == '[' && later != ']') {
//                return false;
//            }
//        }
//        return true;
    }
}
