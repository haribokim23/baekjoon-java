package p09xxx.p09935;

// 제목 : 문자열 폭발

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String bomb = br.readLine();
        br.close();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));

            if (stack.size() < bomb.length()) {
                continue;
            }

            boolean explode = true;

            for (int j = 0; j < bomb.length(); j++) {
                if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
                    explode = false;
                    break;
                }
            }

            if (explode) {
                for (int j = 0; j < bomb.length(); j++) {
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            System.out.println("FRULA");
        } else {
            StringBuilder sb = new StringBuilder();

            while (!stack.empty()) {
                sb.append(stack.pop());
            }

            System.out.println(sb.reverse());
        }
    }
}
