package p02xxx.p02511;

// 제목 : 카드놀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer aCard = new StringTokenizer(br.readLine()), bCard = new StringTokenizer(
                br.readLine());
        br.close();
        int aScore = 0, bScore = 0, last = -1;

        for (int i = 0; i < 10; i++) {
            int result = Integer.parseInt(aCard.nextToken()) - Integer.parseInt(bCard.nextToken());

            if (result > 0) {
                aScore += 3;
                last = 0;
            } else if (result < 0) {
                bScore += 3;
                last = 1;
            } else {
                aScore++;
                bScore++;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(aScore).append(" ").append(bScore).append("\n");

        if (aScore > bScore) {
            sb.append("A");
        } else if (bScore > aScore) {
            sb.append("B");
        } else {
            if (last == 0) {
                sb.append("A");
            } else if (last == 1) {
                sb.append("B");
            } else {
                sb.append("D");
            }
        }

        System.out.println(sb);
    }
}
