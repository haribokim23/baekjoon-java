package p02xxx.p02096;

// 제목 : 내려가기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] currentMax = new int[3];
        int[] currentMin = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int column = 0; column < 3; column++) {
            int score = Integer.parseInt(st.nextToken());
            currentMax[column] = score;
            currentMin[column] = score;
        }

        while (--n > 0) {
            st = new StringTokenizer(br.readLine());
            int[] nextMax = new int[3];
            int[] nextMin = new int[3];

            for (int column = 0; column < 3; column++) {
                int score = Integer.parseInt(st.nextToken());
                nextMax[column] = currentMax[column] + score;
                nextMin[column] = currentMin[column] + score;

                int leftColumn = column - 1;

                if (leftColumn >= 0) {
                    nextMax[column] = Math.max(nextMax[column], currentMax[leftColumn] + score);
                    nextMin[column] = Math.min(nextMin[column], currentMin[leftColumn] + score);
                }

                int rightColumn = column + 1;

                if (rightColumn < 3) {
                    nextMax[column] = Math.max(nextMax[column], currentMax[rightColumn] + score);
                    nextMin[column] = Math.min(nextMin[column], currentMin[rightColumn] + score);
                }
            }

            currentMax = nextMax;
            currentMin = nextMin;
        }

        br.close();
        int maxScore = currentMax[0];
        int minScore = currentMin[0];

        for (int index = 1; index < 3; index++) {
            maxScore = Math.max(maxScore, currentMax[index]);
            minScore = Math.min(minScore, currentMin[index]);
        }

        System.out.println(maxScore + " " + minScore);
    }
}
