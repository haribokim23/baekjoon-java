package p14xxx.p14888;

// 제목 : 연산자 끼워넣기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int[] operand;
    private static int[] operator;
    private static int[] equation;
    private static int max = -1000000000;
    private static int min = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        operand = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            operand[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        br.close();
        operator = new int[n - 1];
        equation = new int[n - 1];

        for (int i = 0, index = 0; i < 4; i++) {
            int count = Integer.parseInt(st.nextToken());

            for (int j = 0; j < count; j++) {
                operator[index++] = i;
            }
        }

        backtrack(0);
        System.out.println(max + "\n" + min);
    }

    private static void backtrack(int index) {
        if (index == n - 1) {
            int result = operand[0];

            for (int i = 0; i < n - 1; i++) {
                switch (operator[equation[i]]) {
                    case 0:
                        result += operand[i + 1];
                        break;
                    case 1:
                        result -= operand[i + 1];
                        break;
                    case 2:
                        result *= operand[i + 1];
                        break;
                    case 3:
                        result /= operand[i + 1];
                        break;
                }
            }

            if (result > max) {
                max = result;
            }

            if (result < min) {
                min = result;
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                boolean isValid = true;

                for (int j = 0; j < index; j++) {
                    if (equation[j] == i) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    equation[index] = i;
                    backtrack(index + 1);
                }
            }
        }
    }
}
