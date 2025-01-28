package p20xxx.p20044;

// 제목 : Project Teams

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int students = 2 * n;
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int[] scores = new int[students];

        for (int i = 0; i < students; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(scores);
        int min = 200_001;

        for (int i = 0; i < n; i++) {
            int sum = scores[i] + scores[students - i - 1];
            min = Math.min(min, sum);
        }

        System.out.println(min);
    }
}
