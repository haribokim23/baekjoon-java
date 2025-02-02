package p02xxx.p02346;

// 제목 : 풍선 터뜨리기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int[] papers = new int[n];

        for (int index = 0; index < n; index++) {
            papers[index] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int balloons = n, index = 0; balloons > 0; balloons--) {
            sb.append(index + 1).append(" ");

            if (balloons == 1) {
                break;
            }

            int paper = papers[index];
            papers[index] = 0;

            if (paper < 0) {
                while (paper++ < 0) {
                    do {
                        if (--index == -1) {
                            index = n - 1;
                        }
                    } while (papers[index] == 0);
                }
            } else {
                while (paper-- > 0) {
                    do {
                        if (++index == n) {
                            index = 0;
                        }
                    } while (papers[index] == 0);
                }
            }
        }

        System.out.println(sb);
    }
}
