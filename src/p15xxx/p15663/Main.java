package p15xxx.p15663;

// 제목 : N과 M (9)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int m;
    private static int[] counts;
    private static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        counts = new int[10001];
        st = new StringTokenizer(br.readLine());
        br.close();

        for (int count = 0; count < n; count++) {
            counts[Integer.parseInt(st.nextToken())]++;
        }

        sb = new StringBuilder();
        backtrack(0, new int[m]);
        System.out.print(sb);
    }

    private static void backtrack(int elements, int[] array) {
        if (elements == m) {
            for (int element : array) {
                sb.append(element).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int number = 0; number < 10001; number++) {
            int count = counts[number];

            if (count == 0) {
                continue;
            }

            counts[number]--;
            array[elements] = number;
            backtrack(elements + 1, array);
            counts[number]++;
        }
    }
}
