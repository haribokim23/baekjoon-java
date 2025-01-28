package p15xxx.p15651;

// 제목 : N과 M (3)

import java.io.IOException;

public class Main {
    private static StringBuilder sb;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        int n = System.in.read() - 48;
        System.in.read();
        int m = System.in.read() - 48;

        sb = new StringBuilder();
        arr = new int[m];

        backtrack(n, m, 0);
        System.out.print(sb);
    }

    private static void backtrack(int n, int m, int index) {
        for (int i = 1; i <= n; i++) {
            arr[index] = i;

            if (index == m - 1) {
                for (int j : arr) {
                    sb.append(Integer.toString(j).concat(" "));
                }

                sb.append("\n");
            } else {
                backtrack(n, m, index + 1);
            }
        }
    }
}
