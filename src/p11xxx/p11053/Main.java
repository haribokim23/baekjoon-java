package p11xxx.p11053;

// 제목 : 가장 긴 증가하는 부분 수열

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[][] memo = new int[2][n + 1];

        for (int i = 1, maxLength = 0; i <= n; i++) {
            int element = Integer.parseInt(st.nextToken());
            int length = 1;

            for (int j = maxLength; j > 0; j--) {
                if (element > memo[1][j]) {
                    length += j;
                    break;
                }
            }

            memo[0][i] = length;

            if (length > maxLength) {
                maxLength = length;
                memo[1][length] = element;
            } else if (element < memo[1][length]) {
                memo[1][length] = element;
            }
        }

        int maxLength = 0;

        for (int length : memo[0]) {
            if (length > maxLength) {
                maxLength = length;
            }
        }

        System.out.println(maxLength);
    }
}
