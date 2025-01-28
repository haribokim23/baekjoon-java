package p15xxx.p15656;

// 제목 : N과 M (7)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int m;
    private static int[] numbers;
    private static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);
        sb = new StringBuilder();
        recurse(0, new int[m]);
        System.out.print(sb);
    }

    private static void recurse(int index, int[] array) {
        if (index == m) {
            for (int i : array) {
                sb.append(i).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            array[index] = numbers[i];
            recurse(index + 1, array);
        }
    }
}
