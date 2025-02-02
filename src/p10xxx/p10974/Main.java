package p10xxx.p10974;

// 제목 : 모든 순열

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int n;
    private static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();
        sb = new StringBuilder();
        backtrack(0, new boolean[n], new int[n]);
        System.out.print(sb);
    }

    private static void backtrack(int index, boolean[] used, int[] elements) {
        if (index == n) {
            for (int element : elements) {
                sb.append(element).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!used[i - 1]) {
                used[i - 1] = true;
                elements[index] = i;
                backtrack(index + 1, used, elements);
                used[i - 1] = false;
            }
        }
    }
}
