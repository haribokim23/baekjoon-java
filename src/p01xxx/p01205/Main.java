package p01xxx.p01205;

// 제목 : 등수 구하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(1);
            return;
        }

        int newScore = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        boolean found = false;
        int place = 1;
        int nextPlace = n + 1;

        for (int i = 1, previous = -1; i <= n; i++) {
            int score = Integer.parseInt(st.nextToken());

            if (score < newScore) {
                nextPlace = i;
                break;
            }

            if (score == newScore) {
                found = true;
            }

            if (score != previous) {
                place = i;
            }

            previous = score;
        }

        System.out.println(nextPlace <= p ? found ? place : nextPlace : -1);
    }
}
