package p12xxx.p12789;

// 제목 : 도키도키 간식드리미

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int nextNumber = 1;
        Stack<Integer> stack = new Stack<>();

        while (st.hasMoreTokens()) {
            int currentNumber = Integer.parseInt(st.nextToken());

            if (currentNumber != nextNumber) {
                stack.push(currentNumber);
                continue;
            }

            nextNumber++;

            while (!stack.isEmpty() && stack.peek() == nextNumber) {
                stack.pop();
                nextNumber++;
            }
        }

        System.out.println(stack.isEmpty() ? "Nice" : "Sad");
    }
}
