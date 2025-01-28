package p15xxx.p15666;

// 제목 : N과 M (12)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int m;
    private static boolean[] exist;
    private static int[] array;
    private static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        exist = new boolean[10001];
        st = new StringTokenizer(br.readLine());
        br.close();

        for (int count = 0; count < n; count++) {
            exist[Integer.parseInt(st.nextToken())] = true;
        }

        array = new int[m];
        sb = new StringBuilder();
        backtrack(0, 0);
        System.out.print(sb);
    }

    private static void backtrack(int index, int previous) {
        if (index == m) {
            for (int element : array) {
                sb.append(element).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int number = previous; number < 10001; number++) {
            if (!exist[number]) {
                continue;
            }

            array[index] = number;
            backtrack(index + 1, number);
        }
    }
}
