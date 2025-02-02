package p10xxx.p10799;

// 제목 : 쇠막대기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = br.readLine();
        br.close();
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < parenthesis.length(); i++) {
            char character = parenthesis.charAt(i);

            if (character == '(') {
                stack.push(character);
                continue;
            }

            stack.pop();
            count += parenthesis.charAt(i - 1) == '(' ? stack.size() : 1;
        }

        System.out.println(count);
    }
}
