package p02xxx.p02579;

// 제목 : 계단 오르기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int steps = Integer.parseInt(br.readLine());
        int[] scores = new int[steps];

        for (int i = 0; i < steps; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        if (steps == 1) {
            System.out.println(scores[0]);
            return;
        }

        int[][] memo = new int[steps][2];
        memo[0][0] = scores[0];
        memo[1][0] = memo[0][0] + scores[1];
        memo[1][1] = scores[1];

        for (int step = 2; step < steps; step++) {
            int score = scores[step];

            if (memo[step - 2][0] == 0) {
                memo[step][0] = memo[step - 1][0] + score;
            }

            if (memo[step - 1][1] != 0) {
                memo[step][0] = Math.max(memo[step][0], memo[step - 1][1] + score);
            }

            memo[step][1] = Math.max(memo[step - 2][0], memo[step - 2][1]) + score;
        }

        System.out.println(Math.max(memo[steps - 1][0], memo[steps - 1][1]));
    }
}
