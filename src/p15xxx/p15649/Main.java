package p15xxx.p15649;

// 제목 : N과 M (1)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];

        backtracking(N, M, 1, arr);

        System.out.print(sb);
    }

    private static void backtracking(int N, int M, int digit, int[] arr) {
        for (int i = 1; i <= N; i++) {
            boolean isSame = false;

            for (int j = 1; j < digit; j++) {
                if (i == arr[j - 1]) {
                    isSame = true;
                    break;
                }
            }

            if (isSame) {
                continue;
            } else {
                arr[digit - 1] = i;

                if (digit == M) {
                    for (int j : arr) {
                        sb.append(j).append(" ");
                    }

                    sb.append("\n");
                } else {
                    backtracking(N, M, digit + 1, arr);
                }
            }
        }
    }
}
