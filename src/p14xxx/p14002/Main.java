package p14xxx.p14002;

// 제목 : 가장 긴 증가하는 부분 수열 4

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[][] minArrays = new int[n + 1][];

        for (int i = 1; i <= n; i++) {
            minArrays[i] = new int[i];
        }

        minArrays[1][0] = 1_000_000_000;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            int element = Integer.parseInt(st.nextToken());

            if (element <= minArrays[1][0]) {
                minArrays[1][0] = element;
                continue;
            }

            int minValue = minArrays[maxLength][maxLength - 1];

            if (element == minValue) {
                continue;
            }

            if (element > minValue) {
                System.arraycopy(minArrays[maxLength], 0, minArrays[maxLength + 1], 0, maxLength);
                minArrays[++maxLength][maxLength - 1] = element;
                continue;
            }

            int length = 1;

            for (int last = maxLength - 1; length <= last; ) {
                int middle = (length + last) / 2;
                int middleValue = minArrays[middle][middle - 1];

                if (element == middleValue) {
                    length = middle;
                    break;
                }

                if (element > middleValue) {
                    length = middle + 1;
                } else {
                    last = middle - 1;
                }
            }

            if (element < minArrays[length][length - 1]) {
                System.arraycopy(minArrays[length - 1], 0, minArrays[length], 0, length - 1);
                minArrays[length][length - 1] = element;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(maxLength).append("\n");

        for (int i = 0; i < maxLength; i++) {
            sb.append(minArrays[maxLength][i]).append(" ");
        }

        System.out.println(sb);
    }
}
