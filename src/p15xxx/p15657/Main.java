package p15xxx.p15657;

// 제목 : N과 M (8)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int m;
    private static int[] elements;
    private static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();

        elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(elements);
        sb = new StringBuilder();
        backtrack(0, new int[m]);
        System.out.print(sb);
    }

    private static void backtrack(int index, int[] digits) {
        if (index == m) {
            for (int digit : digits) {
                sb.append(digit).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int element : elements) {
            boolean isValid = true;

            for (int j = 0; j < index; j++) {
                if (element < digits[j]) {
                    isValid = false;
                    break;
                }
            }

            if (!isValid) {
                continue;
            }

            digits[index] = element;
            backtrack(index + 1, digits);
        }
    }
}
