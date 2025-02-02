package p15xxx.p15650;

// 제목 : N과 M (2)

import java.io.IOException;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = System.in.read() - 48;
        System.in.read();
        int m = System.in.read() - 48;

        backtrack(n, m, 1, new int[m]);
        System.out.print(sb);
    }

    private static void backtrack(int n, int m, int digit, int[] arr) {
        for (int i = 1; i <= n; i++) {
            boolean ascending = true;

            for (int j = 1; j < digit; j++) {
                if (i <= arr[j - 1]) {
                    ascending = false;
                    break;
                }
            }

            if (ascending) {
                arr[digit - 1] = i;

                if (digit == m) {
                    for (int j : arr) {
                        sb.append(j).append(" ");
                    }

                    sb.append("\n");
                } else {
                    backtrack(n, m, digit + 1, arr);
                }
            }
        }
    }
}
