package p10xxx.p10825;

// 제목 : 국영수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] scores = new String[n][4];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            scores[i][0] = st.nextToken();
            scores[i][1] = st.nextToken();
            scores[i][2] = st.nextToken();
            scores[i][3] = st.nextToken();
        }

        br.close();
        Arrays.sort(scores, (score1, score2) -> {
            int difference = Integer.parseInt(score2[1]) - Integer.parseInt(score1[1]);

            if (difference == 0) {
                difference = Integer.parseInt(score1[2]) - Integer.parseInt(score2[2]);
            }

            if (difference == 0) {
                difference = Integer.parseInt(score2[3]) - Integer.parseInt(score1[3]);
            }

            if (difference == 0) {
                difference = score1[0].compareTo(score2[0]);
            }

            return difference;
        });

        StringBuilder sb = new StringBuilder();

        for (String[] score : scores) {
            sb.append(score[0]).append("\n");
        }

        System.out.print(sb);
    }
}
